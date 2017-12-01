package caveTime;

import java.util.ArrayList;
import java.util.List;

public class Prime {
	public static void main(String[] args) {
		// Criando array com tipo por referência
		List<Float> lista = new ArrayList<>();
		lista.add(1.23f);

		// Criando array com tipo primitivo
		// List<Integer> listaDois = new ArrayList<>();

		// Ao tentar criar variáveis do tipo primitivo
		// foi constatado que não é possível sendo necessário criar
		// tipo por referência

		// Criando variáveis primitivas

		// Lista to autoboxing
		List<Integer> list = new ArrayList<>();

		int a = 123;
		int b = 321;

		// Testando o autoboxing
		list.add(a);
		list.add(b);

		int c = list.get(1);
		System.out.println(c);

		// Testando mais uma vez o autoboxing
		Integer dd = 4566;
		int tt = dd;
		System.out.println("\nTipo por referência passado para primitivo");
		System.out.println(tt);

		// Testando autoBoxing denovo
		double ty = 4.44;
		Double tty = ty;
		System.out.println("\nTipo primitivo em referência");
		System.out.println(tty);
	}
}
