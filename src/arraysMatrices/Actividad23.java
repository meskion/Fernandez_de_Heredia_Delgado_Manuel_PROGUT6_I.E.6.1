package arraysMatrices;

import java.util.Arrays;

import util.Matrix;

public class Actividad23 {

	public static void main(String[] args) {
		
		
		System.out.println("Creo un array de 20 elementos aleatorios");
		int[] A = Matrix.randArray(20, 5);
//		int[] A = {1,2,3,4,5,6,7,8};
		System.out.println("Creo otro array de 3 elementos aleatorios");
		int[] B = Matrix.randArray(3, 5);
//		int[] B = {2,3,4};
		
		System.out.println("Array A:"+Arrays.toString(A));
		System.out.println("Array B:"+Arrays.toString(B));

		System.out.println("Contiene A a B? "+Matrix.contains(A, B));
		
	
	}

}
