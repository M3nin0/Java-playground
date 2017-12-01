package comparador;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Principal {

	public static void main(String[] args) {

		List<Carro> carros = new ArrayList<>();

		Carro c1 = new Carro("Gol", "Mitor");
		Carro c2 = new Carro("BWM", "Voador");

		carros.add(c2);
		carros.add(c1);
		carros.add(new Carro("Gol", "Amaroc"));

		System.out.println("Antes de ordenar");

		// Antes de ordenar
		Iterator<Carro> iteratorCarro = carros.iterator();
		while (iteratorCarro.hasNext()) {
			System.out.println(iteratorCarro.next().getModelo());
		}

		// Utilizando a classe Collections para ordenar os elementos
		// lembrando que a classe Collections ajuda a manipular coleções
		Collections.sort(carros);

		// Fiz a declaração do iterator novamente pois no loop acima
		// o iterator chegou ao "fim"
		Iterator<Carro> iterator = carros.iterator();
		System.out.println("\n\nApós a ordenação");
		while (iterator.hasNext()) {
			System.out.println(iterator.next().getModelo());
		}
	}
}
