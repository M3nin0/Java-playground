package hierarquia;

public class Funcionario extends Pessoa {

	private Double salario;
	private Double cargaHoraria;

	public Funcionario(String nome, String email, int idade, Double salario, Double cargaHoraria) {
		super(nome, email, idade);
		this.salario = salario;
		this.cargaHoraria = cargaHoraria;
	}

	public void lerTexto() {
		System.out.println("Texto que estou lendo");
	}

	public void pedirAumento() {
		System.out.println("Chefe posso te pedir um aumento ?");
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public Double getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(Double cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
}
