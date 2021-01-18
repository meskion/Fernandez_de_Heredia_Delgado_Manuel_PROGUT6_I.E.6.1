package arraysMatrices;

import util.Matrix;

public class Actividad17 {

	public static void main(String[] args) {
		
		
		System.out.println("Creo una matriz de 5x5 elementos aleatorios");
		int[][] A = Matrix.randMatrix(5, 5, 100);	
		System.out.println(Matrix.deepToString(A));
		
		System.out.println("buscamos el numero mayor:");
		System.out.println("fila\tcolumna\n"+Matrix.deepToString(Matrix.linearSearch(A, Matrix.max(A))));
		
		System.out.println("buscamos el numero menor:");
		System.out.println("fila\tcolumna\n"+Matrix.deepToString(Matrix.linearSearch(A, Matrix.min(A))));
		
		

	}

}
