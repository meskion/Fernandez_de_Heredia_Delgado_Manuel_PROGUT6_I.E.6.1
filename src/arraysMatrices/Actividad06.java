package arraysMatrices;

import java.util.Arrays;
import java.util.Scanner;

import util.Matrix;

public class Actividad06 {

	public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in);
		
	
		System.out.println("Creo un array de 10 elementos");
		int[] arr = new int[10];
		//Debe estar ordenado para asegurar que el binary search funcione
		Matrix.writeArray(arr, scan);
		System.out.println(Arrays.toString(arr));
		System.out.println("Que elemento quieres buscar?");

		System.out.println("La primera ocurrencia está en la posicion "+
				Arrays.binarySearch(arr, 0, arr.length-1, scan.nextInt())
				);
		
		
		scan.close();
		

	}

}
