package exercici1;

import java.util.ArrayList;

public class MainExercici1 {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();
		list.add("Alberto");
		list.add("Marcos");
		list.add("Juan");
		list.add("Ana");
		list.add("Yeny");
		list.add("Diana");
		list.add("Robert");
		list.add("asA");

		list.stream().filter(lista -> lista.startsWith("A", 0)).filter(lista -> lista.length() == 3)
				.forEach(System.out::println);

	}

}
