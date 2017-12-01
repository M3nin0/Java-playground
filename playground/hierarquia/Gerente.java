package hierarquia;

public class Gerente extends Funcionario {

	private String setor;

	public Gerente(String nome, String email, int idade, Double salario, Double cargaHoraria, String setor) {
		super(nome, email, idade, salario, cargaHoraria);
		this.setor = setor;
	}
	
	public void mandar() {
		System.out.println("Eu ordeno você a fazer isso!");
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}
}
