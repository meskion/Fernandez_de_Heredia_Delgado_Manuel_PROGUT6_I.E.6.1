package arraysMatrices;

import util.Matrix;

public class Actividad16 {

	public static void main(String[] args) {
		
		
		System.out.println("Creo dos matrices de 5x5 elementos aleatorios");
		int[][] A = Matrix.randMatrix(5, 5, 100);
		int[][] B = Matrix.randMatrix(5, 5, 100);
		
		
		System.out.println("matriz A:\n"+Matrix.deepToString(A));
		System.out.println("matriz B:\n"+Matrix.deepToString(B));
		System.out.println("guardamos la suma en una matriz C: ");
		int[][] C = Matrix.vectorSum(A, B);
		System.out.println(Matrix.deepToString(C));
		
		System.out.println("El mayor elemento en C es: "+ Matrix.max(C));
		
				
		
		

	}

}
