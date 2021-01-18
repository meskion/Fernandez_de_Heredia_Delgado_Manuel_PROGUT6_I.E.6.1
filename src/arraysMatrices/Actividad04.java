package arraysMatrices;

import java.util.Scanner;

import util.Matrix;

public class Actividad04 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Creo un array de 10 elementos");
		double[] arr = new double[10];
		Matrix.writeArray(arr, scan);
		System.out.println("El valor maximo es "+ Matrix.max(arr));
		System.out.println("El valor minimo es "+ Matrix.min(arr));
		System.out.println("El valor medio es "+ Matrix.average(arr));
		
		
		scan.close();
		

	}

}
