package arraysMatrices;

import util.Matrix;

public class Actividad22 {

	public static void main(String[] args) {

		System.out.println("Creo una matriz de 5x5 elementos aleatorios");
		int[][] A = Matrix.randMatrix(5, 5, 100);
		System.out.println("matriz:\n" + Matrix.deepToString(A));

		System.out.println("Le invierto la diagonal:");
		Matrix.reverseDiagonal(A);
		System.out.println(Matrix.deepToString(A));

	}

}
