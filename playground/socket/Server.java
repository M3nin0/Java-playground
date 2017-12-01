package socket;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Server implements Servidor, Runnable {
	private ServerSocket serverSocket;
	private Set<Socket> sockets;

	OutputStreamWriter osw;
	PrintWriter bw;

	/*
	 * Ao adicionar throws IOException estou informando ao Java que, quem irá tratar
	 * o erro será o método que chamou este ou, o método onde este método está sendo
	 * chamado
	 */
	public Server() throws IOException {
		serverSocket = new ServerSocket(PORTA);
		sockets = new HashSet<>();
		System.out.println("Server online");
	}

	public void enviaParaTodos(String msg) {
		for (Socket socket : sockets) {
			try {
				PrintStream output = new PrintStream(socket.getOutputStream());
				output.print(msg);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public void run() {
		while (true) {
			// Criar socket para cada socket que estou recebendo
			try {
				sockets.add(serverSocket.accept());
				System.out.println("Cliente conectado");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) throws IOException {
		Server server = new Server();
		Scanner scan = new Scanner(System.in);

		Thread threadServer = new Thread(server);
		threadServer.setPriority(8);

		threadServer.start();

		while (true) {
			System.out.println("Insira uma mensagem");
			String msg = scan.nextLine();

			server.enviaParaTodos(msg);
		}

	}
}
