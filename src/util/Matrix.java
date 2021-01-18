package util;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

import dynArray.DynIntArray;
import dynArray.DynIntMatrix;

/**
 * biblioteca personal de metodos de utilidad para arrays y matrices.
 * 
 * @author manuf
 *
 */
public class Matrix {

	/**
	 * Suma de los elementos del array
	 * 
	 * @param arr Array a operar
	 * @return Suma
	 */
	public static double sum(double[] arr) {
		double sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}

	/**
	 * Suma de los elementos del array
	 * 
	 * @param arr Array a operar
	 * @return Suma
	 */
	public static int sum(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}

	/**
	 * Calcula la media de los valores de un array
	 * 
	 * @param arr Array a operar
	 * @return media aritmetica
	 */

	public static double average(double[] arr) {

		return sum(arr) / arr.length;
	}

	/**
	 * Calcula la media de los valores de un array
	 * 
	 * @param arr Array a operar
	 * @return media aritmetica
	 */

	public static double average(int[] arr) {

		return sum(arr) / arr.length;
	}

	/**
	 * Rellena un array con numeros aleatorios de 0 a 1.
	 * 
	 * @param arr Array a operar
	 */
	public static void randFill(double[] arr) {
		Random rand = new Random();
		for (int i = 0; i < arr.length; i++) {
			arr[i] = rand.nextDouble();
		}

	}

	/**
	 * Rellena un array con numeros aleatorios de 0 a bound.
	 * 
	 * @param arr   Array a operar
	 * @param bound limite superior para los numeros aleatorios
	 */
	public static void randFill(double[] arr, double bound) {
		Random rand = new Random();
		for (int i = 0; i < arr.length; i++) {
			arr[i] = rand.nextDouble() * bound;
		}

	}

	/**
	 * Rellena un array con numeros aleatorios de boundLo a boundUp-1.
	 * 
	 * @param arr
	 * @param boundUp
	 * @param boundLow
	 */

	public static void randFill(int[] arr, int boundLow, int boundUp) {
		Random rand = new Random();
		// Deberia capturar que el lower bound sea mayor que el upper bound, y lanzar
		// una excepcion
		for (int i = 0; i < arr.length; i++) {
			arr[i] = rand.nextInt(boundUp - boundLow) + boundLow;
		}

	}

	/**
	 * Rellena un array con numeros aleatorios de 0 a bound-1.
	 * 
	 * @param arr   Array a operar
	 * @param bound limite superior para los numeros aleatorios
	 */
	public static void randFill(int[] arr, int bound) {
		Random rand = new Random();
		for (int i = 0; i < arr.length; i++) {
			arr[i] = rand.nextInt(bound);
		}

	}

	/**
	 * Rellena un array con un valor aleatorio en el rango del tipo int (2^32)
	 * 
	 * @param arr
	 */

	public static void randFill(int[] arr) {
		Random rand = new Random();
		for (int i = 0; i < arr.length; i++) {
			arr[i] = rand.nextInt();
		}
	}

	/**
	 * Rellena una matriz con numeros aleatorios de 0 a bound-1.
	 * 
	 * @param arr   matriz a operar
	 * @param bound limite superior para los numeros aleatorios
	 */

	public static void randFill(int[][] arr, int bound) {
		for (int i = 0; i < arr.length; i++) {
			randFill(arr[i], bound);
		}

	}

	/**
	 * Rellena una matriz con caracteres aleatorios de 0 a bound-1. los limites
	 * representan el codigo Unicode de los caracteres, y como la transformación de
	 * char a int es automatica en java, llamar al metodo asi: randFill(arr,'a','z')
	 * funciona, y solo genera caracteres entre la 'a' y la 'z', segun la ordenacion
	 * de los caracteres en unicode.
	 * 
	 * 
	 * @param arr     matriz a operar
	 * @param loBound limite inferior para los numeros aleatorios
	 * @param upBound limite superior
	 */

