package exercici3;

public class MainExercici3 {

	public static void main(String[] args) {

		System.out.println(suma(5, 12));
		System.out.println(resta(20, 5));
		System.out.println(multiplicacion(7, 6));
		System.out.println(division(13, 8));

	}

	public static float suma(float n1, float n2) {

		IOperacion op = (m1, m2) -> {
			float result = m1 + m2;
			return result;

		};

		return op.operacion(n1, n2);

	}

	public static float resta(float n1, float n2) {

		IOperacion op = (m1, m2) -> {
			float result = m1 - m2;
			return result;

		};

		return op.operacion(n1, n2);

	}

	public static float multiplicacion(float n1, float n2) {

		IOperacion op = (m1, m2) -> {
			float result = m1 * m2;
			return result;

		};

		return op.operacion(n1, n2);

	}

	public static float division(float n1, float n2) {

		IOperacion op = (m1, m2) -> {
			float result = m1 / m2;
			return result;

		};

		return op.operacion(n1, n2);

	}

}
