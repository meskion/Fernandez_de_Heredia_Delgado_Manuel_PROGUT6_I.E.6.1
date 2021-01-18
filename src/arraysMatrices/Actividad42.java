package arraysMatrices;

import java.util.InputMismatchException;
import java.util.Scanner;

import util.Matrix;

public class Actividad42 {

	public static void main(String[] args) {
		boolean fail;
		System.out.println("Genero una matriz");
		int[][] arr = Matrix.randMatrix(5, 5, 100);
		System.out.println(Matrix.deepToString(arr));
		Scanner scan = new Scanner(System.in);
		
		int rowToOrder = 0;
		
		do {
			fail = false;
			
			try {
				System.out.println("Introduce la fila del array a ordenar(0..4):");
				rowToOrder =scan.nextInt();
				Matrix.bubbleSort(arr[rowToOrder]);
			} catch (InputMismatchException e1) {
				fail = true;
				System.err.println("Tienes que introducir un numero");
				scan.nextLine();
			} catch (ArrayIndexOutOfBoundsException e2) {
				fail = true;
				System.err.println("El indice no existe en el array");
			}
			
		} while (fail);

		
		System.out.println(Matrix.deepToString(arr));
		
		System.out.println("Ahora voy a ordenar la diagonal principal:");
		int[] d = Matrix.getDiagonal(arr);
		Matrix.insertionSort(d);
		Matrix.setDiagonal(arr,d);
		System.out.println(Matrix.deepToString(arr));
		
		
		scan.close();
		
	}

}
