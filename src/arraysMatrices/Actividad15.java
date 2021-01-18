package arraysMatrices;

import java.util.Scanner;

import util.Matrix;

public class Actividad15 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Creamos un nuevo array leyendo valores por consola.");
		/*
		 * El factorial de 13 ya se pasa del rango de int, si quisiera usarlo para
		 * mayores numeros usaria long, pero aun asi con long solo se podria factorizar
		 * hasta el 20 sin que haya overflow.
		 * 
		 * Asi que ojo con los valores introducidos.
		 */
		int[] arr = new int[20];
		Matrix.writeArray(arr, scan);

		System.out.println(Matrix.toString(arr));

		System.out.println("Array con los factoriales del array leido:");
		System.out.println(Matrix.toString(Matrix.vectorFact(arr)));

	}

}
