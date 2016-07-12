package fizzbuzz;

import java.util.HashSet;
import java.util.Set;

public class Main {

	public static int nod(int aa, int bb) {
		int a = Math.abs(aa);
		int b = Math.abs(bb);
		int oldR = b;
		int oldOldR = a;
		int r = oldR;

		if ((a == 0) && (b == 0)) {
			return Integer.MAX_VALUE; // let's suppose it's infinity
		}
		if (a == 0) {
			return b;
		}
		if (b == 0) {
			return a;
		}
		if (a == b) {
			return a;
		}

		if (a < b) {
			b = a + b;
			a = b - a;
			b = b - a;
		}

		do {
			System.out.println(oldOldR + "=" + oldR + "*" + (oldOldR / oldR) + "+" + (oldOldR % oldR));
			r = oldOldR % oldR;
			if (r != 0) {
				oldOldR = oldR;
				oldR = r;
			}

		} while (r > 0);
		return oldR;
	}

	public static int arrayNod(Integer[] numberArray) {
		System.out.print("New loop: ");
		for (Integer numb : numberArray) {
			System.out.print(numb + " ");
		}
		System.out.println();
		Set<Integer> pairNods = new HashSet<>();
		for (int i = 0; i < numberArray.length - 1; i++) {
			pairNods.add(nod(numberArray[i], numberArray[i + 1]));
		}
		if (pairNods.isEmpty()) {
			return 1;
		}
		if (pairNods.size() == 1) {
			return pairNods.iterator().next().intValue();
		}
		return arrayNod(pairNods.toArray(new Integer[pairNods.size()]));
	}

	public static void main(String[] args) {
		System.out.println(nod(-4566, 1368) + "\n");
		System.out.println(nod(30, 15) + "\n");
		System.out.println(nod(9, 45) + "\n");
		System.out.println(nod(-45, 17) + "\n");
		System.out.println(nod(-4566, 0) + "\n");
		System.out.println(nod(0, 0) + "\n");
		System.out.println(nod(1, 56) + "\n");

		Integer[] numbers = { 90, 30, 15, 45, 60, 15, 300, 600, 900 };
		System.out.println("\nNOD of several numbers: " + arrayNod(numbers));

		Integer[] numbers2 = { 30, 15 };
		System.out.println("\nNOD of several numbers: " + arrayNod(numbers2));
		
		Integer[] numbers3 = { 0, 0};
		System.out.println("\nNOD of several numbers: " + arrayNod(numbers3));
	}

}
