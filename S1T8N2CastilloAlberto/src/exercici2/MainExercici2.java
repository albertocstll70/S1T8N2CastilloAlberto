package exercici2;

import java.util.ArrayList;

public class MainExercici2 {

	public static void main(String[] args) {

		ArrayList<Integer> listInt = new ArrayList<Integer>();

		listInt.add(3);
		listInt.add(44);
		listInt.add(55);
		listInt.add(1265);
		listInt.add(10);

		ArrayList<String> result = new ArrayList<String>();

		parImpar(listInt, result);

		for (String e : result) {
			System.out.println(e);

		}

	}

	public static void parImpar(ArrayList<Integer> listInt, ArrayList<String> result) {

		listInt.stream().forEach(n -> {
			if (n % 2 == 0) {
				result.add("e" + n);
			} else {
				result.add("o" + n);
			}

		});
	}
}
