package socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class Client {
	private Socket socket;

	public Client() {
		try {
			socket = new Socket("127.0.0.1", 4044);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void recebe() {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));

			while (true) {
				System.out.println("Esperando");
				String readed = br.readLine();
				System.out.println(readed);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
