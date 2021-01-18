package arraysMatrices;

import java.util.Scanner;

import util.Matrix;

public class Actividad14 {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Creamos un nuevo array leyendo valores por consola.");
		int[] arr = Matrix.writeNewArray(scan);
				
		System.out.println(Matrix.toString(arr));
	
		
		System.out.println("Leemos el numero a buscar:");
		
		if (Matrix.linearSearch(arr, scan.nextInt()) >= 0) {
			System.out.println("El numero buscado está en el array");
		}else {
			System.out.println("El numero buscado NO está en el array");	
		}
		
		
		

	}

}
