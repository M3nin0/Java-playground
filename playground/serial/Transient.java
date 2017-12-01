package serial;

public class Transient<T> {
	private String nome;

	// Vou necessitar específicar o <T> antes do retorno quando a classe não for de
	// tipo
	// genérico
	public String olar(T t) {
		return nome;
	}

	// Transient não funciona em métodos
}
