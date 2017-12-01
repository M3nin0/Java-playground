package comparador;

public class Carro implements Comparable<Carro> {

	private String marca;
	private String modelo;

	public Carro(String marca, String modelo) {
		this.marca = marca;
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	@Override
	public int compareTo(Carro o) {
		return this.modelo.compareTo(o.modelo);
	}
}
