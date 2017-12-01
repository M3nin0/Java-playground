package thread;

public class Final {
	public static void main(String args[]) {

		int idUm = 1;
		int idDois = 2;

		// Além das formas vistas
		// é possível criar thread fazendo uma instância

		// Thread com referência
		Thread tt = new Thread() {
			public void run() {
				for (int i = 0; i < 5000; i++)
					System.out.println("ID: " + idUm + ":" + i);
			}
		};
		tt.setPriority(1);

		// Thread sem referência
		// Criar thread sem referência, faz com que
		// eu perca certas ações com relação ao controle da thread
		new Thread() {
			public void run() {
				for (int i = 0; i < 10000; i++)
					System.out.println("ID: " + idDois + ":" + i);
			}
		}.start();
		tt.start();
	}
}
