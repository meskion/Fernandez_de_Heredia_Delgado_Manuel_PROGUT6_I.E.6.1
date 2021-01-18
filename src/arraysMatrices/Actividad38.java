package arraysMatrices;

import java.util.Random;

import util.Numbers;

public class Actividad38 {

	public static void main(String[] args) {
		Random rand = new Random();
		System.out.println("Genero un numero aleatorio:");
		/*
		 * El factorial de 13 ya se pasa del rango de int, si quisiera usarlo para
		 * mayores numeros usaria long, pero aun asi con long solo se podria factorizar
		 * hasta el 20 sin que haya overflow.
		 */
		int n = rand.nextInt(13);
		System.out.println(n);
		System.out.println("Calculo su factorial:");
		System.out.println(Numbers.fact(n));

	}

}
