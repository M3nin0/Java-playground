package thread;

/*
 * Veja que ao extender não necessáriamente fui obrigado 
 * a sobrescrever o método run() da thread
 */

public class Herança extends Thread {
	public void run() {
		for (Integer i = 0; i < 5000; i++)
			System.out.println(i);
	}
}
