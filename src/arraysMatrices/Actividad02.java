package arraysMatrices;

import java.util.Arrays;
import java.util.Scanner;

import util.Matrix;

public class Actividad02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Creo un array de 4numeros aleatorios:");
		
		int[] arr = Matrix.randArray(4, 100);
		System.out.println(Arrays.toString(arr));
		System.out.println("Calculo la suma:");
		System.out.println(Matrix.sum(arr));
		System.out.println("Calculo la media");
		System.out.println(Matrix.average(arr));
		scan.close();
		

	}

}
