package arraysMatrices;

import java.util.Arrays;

import util.Matrix;

public class Actividad19 {

	public static void main(String[] args) {
		
		
		System.out.println("Creo un array de 20 elementos aleatorios");
		int[] arr = Matrix.randArray(20, 100);
		System.out.println(Arrays.toString(arr));
		
		System.out.println("Creo un vector solo con los elementos primos:");
		System.out.println(Arrays.toString(Matrix.onlyPrimes(arr)));
	}

}
