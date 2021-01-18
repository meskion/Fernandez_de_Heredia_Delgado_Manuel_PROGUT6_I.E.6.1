package arraysMatrices;

import java.util.Arrays;
import java.util.Scanner;

public class Actividad01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Creo un array de 5 elementos:");
		int[] arr = {1,2,3,4,5};
		System.out.println(Arrays.toString(arr));
		System.out.println("Actualizo cada posición con que valor?");
		Arrays.fill(arr, scan.nextInt());
		
		System.out.println("El array queda:");
		System.out.println(Arrays.toString(arr));
		scan.close();
		

	}

}
