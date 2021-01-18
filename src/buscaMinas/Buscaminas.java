package buscaMinas;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import util.Matrix;

/**
 * Clase que describe una partida simplificada del buscaminas. Tiene metodos
 * para empezar una partida y manipular los diferentes elementos del juego.
 * 
 * @author manuf
 *
 */
public class Buscaminas {

	private char[][] tablero = new char[8][8];
	private Scanner scan;
	private int numMinas;
	private int[][] posMinas;
	private boolean alive;

	/**
	 * Crea una nueva partida. Rellena el tablero de minas aleatoriamente, y crea un
	 * objeto buscaminas con la informacion del tablero y del juego.
	 */
	public Buscaminas() {

		Random rand = new Random();
		alive = true;
		numMinas = rand.nextInt(16) + 8;
		posMinas = new int[numMinas][2];
		// Llena el tablero con guiones como espacios sin pisar aun.
		Matrix.fill(tablero, '-');

		boolean repetido;

		int i = 0;
		while (i < numMinas) {
			int auxRow, auxCol;
			repetido = false;
			auxRow = rand.nextInt(8);
			auxCol = rand.nextInt(8);
			for (int[] mina : posMinas) {
				if (auxRow == mina[0] && auxCol == mina[1]) {
					repetido = true;
				}
			}
			if (!repetido) {

				posMinas[i][0] = auxRow;
				posMinas[i][1] = auxCol;
				tablero[posMinas[i][0]][posMinas[i][1]] = '*';
				i++;
			}

		}

	}

	/**
	 * Metodo inicial para desplegar una partida del juego.
	 */

	public static void startGame() {

		System.out.println("Bienvenido al buscaminas!");
		Buscaminas game = new Buscaminas();
		while (game.alive) {
			game.tryCell();
			if (game.alive) {
				game.showTablero(true);
			} else {
				game.showTablero(false);
			}
		}

	}

	/**
	 * Muestra el tablero por consola, puede elegir si mostrar las minas o no.
	 * 
	 * @param hide opcion para ocultar las minas
	 */

	private void showTablero(boolean hide) {
		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero[i].length; j++) {
				if (tablero[i][j] == '*' && hide) {
					System.out.print('-');
				} else {
					System.out.print(tablero[i][j]);
				}
			}
			System.out.print("\n");
		}

	}

	/**
	 * Prueba una posicion para ver si choca con una mina, si pasa, el juego
	 * termina.
	 */

	private void tryCell() {
		this.scan = new Scanner(System.in);
		System.out.println("En que celda quieres colocarte?(\"x y\")");
		// El jugador introduce una posicion por consola
		int[] pos = { scan.nextInt(), scan.nextInt() };

		tablero[pos[0]][pos[1]] = 'o';
		/*
		 * las posiciones que va  visitando el jugador se muestran con el caracter 'o'
		 */
		for (int[] i : posMinas) {
			/*
			 * Compara la posicion con la de cada mina
			 */
			if (Arrays.equals(i, pos)) {
				System.out.println("BOOM! Había una mina!");
				alive = false;
				tablero[pos[0]][pos[1]] = 'X';
			}
		}
	}

}
