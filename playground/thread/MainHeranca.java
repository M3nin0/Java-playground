package thread;

public class MainHeranca {
	public static void main(String[] args) {
		Herança her1 = new Herança();
		Herança her2 = new Herança();
		
		// Sem estar implementado o método run() este
		// pode ser chamado, porém nada acontece
		her1.start();
		
		//Após colocar para executar o her1.start()
		// o processo não ficará parado esperando
		// ele irá iniciar a thread e continuar o programa
		her2.start();
	}
}
