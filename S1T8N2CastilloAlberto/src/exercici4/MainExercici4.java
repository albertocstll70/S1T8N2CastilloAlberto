package exercici4;

import java.util.ArrayList;
import java.util.Comparator;

public class MainExercici4 {

	public static void main(String[] args) {

		ArrayList<String> lista = new ArrayList<String>();

		lista.add("dos");
		lista.add("enum");
		lista.add("cadenas");
		lista.add("primero");
		lista.add("agua");
		lista.add("123213");
		lista.add("123213abmbnmbm");

		System.out.println("Ordenado alfabéticamente por su primer carácter");
		ordenAZ(lista);

		System.out.println("\nOrdenado cadenas que contienen una \"e\" primero, el resto de cadenas después");
		ordenEPrimero(lista);

		System.out.println("\nModifica la 'a' por un '4'");
		remplazaA4(lista);

		System.out.println("\nMuestra sólo los elementos que son numéricos");
		listaNumero(lista);

	}

	public static void ordenAZ(ArrayList<String> lista) {

		lista.sort(Comparator.comparing(String::toString, (n1, n2) -> n1.charAt(0) - n2.charAt(0)));

		for (String e : lista) {
			System.out.println(e);

		}

	}

	public static void ordenEPrimero(ArrayList<String> lista) {

		lista.stream().filter(n -> n.contains("e")).forEach(System.out::println);
		lista.stream().filter(n -> !n.contains("e")).forEach(System.out::println);

	}

	public static void remplazaA4(ArrayList<String> lista) {

		ArrayList<String> result = new ArrayList<String>();
		lista.forEach(n -> {
			n = n.replace("a", "4");
			result.add(n);

		}

		);

		for (String e : result) {
			System.out.println(e);

		}

	}

	public static void listaNumero(ArrayList<String> lista) {

		lista.stream().filter(n -> n.matches(".*[0-9].*")).forEach(System.out::println);
	}

}
