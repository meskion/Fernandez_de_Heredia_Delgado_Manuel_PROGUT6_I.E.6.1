package util;

/**
 * Clase para metodos trabajando con numeros y operaciones matematicas.
 * 
 * @author manuf
 *
 */
public class Numbers {
	/**
	 * Calcula el factorial de n mediante recursion. El factorial de 13 ya se pasa
	 * del rango de int, si quisiera usarlo para mayores numeros usaria long, pero
	 * aun asi con long solo se podria factorizar hasta el 20 sin que haya overflow.
	 * 
	 * 
	 * @param n
	 * @return factorial de n
	 */
	public static int fact(int n) {

		if (n > 1) {
			return n * fact(n - 1);
		} else {
			return 1;
		}
	}

	/**
	 * Produce el elemento n-esimo de la serie de fibonacci.
	 * 
	 * @param n
	 * @return
	 */
	public static int fibonnaciSequence(int n) {

		if (n > 2) {
			return fibonnaciSequence(n - 1) + fibonnaciSequence(n - 2);
		} else
			return 1;
	}

	/**
	 * Muestra el triangulo de pascal
	 * 
	 * @param n Hasta que fila se va a mostrar
	 * @return Array con la ultima fila.
	 */
	public static int[] pascalTriangle(int n) {
		int[] current = new int[n];

		current[0] = 1;
		current[n - 1] = 1;
		if (n > 1) {
			int[] previous = pascalTriangle(n - 1);

			for (int i = 1; i < current.length - 1; i++) {
				current[i] = previous[i] + previous[i - 1];
			}
		}
		System.out.println(Matrix.toString(current));
		return current;

	}

	public static boolean isPrime(int n) {
		// a Fuerza bruta de momento,
		// si tengo tiempo haré un algoritmo mejor.
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	/**
	 * Comprueba si un numero es capicua.
	 * 
	 * @param n
	 * @return
	 */
	public static boolean esCapicua(int n) {
		return Words.isPalindrome(String.valueOf(n));
	}

	public static double pow(int n, int e) {
		if (e == 0) {
			return 1;
		} else if (e > 0) {
			return n * pow(n, e - 1);
		} else {
			return pow(n, e + 1) / n;
		}
	}

}
