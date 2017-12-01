package hash;

import java.util.HashSet;
import java.util.Set;

public class Hash {

	// O <T> antes do retorno indica o tipo que será usado
	public static <T> void visual(Set<T> lista) {
		for (T t : lista)
			System.out.println(t.toString());
	}

	public static void main(String[] args) {
		Set<Integer> sets = new HashSet<>();

//		int[] a = {2,1,5,7,3,7,1,8,9};
//		int a[] = {9,8,7,6,5,4,3,2,1};
		
//		for (int i = 0; i < a.length; i++)
//			sets.add(a[i]);
		
		for (int j = 5000; j > 0; j -= 3)
			sets.add(j * (int) (j / 2));
		
		visual(sets);
	}
}
