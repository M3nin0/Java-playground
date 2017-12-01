package thread;

public class MainRunnable {

	public static void main(String[] args) {
		Executor exec1 = new Executor(1);
		Executor exec2 = new Executor(2);

		// Definindo que este objeto terá menos prioridade
		// em uma escala que vai de 1 a 10
		Thread tt = new Thread(exec1);
		tt.setName("Thread 1");
		tt.setPriority(1);
		tt.start();

		Thread ty = new Thread(exec2);
		ty.setName("Thread 2");
		ty.setPriority(8);
		ty.start();
	}
}
