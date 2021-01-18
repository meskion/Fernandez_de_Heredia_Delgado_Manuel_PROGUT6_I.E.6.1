package arraysMatrices;

import util.Matrix;

public class Actividad11 {

	public static void main(String[] args) {

		System.out.println("Creo un array de 1000 elementos y lo relleno de numeros aleatorios");
		int[] arr = Matrix.randArray(1000, 99999);
		System.out.println(Matrix.toString(arr));

		System.out.println("10 elementos mayores junto a sus ocurrencias");
		System.out.println("max\tnº\n" + Matrix.deepToString(Matrix.maxList(arr, 10)));

	}

}
