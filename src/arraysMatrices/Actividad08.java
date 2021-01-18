package arraysMatrices;

import java.util.Arrays;
import java.util.Scanner;

import util.Matrix;

public class Actividad08 {

	public static void main(String[] args) {
		
	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Creo un array de 25 elementos");
		int[] arr = new int[25];
		Matrix.writeArray(arr, scan);
		System.out.println(Arrays.toString(arr));
		System.out.println("Que elemento quieres contar en el array?");

		System.out.println("Hay "+Matrix.count(arr, scan.nextInt())+" ocurrencias de ese valor");
		
		
		scan.close();
		
		
		
		
	
		

	}

}
