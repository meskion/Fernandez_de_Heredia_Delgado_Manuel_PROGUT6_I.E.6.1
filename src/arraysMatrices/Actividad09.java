package arraysMatrices;

import java.util.Arrays;
import java.util.Scanner;

import util.Matrix;

public class Actividad09 {

	public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in);
		
		System.out.println("Creo un array de 20 elementos");
		int[] arr = new int[20];
		Matrix.writeArray(arr, scan);
		System.out.println(Arrays.toString(arr));
		System.out.println("Le doy la vuelta:");

		System.out.println(Arrays.toString(Matrix.reverse(arr)));
		
		
		scan.close();
		

	}

}
