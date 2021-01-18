package arraysMatrices;

import util.Matrix;

public class Actividad13 {

	public static void main(String[] args) {
		
		
		System.out.println("Creo dos array de 15 elementos y los rellenos de numeros aleatorios");
		int[] A = Matrix.randArray(15, 100);
		int[] B = Matrix.randArray(15, 100);
			
		System.out.println("Array A:"+Matrix.toString(A));
		System.out.println("Array B:"+Matrix.toString(B));
		System.out.println("guardamos la suma en un array C: ");
		int[] C = Matrix.vectorSum(A, B);
		System.out.println(Matrix.toString(C));
		
		System.out.println("El mayor elemento en C es: "+ Matrix.max(C));
		
				
	
		
		

	}

}
