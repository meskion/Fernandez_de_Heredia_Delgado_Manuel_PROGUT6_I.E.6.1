package arraysMatrices;

import java.util.Arrays;

import util.Matrix;

public class Actividad20 {

	public static void main(String[] args) {
		
		
		System.out.println("Creo un array de 100 elementos aleatorios");
		int[] arr = Matrix.randArray(100, 1,1001);
		System.out.println(Arrays.toString(arr));
		
		System.out.println("Creo un vector solo con los elementos pares:");
		System.out.println(Arrays.toString(Matrix.onlyEvenValue(arr)));
		
		System.out.println("Creo un vector solo con los elementos impares:");
		System.out.println(Arrays.toString(Matrix.onlyOddValue(arr)));
		
	}

}
