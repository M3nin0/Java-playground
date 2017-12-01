package hierarquia;

public class Main {

	public static void main(String[] args) {
		// Criando gerente com os três tipos da hierarquia
		Pessoa g1 = new Gerente("José", "email", 31, 3200.0, 120.0, "nadolandia");
		Funcionario g2 = new Gerente("Alfredo", "email@doalfredo", 40, 5000.0, 80.0, "Dono da empresa");
		Gerente boss = new Gerente("Pedro", "pedro@email", 34, 12000.00, 5.0, "Rei");
		
		// Quanto mais genérico é o tipo definido, menos tenho acesso aos métodos
		// que estão abaixo na hierarquia
		g1.nadar();
		g2.lerTexto();
		boss.mandar();
	}
}
