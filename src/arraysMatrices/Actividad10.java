package arraysMatrices;

import java.util.Arrays;

import util.Matrix;

public class Actividad10 {

	public static void main(String[] args) {
		
	
		System.out.println("Creo un array de 15 elementos");
		int[] arr = Matrix.randArray(15, 100);
		System.out.println(Arrays.toString(arr));
		System.out.println("");
//		int[] maxs = Matrix.twoMax(arr);// Funcion obsoleta.
		int[][] maxs = Matrix.maxList(arr, 2);
		
		
		//System.out.println(Arrays.deepToString(maxs));
		System.out.println("El primer mayor es "+maxs[0][0]+" y el segundo mayor es "+ maxs[1][0]);
		
		
		

	}

}
