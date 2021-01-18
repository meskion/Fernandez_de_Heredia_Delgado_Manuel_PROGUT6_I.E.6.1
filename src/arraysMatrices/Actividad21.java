package arraysMatrices;

import util.Matrix;

public class Actividad21 {

	public static void main(String[] args) {
		
		

		System.out.println("Creo dos matrices de 5x5 elementos aleatorios");
		int[][] A = Matrix.randMatrix(5, 5, 100);
		int[][] B = Matrix.randMatrix(5, 5, 100);
		
		

		System.out.println("matriz A:\n"+Matrix.deepToString(A));
		System.out.println("matriz B:\n"+Matrix.deepToString(B));
		

		
		System.out.println("Intercambios los minimos de A con los Maximos de B:");
		Matrix.swapMinMax(A, B);
		
		
		System.out.println("A y B quedan:");
		System.out.println("matriz A:\n"+Matrix.deepToString(A));
		System.out.println("matriz B:\n"+Matrix.deepToString(B));
		
		
	}

}
