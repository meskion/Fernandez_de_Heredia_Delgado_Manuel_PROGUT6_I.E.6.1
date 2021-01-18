package arraysMatrices;

import java.util.Arrays;
import java.util.Scanner;

import util.Matrix;

public class Actividad03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Creo un array de 10 elementos");
		int[] arr = new int[10];
		Matrix.writeArray(arr, scan);
		System.out.println("ahora intercambiamos las posiciones consecutivas(1 y 2, 3 y 4, etc");
		Matrix.switchPairs(arr);
		System.out.println(Arrays.toString(arr));
		
		
		scan.close();
		

	}

}
