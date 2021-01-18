package arraysMatrices;

import java.util.Scanner;

import util.Matrix;

public class Actividad43 {

	final static int N = 5;

	public static void main(String[] args) {

		System.out.println("Genero una Matriz NxN");
		int[][] matrix = Matrix.randMatrix(N, N, 10);
		System.out.println(Matrix.deepToString(matrix));
		System.out.println("Como hay que buscar las columnas, transpongo la matriz");
		int[][] matrixTrans = Matrix.transpose(matrix);
		
		System.out.println("Genero un array:");
		int[] arr = Matrix.randArray(N, 10);
		
		//Descomentar esto para que coja la segunda columna siempre y probar.
//		int[] arr = Arrays.copyOf(matrixTrans[1], N);
		
		System.out.println(Matrix.toString(arr));
		
			
		
		int arrInMatrix = Matrix.rowSearch(matrixTrans, arr);
		
		if (arrInMatrix >= 0) {
			System.out.println("Hemos encontrado una coincidencia, asi que ordenamos");
			Scanner scan = new Scanner(System.in);
			System.out.println("Como lo quieres ordenar?" +
							"\n I: insercion directa" +
							"\n B: Burbuja");
			boolean fail;
			do {
				fail = false;
				switch (scan.next().toUpperCase()) {
				case "I":
					System.out.println("Ordenamos por insercion");
					Matrix.insertionSort(matrixTrans[arrInMatrix]);
					break;
					
				case "B":
					System.out.println("Ordenamos por burbuja");
					Matrix.bubbleSort(matrixTrans[arrInMatrix]);
					break;

				default:
					fail = true;
					System.err.println("introduce una opcion valida");
					break;
				}
			} while (fail);
			scan.close();
			
			System.out.println("La matriz queda:");
			System.out.println(Matrix.deepToString(Matrix.transpose(matrixTrans)));
		
		}else {
			System.out.println("el array no estaba en las columnas de la matriz.");
		}
	}

}
