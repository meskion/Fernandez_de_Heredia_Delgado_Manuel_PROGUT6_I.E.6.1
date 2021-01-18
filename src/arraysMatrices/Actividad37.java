package arraysMatrices;

import util.Matrix;

public class Actividad37 {

	public static void main(String[] args) {

//		int[][] arr = new int[10][10];
//		Matrix.randFill(arr, 50);// Casi nunca aparecen puntos de silla

		int[][] arr = { { 9, 2, 3, 1, 2 }, { 7, 7, 5, 6, 7 }, { 0, 5, 1, 8, 0 }, { 2, 4, 1, 8, 9 }, { 1, 2, 3, 4, 5 } };

		System.out.println("Generamos una matriz:");
		System.out.println(Matrix.deepToString(arr));

		System.out.println("Sus puntos de silla estan en:");
		System.out.println(Matrix.deepToString(Matrix.inflectionPoints(arr)));

		
		
	}

}