	public static void randFill(char[][] arr, int loBound, int upBound) {

		Random rand = new Random();
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				arr[i][j] = (char) (rand.nextInt(upBound - loBound) + loBound);
			}

		}

	}

	/**
	 * Rellena toda la matriz con el valor dado
	 * 
	 * @param arr
	 * @param val
	 */
	public static void fill(int[][] arr, int val) {
		for (int i = 0; i < arr.length; i++) {
			Arrays.fill(arr[i], val);
		}
	}

	/**
	 * Rellena toda la matriz con el valor dado
	 * 
	 * @param arr
	 * @param val
	 */

	public static void fill(char[][] arr, char val) {
		for (int i = 0; i < arr.length; i++) {
			Arrays.fill(arr[i], val);
		}
	}

	/**
	 * Metodo que lee por consola valores para un array
	 * 
	 * @param arr  Array a escribir
	 * @param scan scanner que lee por consola.
	 */

	public static void writeArray(double[] arr, Scanner scan) {

		for (int i = 0; i < arr.length; i++) {
			boolean fail;
			do {
				fail = false;
				try {
					System.out.println("valor del elemento " + i + "?");
					arr[i] = scan.nextDouble();

				} catch (InputMismatchException e) {
					fail = true;
					scan.nextLine();
					System.err.println("Valor no valido, vuelve a intentarlo");
				}
			} while (fail);

		}
	}

	/**
	 * Metodo que lee por consola valores para un array
	 * 
	 * @param arr  Array a escribir
	 * @param scan scanner que lee por consola.
	 */
	public static void writeArray(int[] arr, Scanner scan) {

		for (int i = 0; i < arr.length; i++) {
			boolean fail;
			do {
				fail = false;
				try {
					System.out.println("valor del elemento " + i + "?");
					arr[i] = scan.nextInt();

				} catch (InputMismatchException e) {
					fail = true;
					scan.nextLine();
					System.err.println("Valor no valido, vuelve a intentarlo");
				}
			} while (fail);

		}
	}

	/**
	 * Metodo que lee por consola valores para un array
	 * 
	 * @param arr  Array a escribir
	 * @param scan scanner que lee por consola.
	 */
	public static void writeArray(String[] arr, Scanner scan) {

		for (int i = 0; i < arr.length; i++) {
			System.out.println("valor del elemento " + i + "?");
			arr[i] = scan.nextLine();
		}
	}

	/**
	 * Crea un nuevo array de enteros con valores pedidos por consola, si se
	 * introduce por consola algo diferente a un numero, deja de tomar valores
	 * nuevos y devuelve el array
	 * 
	 * @param scan
	 * @return
	 */

	public static int[] writeNewArray(Scanner scan) {
		// Uso una clase para simular un array con tamaño dinamico.
		DynIntArray arr = new DynIntArray();
		boolean continuar = true;
		System.out.println("Introduce valores enteros para un array, o cualquier otro caracter para terminar.");
		do {

			try {
				System.out.println("valor del elemento siguiente?");
				arr.add(scan.nextInt());
			} catch (Exception e) {
				scan.nextLine();
				continuar = false;
			}

		} while (continuar);

		return arr.get();
	}

	/**
	 * Lee un array por consola pero solo admite multiplos de 3.
	 * 
	 * @param arr  array donde se guardan los datos.
	 * @param scan objeto escaner para leer los datos
	 */
	public static void writeArrayCheck3(int[] arr, Scanner scan) {
		int aux;
		boolean go;
		for (int i = 0; i < arr.length; i++) {
			System.out.println("valor del elemento " + i + "?");
			go = true;
			do {
				aux = scan.nextInt();
				if (aux % 3 == 0) {
					arr[i] = aux;
					go = false;
				}
			} while (go);
		}
	}

	/**
	 * Genera un nuevo array relleno de enteros aleatorios de 0 a el limite.
	 * 
	 * @param length tamaño del array
	 * @param bound  limite superior
	 * @return
	 */
	public static int[] randArray(int length, int bound) {
		int[] arr = new int[length];
		randFill(arr, bound);
		return arr;
	}

	/**
	 * Genera un nuevo array relleno de enteros aleatorios desde el limite
	 * inferior(incluido) hasta el limite superior(excluido)
	 * 
	 * @param length   tamaño del array
	 * @param boundLow limite inferior
	 * @param boundUp  limite superior
	 * @return
	 */

	public static int[] randArray(int length, int boundLow, int boundUp) {
		int[] arr = new int[length];
		randFill(arr, boundLow, boundUp);
		return arr;
	}

	/**
	 * Genera una matriz de enteros N x M llena de numeros aleatorios.
	 * 
	 * @param n     filas
	 * @param m     columnas
	 * @param bound limite superior de los numeros aleatorios
	 * @return
	 */

	public static int[][] randMatrix(int n, int m, int bound) {

		int[][] arr = new int[n][m];
		randFill(arr, bound);
		return arr;
	}

	/**
	 * Intercambia los valores de las posiciones 1 y 2, 3 y 4, etc.
	 * 
	 * @param arr Array a operar
	 */

	public static void switchPairs(int[] arr) {
		int aux = 0;
		for (int i = 0; i < arr.length; i++) {
			if (i % 2 == 0) {
				aux = arr[i];
				arr[i] = arr[i + 1];
			} else {
				arr[i] = aux;
			}
		}
	}

	/**
	 * Intercambia los valores de las posiciones 1 y 2, 3 y 4, etc.
	 * 
	 * @param arr Array a operar
	 */
	public static void switchPairs(double[] arr) {
		double aux = 0;
		for (int i = 0; i < arr.length; i++) {
			if (i % 2 == 0) {
				aux = arr[i];
				arr[i] = arr[i + 1];
			} else {
				arr[i] = aux;
			}
		}
	}

	/**
	 * Devuelve el valor maximo del array.
	 * 
	 * @param arr
	 * @return
	 */
	public static double max(double[] arr) {
		double auxM = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > auxM) {
				auxM = arr[i];
			}
		}
		return auxM;
	}

	/**
	 * Devuelve el valor maximo del array.
	 * 
	 * @param arr
	 * @return
	 */
	public static int max(int[] arr) {
		int auxM = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > auxM) {
				auxM = arr[i];
			}
		}
		return auxM;
	}

	/**
	 * Devuelve el valor maximo de la matriz.
	 * 
	 * @param arr
	 * @return
	 */
	public static int max(int[][] arr) {
		int auxM = max(arr[0]);
		int m;
		for (int i = 1; i < arr.length; i++) {
			m = max(arr[i]);
			if (m > auxM) {
				auxM = m;
			}
		}
		return auxM;
	}

	/**
	 * Devuelve el valor minimo del array.
	 * 
	 * @param arr
	 * @return
	 */
	public static double min(double[] arr) {
		double auxM = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < auxM) {
				auxM = arr[i];
			}
		}
		return auxM;
	}

	/**
	 * Devuelve el valor minimo del array.
	 * 
	 * @param arr
	 * @return
	 */
	public static int min(int[] arr) {
		int auxM = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < auxM) {
				auxM = arr[i];
			}
		}
		return auxM;
	}

	/**
	 * Devuelve el valor minimo de la matriz.
	 * 
	 * @param arr
	 * @return
	 */

	public static int min(int[][] arr) {
		int auxM = min(arr[0]);
		int m;
		for (int i = 1; i < arr.length; i++) {
			m = min(arr[i]);
			if (m < auxM) {
				auxM = m;
			}

		}
		return auxM;
	}

	/**
	 * va a devolver una tabla de dos columnas, y numRows filas, la primera columna
	 * es el valor del maximo, y la segunda el numero de ocurrencias.
	 * 
	 * @param arr     array en el que operar.
	 * @param numRows Numero de maximos que quieres
	 * 
	 * @return matriz con maximos y nº ocurrencias
	 */

	public static int[][] maxList(int[] arr, int numRows) {

		// Inicializamos la matriz que contendra los mayores y sus ocurrencias.
		int[][] res = new int[numRows][2];
		int count = 1;
		int i = arr.length - 1;

		// copia ordenada
		int[] sorted = Arrays.copyOf(arr, arr.length);
		Arrays.sort(sorted);

		res[0][0] = sorted[i];
		res[0][1] = 1;

		while (count <= numRows && i > 0) {
			i--;
			if (sorted[i] == res[count - 1][0]) {
				res[count - 1][1]++;
			} else if (count != numRows) {
				count++;
				res[count - 1][0] = sorted[i];
				res[count - 1][1] = 1;
			}

		}

		return res;

	}

	/**
	 * va a devolver una tabla de dos columnas, y numMax filas, la primera columna
	 * es el valor del maximo, y la segunda el numero de ocurrencias.
	 * 
	 * @param arr     array en el que operar.
	 * @param numRows Numero de minimos que quieres
	 * 
	 * @return matriz con minimos y nº ocurrencias
	 */

	public static int[][] minList(int[] arr, int numRows) {

		// Inicializamos la matriz que contendra los menores y sus ocurrencias.
		int[][] res = new int[numRows][2];
		int countMins = 1;
		int i = 0;

		// copia ordenada
		int[] sorted = Arrays.copyOf(arr, arr.length);
		Arrays.sort(sorted);
//		1 3 5 6 4 3 5 4
//		1 3 3 4 4 5 5 6

		res[0][0] = sorted[i];
		res[0][1] = 1;

		while (countMins <= numRows && i < arr.length) {
			i++;
			if (sorted[i] == res[countMins - 1][0]) {
				res[countMins - 1][1]++;
			} else if (countMins != numRows) {
				countMins++;
				res[countMins - 1][0] = sorted[i];
				res[countMins - 1][1] = 1;
			}

			// 2 2
			// 3 1
		}

		return res;

	}

	/**
	 * @deprecated Devuelve los dos valores maximos de un array.
	 * 
	 * @param arr
	 * @return
	 */
	/*
	 * Esta funciona la hice antes de una mas general, y en lugar de eliminarla he
	 * probado a marcarla como obsoleta en la documentacion
	 */
	public static int[] twoMax(int[] arr) {
		int[] res = new int[2];
		res[0] = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > res[0]) {
				res[1] = res[0];
				res[0] = arr[i];
			} else if (arr[i] > res[1] && arr[i] < res[0]) {
				res[1] = arr[i];
			}
		}

		return res;
	}

	/**
	 * Busqeda dicotomica o binaria, el array debe estar ordenado de menor a mayor
	 * 
	 * @param arr Array en el que buscar
	 * @param t   valor a buscar
	 * @return indice del valor encontrado, si no encuentra el valor, devuelve -1
	 */
	public static int binSearch(int[] arr, int t) {
		int leftBound = 0;
		int rightBound = arr.length - 1;
		int posibleFindIndex;
		do {
			if (leftBound > rightBound) {
				return -1;
			} else {
				posibleFindIndex = (leftBound + rightBound) / 2;
				if (arr[posibleFindIndex] < t) {
					leftBound = posibleFindIndex + 1;
				} else if (arr[posibleFindIndex] > t) {
					rightBound = posibleFindIndex - 1;
				}
			}
		} while (arr[posibleFindIndex] != t);
		return posibleFindIndex;

	}

	/**
	 * Busca en un array de enteros un elemento en concreto y devuelve su posicion
	 * en el array, si hay varias ocurrencias devolverá la posicion de la primera
	 * 
	 * @param arr
	 * @param t
	 * @return
	 */

	public static int linearSearch(int[] arr, int t) {

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == t)
				return i;
		}
		return -1;
	}

	/**
	 * Busca en una matriz de enteros un elemento en concreto y devuelve las
	 * posiciones de cada ocurrencia en la matriz como una tabla con dos columnas y
	 * tantas filas como ocurrencias haya.
	 * 
	 * @param arr
	 * @param t
	 * @return
	 */

	public static int[][] linearSearch(int[][] arr, int t) {

		DynIntMatrix res = new DynIntMatrix();

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] == t) {
					res.add(i, j);
				}
			}
		}

		return res.get();
	}

	/**
	 * Dada una matriz,devuelve su transpuesta
	 * 
	 * @param M
	 */
	public static int[][] transpose(int[][] M) {

		int[][] T = new int[M[0].length][M.length];
		for (int i = 0; i < M.length; i++) {
			for (int j = 0; j < M[i].length; j++) {
				T[j][i] = M[i][j];
			}
		}
		return T;
	}

	/**
	 * Cuenta las ocurrencias de un valor en un array.
	 * 
	 * @param arr array a operar
	 * @param a   valor a buscar
	 * @return numero de veces que aparece el valor
	 */
	public static int count(int[] arr, int a) {
		int cont = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == a)
				cont++;
		}
		return cont;
	}

	/**
	 * Cuenta las ocurrencias de un valor en una matriz
	 * 
	 * @param a valor a buscar
	 * @return numero de veces que aparece el valor
	 */

	public static int count(int[][] arr, int a) {
		int cont = 0;
		for (int i = 0; i < arr.length; i++) {
			cont += count(arr[i], a);
		}
		return cont;
	}

	/**
	 * Invierte la direccion de un array.
	 * 
	 * @param arr
	 * @return
	 */

	public static int[] reverse(int[] arr) {
		int[] reverse = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {

			reverse[i] = arr[arr.length - i - 1];
		}

		return reverse;
	}

	public static char[] reverse(char[] arr) {
		char[] reverse = new char[arr.length];
		for (int i = 0; i < arr.length; i++) {

			reverse[i] = arr[arr.length - i - 1];
		}

		return reverse;
	}

	/**
	 * Devuelve el elemento con mas ocurrencias en un array dado. si hay varios
	 * elementos con el mismo numero de ocurrencias, dará el mayor de ellos.
	 * 
	 * @param arr
	 * @return
	 */

	public static int mode(int[] arr) {
		// puedo hacer esto reutilizando maxList que ya ordena y cuenta la frecuencia de
		// los elementos en un array

		int maxF = 0;
		int res = 0;
		int[][] lista = maxList(arr, arr.length);
		for (int i = 0; i < lista.length; i++) {
			if (lista[i][1] > maxF) {
				maxF = lista[i][1];
				res = lista[i][0];
			}
		}
		/*
		 * 5 23 4 2 3 1 2 1 1 1
		 */

		return res;
	}

	/**
	 * Suma dos array elemento a elemento, y devuelve el array suma resultante. Los
	 * arrays deben ser del mismo tamaño, o saltará una excepción.
	 * 
	 * @param a primer array a operar
	 * @param b segundo array.
	 * @return array con la suma de a y b elemento a elemento.
	 */

	public static int[] vectorSum(int[] a, int[] b) {
		int[] c = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			c[i] = a[i] + b[i];
		}

		return c;
	}

	/**
	 * Suma de matrices, las matrices deben tener las mismas dimensiones o dará
	 * error.
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	public static int[][] vectorSum(int[][] a, int[][] b) {
		int[][] c = new int[a.length][a[0].length];
		for (int i = 0; i < a.length; i++) {
			c[i] = vectorSum(a[i], b[i]);
		}
		return c;
	}

	/**
	 * toma un array u devuelve otro con los factoriales del array original.
	 * 
	 * @param arr
	 * @return
	 */
	public static int[] vectorFact(int[] arr) {
		/*
		 * * El factorial de 13 ya se pasa del rango de int, si quisiera usarlo para
		 * mayores numeros usaria long, pero aun asi con long solo se podria factorizar
		 * hasta el 20 sin que haya overflow.
		 * 
		 */
		int[] res = new int[arr.length];
		for (int i = 0; i < res.length; i++) {
			res[i] = Numbers.fact(arr[i]);
		}
		return res;
	}

	/**
	 * Devuelve un subArray de arr con los elementos en la posiciones especificadas
	 * en el segundo paramentro
	 * 
	 * @param arr array a ser cortado.
	 * @param pos posiciones de los elementos a cortar
	 * @return
	 */
	public static int[] cut(int[] arr, int[] pos) {
		int[] res = new int[pos.length];

		for (int i = 0; i < pos.length; i++) {
			res[i] = arr[pos[i]];
		}
		return res;
	}

	/**
	 * Devuelve un subArray con solo los elementos en posiciones pares, empenzando a
	 * contar por el 0
	 * 
	 * @param arr
	 * @return
	 */
	public static int[] onlyEvenIndex(int[] arr) {
		DynIntArray evenPos = new DynIntArray();
		for (int i = 0; i < arr.length; i += 2) {
			evenPos.add(arr[i]);
		}
		return evenPos.get();
	}

	/**
	 * Devuelve un subArray con solo los elementos en posiciones impares, empenzando
	 * a contar por el 0
	 * 
	 * @param arr
	 * @return
	 */
	public static int[] onlyOddIndex(int[] arr) {
		DynIntArray oddPos = new DynIntArray();
		for (int i = 1; i < arr.length; i += 2) {
			oddPos.add(arr[i]);
		}
		return oddPos.get();
	}

	/**
	 * Devuelve un subArray con solo los elementos pares, empezando a contar por el
	 * 0
	 * 
	 * @param arr
	 * @return
	 */
	public static int[] onlyEvenValue(int[] arr) {
		DynIntArray even = new DynIntArray();
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				even.add(arr[i]);
			}
		}
		return even.get();
	}

	/**
	 * Devuelve un subArray con solo los elementos impares, empezando a contar por
	 * el 0
	 * 
	 * @param arr
	 * @return
	 */

	public static int[] onlyOddValue(int[] arr) {
		DynIntArray odd = new DynIntArray();
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] % 2 != 0) {
				odd.add(arr[i]);
			}
		}
		return odd.get();
	}

	/**
	 * Devuelve un subarray con solo los elementos primos del array original
	 * 
	 * @param arr
	 * @return
	 */

	public static int[] onlyPrimes(int[] arr) {
		DynIntArray primes = new DynIntArray();
		for (int i = 0; i < arr.length; i++) {
			if (Numbers.isPrime(arr[i])) {
				primes.add(arr[i]);
			}
		}
		return primes.get();

	}

	/**
	 * Devuelve el contenido del array como un string, con elementos separados por
	 * tabulaciones, \t
	 * 
	 * @param arr
	 * @return
	 */
	public static String toString(int[] arr) {
		String res = "";
		for (int i = 0; i < arr.length; i++) {
			res += arr[i] + "\t";
		}
		return res;
	}

	/**
	 * Convierte en string una matriz para visualizarla.
	 * 
	 * @param arr
	 * @return
	 */
	public static String deepToString(int[][] arr) {
		String res = "";
		for (int i = 0; i < arr.length; i++) {
			res += Matrix.toString(arr[i]);
			res += "\n";
		}
		return res;
	}

	/**
	 * Convierte en string una matriz para visualizarla.
	 * 
	 * @param arr
	 * @return
	 */

	public static String deepToString(char[][] arr) {
		String res = "";
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				res += arr[i][j];
			}

			res += "\n";
		}
		return res;
	}

	/**
	 * Invierte la diagonal principal de la matriz.
	 * 
	 * @param arr matriz a operar.
	 */
	public static void reverseDiagonal(int[][] arr) {
		int aux, j;
		for (int i = 0; i < arr.length / 2; i++) {
			aux = arr[i][i];
			j = arr.length - i - 1;
			arr[i][i] = arr[j][j];
			arr[j][j] = aux;
		}
	}

	/**
	 * Determina si el primer array contiene al segundo.
	 * 
	 * @param big
	 * @param smol
	 * @return
	 */

	public static boolean contains(int[] big, int[] smol) {
		int elementsFound;
		for (int i = 0; i < big.length; i++) {
			elementsFound = 0;
			if (big.length - i < smol.length) {
				return false;
			}
			for (int j = 0; j < smol.length; j++) {
				if (big[i + j] == smol[j]) {
					elementsFound++;
				}
				if (elementsFound == smol.length) {
					return true;
				}
			}
		}

		return false;
	}

	/**
	 * Determina si el primer array contiene al segundo.
	 * 
	 * @param big
	 * @param smol
	 * @return
	 */

	public static boolean contains(char[] big, char[] smol) {
		int elementsFound;
		for (int i = 0; i < big.length; i++) {
			elementsFound = 0;
			if (big.length - i < smol.length) {
				return false;
			}
			for (int j = 0; j < smol.length; j++) {
				if (big[i + j] == smol[j]) {
					elementsFound++;
				}
				if (elementsFound == smol.length) {
					return true;
				}
			}
		}

		return false;
	}

	/**
	 * Intercambia el minimo de la matriz a con el maximo de la matriz b.
	 * 
	 * @param a
	 * @param b
	 */
	public static void swapMinMax(int[][] a, int[][] b) {
		int minA = min(a);
		int maxB = max(b);
		int[][] posMinA = linearSearch(a, minA);
		int[][] posMaxB = linearSearch(b, maxB);

		for (int[] i : posMaxB) {
			b[i[0]][i[1]] = minA;
		}
		for (int[] i : posMinA) {
			a[i[0]][i[1]] = maxB;
		}
	}

	/**
	 * Genera un cuadrado latino de N x N. Un cuadrado latino es una matriz cuadrada
	 * en la que en cada fila y en cada columna no se repite ningun valor.
	 * 
	 * @param n Orden de la matriz cuadrada
	 * @return Matriz con el cuadrado latino.
	 */
	public static int[][] generateLatinSquare(int n) {
		int[][] latSq = new int[n][n];

		for (int i = 0; i < latSq.length; i++) {
			for (int j = 0; j < latSq.length; j++) {
				latSq[i][j] = (i + j) % n + 1;
			}
		}

		return latSq;
	}

	/**
	 * La matriz debe ser cuadrada. busco el minimo en cada fila, y por cada
	 * instancia del minimo, miro si es igual a maximo de su columna, que es el
	 * maximo de la fila de la matriz transpuesta, si se cumple, añado su posicion a
	 * la tabla que luego devolveré
	 * 
	 * @param M Matriz de la que queremos los puntos de silla
	 * @return Tabla con posiciones de los puntos de silla, si hay.
	 */

	public static int[][] inflectionPoints(int[][] M) {

		DynIntMatrix infPoints = new DynIntMatrix();
		int minRow;
		int[][] T = transpose(M);
		for (int i = 0; i < M.length; i++) {
			minRow = min(M[i]);

			for (int j = 0; j < M.length; j++) {
				if (M[i][j] == minRow && minRow == max(T[j])) {
					infPoints.add(i, j);
				}

			}
		}

		return infPoints.get();
	}

	/**
	 * Genera una matriz caracol o espiral de N x N.
	 * 
	 * @param n orden de la matriz
	 * @return matriz generada.
	 */
	public static int[][] spiralFill(int n) {

		int[][] res = new int[n][n];
		int i, k = 0, l = 0, m = n, next = 1;
		/*
		 * i: iterador, n: orden y filas, m: columnas, k: fila en la que toca empezar,
		 * l: columna en la que toca empezar, next: contador de que numero toca
		 * introducir.
		 */

		while (k < n && l < n) {

			/*
			 * La idea es que hay 4 fors, uno para cada direccion en la que vamos a iterar,
			 * y el orden es siempre: derecha, abajo, izquierda, arriba, derecha, etc. Pero
			 * cada vez que se da una 'vuelta', el loop se hace mas pequeño, y se empieza en
			 * una fila y una columna mas a la derecha
			 * 
			 */
			for (i = l; i < n; i++) {
				res[k][i] = next++;
			}
			k++;// lo hacemos aqui para que no repita la esquina

			for (i = k; i < m; i++) {
				res[i][n - 1] = next++;
			}
			n--;
			/*
			 * En los ultimos dos giros(izquierda, arriba) hay que asegurarse de que no se
			 * haya terminado ya la matriz, o empezaremos a sobrescribir la matriz.
			 */
			if (k < m) {
				for (i = n - 1; i >= l; i--) {
					res[m - 1][i] = next++;
				}
				m--;
			}

			if (l < n) {
				for (i = m - 1; i >= k; i--) {
					res[i][l] = next++;
				}
				l++;
			}

		}

		return res;
	}

	/**
	 * Algoritmo de ordenacion por metodo de burbuja.
	 * 
	 * @param arr
	 */
	public static void bubbleSort(int[] arr) {

		int len = arr.length;
		for (int i = 0; i < len - 1; i++)
			for (int j = 0; j < len - i - 1; j++)
				if (arr[j] > arr[j + 1]) {
					int aux = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = aux;
				}
	}

	/**
	 * algoritmo de ordenacion por insercion directa.
	 * 
	 * @param arr
	 */
	public static void insertionSort(int[] arr) {
		int n = arr.length;
		for (int i = 1; i < n; i++) {

			int key = arr[i];
			int j = i - 1;

			while (j >= 0 && arr[j] > key) {

				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = key;
		}
	}

	/**
	 * Dada una matriz, devuelve su diagonal principal como vector.
	 * 
	 * @param arr
	 * @return
	 */
	public static int[] getDiagonal(int[][] arr) {
		int[] res = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			res[i] = arr[i][i];
		}

		return res;
	}

	/**
	 * Dada una matriz y un vector, sustituye la diagonal principal de la matriz por
	 * el vector. si el vector no rellena la diagonal entera solo cambiara lo que
	 * ocupe, empezando por la posicion 0 0(esquina superior izquierda)
	 * 
	 * @param arr matriz que modificar
	 * @param d   diagonal a insertar
	 */
	public static void setDiagonal(int[][] arr, int[] d) {
		if (arr.length >= d.length) {
			for (int i = 0; i < d.length; i++) {
				arr[i][i] = d[i];
			}
		}

	}

	/**
	 * dada una matriz y un vector, busca ese vector como fila de la matriz, y
	 * devuelve el numero de fila si la encuentra, -1 si no.
	 * 
	 * @param matrix matriz donde buscar
	 * @param arr    array que buscar
	 * @return fila en la que la encuentra.
	 */
	public static int rowSearch(int[][] matrix, int[] arr) {

		for (int i = 0; i < matrix.length; i++) {
			if (Arrays.equals(matrix[i], arr)) {
				return i;
			}
		}
		return -1;
	}

}
