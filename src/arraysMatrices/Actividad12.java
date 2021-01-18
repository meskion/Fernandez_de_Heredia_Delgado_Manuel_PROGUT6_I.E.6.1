package arraysMatrices;

import java.util.Arrays;

import util.Matrix;

public class Actividad12 {

	public static void main(String[] args) {
		
		
		System.out.println("Creo un array de 100 elementos y lo relleno de numeros aleatorios");
		int[] arr = Matrix.randArray(100, 10, 80);
		//de 10 a 80
		System.out.println(Arrays.toString(arr));
		
				
		System.out.println("MAX: " + Matrix.max(arr));
		System.out.println("MIN: " + Matrix.min(arr));
		System.out.println("MEDIA: " + Matrix.average(arr));
		System.out.println("MODA: " + Matrix.mode(arr));
		
		

	}

}
