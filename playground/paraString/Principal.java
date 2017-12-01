package paraString;

public class Principal {
	public static void main(String[] args) { 
		Pessoa p1 = new Pessoa("Felipe", 20);
		Pessoa p2 = new Pessoa("Felipe", 23);
		
		System.out.println(p1.equals(p2));
	}
}
