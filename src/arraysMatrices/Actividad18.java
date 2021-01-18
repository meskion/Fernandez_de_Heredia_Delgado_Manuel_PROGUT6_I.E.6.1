package arraysMatrices;

import java.util.Arrays;

import util.Matrix;

public class Actividad18 {

	public static void main(String[] args) {
		
		
		System.out.println("Creo un array de 20 elementos aleatorios");
		int[] arr = Matrix.randArray(20, 100);
		System.out.println(Arrays.toString(arr));
		
		System.out.println("suma de los elementos en posiciones pares:");
		System.out.println(Matrix.sum(Matrix.onlyEvenIndex(arr)));
		
		System.out.println("Maximo de elementos en posiciones impares:");
		System.out.println(Matrix.max(Matrix.onlyOddIndex(arr)));

	}

}
