package hash;

import java.util.HashSet;
import java.util.Set;

public class Converted {

	public static <E> void viewer(Set<E> es) {
		for (E e : es)
			System.out.println(e);
	}

	public static void main(String args[]) {
		Set<Integer> integers = new HashSet<>();

		for (int j = 10; j > 0; j--)
			integers.add(j);

		System.out.println("Lista \"pura \"");
		viewer(integers);

		// Convertendo o HashSet para ArrayList
		Object[] listIntegers = integers.toArray();
		
		System.out.println("HashSet To array\nPercorrendo com sentinela");
		for (int bb = 0; bb < listIntegers.length; bb++) {
			System.out.println(listIntegers[bb]);
		}
		
	}
}
