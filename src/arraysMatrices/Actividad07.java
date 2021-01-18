package arraysMatrices;

import java.util.Arrays;
import java.util.Scanner;

import util.Matrix;

public class Actividad07 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Creo un array de 10 elementos, Notese al rellenar"
				+ " el array que debe estar ordenado de menor a mayor, o la busqueda"
				+ "binaria puede fallar.");
		int[] arr = new int[10];
		Matrix.writeArray(arr, scan);
		System.out.println(Arrays.toString(arr));
		System.out.println("Que elemento quieres buscar?");

		System.out.println("La primera ocurrencia está en la posicion "+
				Matrix.binSearch(arr, scan.nextInt())
				);

		
		
		scan.close();
		

	}

}
