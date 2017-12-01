package thread;

public class Executor implements Runnable {

	private Integer id;

	public Executor(Integer id) {
		this.id = id;
	}

	@Override
	public void run() {
		for (Integer i = 0; i < 5000; i++) {
			System.out.println("ID: " + id  + ":"+ i);
		}
	}
}
