package arraysMatrices;

import java.util.Arrays;
import java.util.Scanner;

import util.Matrix;

public class Actividad05 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Creo un array de cuantos elementos?");
		
		int[] arr = new int[scan.nextInt()];
		Matrix.writeArrayCheck3(arr, scan);
		System.out.println(Arrays.toString(arr));
		
		
		
		scan.close();
		

	}

}
