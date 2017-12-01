package interfaces;

public class Aviao implements Aviator {

	public void mostraAviao() {
		System.out.println("Avião de cor: " + corDaAsa + " está voando com escudo de " + valorEscudo + " atirando "
				+ quantidadeBalaPerSegundo + " balas por segundo");
	}

	@Override
	public <T> void abstece(T t) {
		// TODO Auto-generated method stub

	}

	@Override
	public void curvaArma() {
		// TODO Auto-generated method stub

	}

	@Override
	public void impacto() {
		// TODO Auto-generated method stub

	}

	@Override
	public void levantarVoo() {
		// TODO Auto-generated method stub

	}

	@Override
	public void pousar() {
		// TODO Auto-generated method stub

	}

}
