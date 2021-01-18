package arraysMatrices;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import dynArray.DynIntMatrix;
import util.Matrix;

public class Actividad36 {

	static DynIntMatrix ocupadas = new DynIntMatrix();
	static char[][] sopa = new char[15][15];
	static String[] palabras = new String[10];

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce palabras de hasta 15 letras para la sopa.");
		for (int i = 0; i < palabras.length; i++) {
			do {
				System.out.println("Siguiente palabra ? (" + i + ")");
				palabras[i] = scan.nextLine().toUpperCase();

			} while (palabras[i].length() > 15);

		}

		Matrix.randFill(sopa, 'A', 'Z');

		for (String s : palabras) {

			/*
			 * Hay 8 direcciones desde la que escribir una palabra en una matriz, voy a
			 * considerar solo 4, las mas legibles, 0: derecha, 1: abajo, 2: derecha abajo,
			 * 3: derecha arriba
			 */

			// ahora hay que comprobar si en ese espacio pisa a otra palabra.
			placeChars(s);

		}

		System.out.println(Matrix.deepToString(sopa));
		System.out.println(Matrix.deepToString(ocupadas.get()));
		scan.close();
	}

	static void placeChars(String s) {
		int sLen = s.length();

		boolean wrongPlacedChar;
		int[][] sPos = new int[sLen][2];
		do {
			wrongPlacedChar = false;
			// Escogemos una fila donde colocarla:
			selectCharPos(sLen, sPos);

			int[][] aux = ocupadas.get();
			/*
			 * comprueba que la palabra colocada no pisa con palabras anteriores, si pisa,
			 * pero se da el caso que la letra de las dos palabras en esa posicion es la
			 * misma, la da por valida. En otro caso, vuelve a intentar colocar la palabra
			 * de 0.
			 */
			for (int[] i : aux) {
				for (int j = 0; j < sLen; j++) {
					if (sopa[i[0]][i[1]] != s.charAt(j) && Arrays.equals(i, sPos[j])) {
						wrongPlacedChar = true;
					}

				}
			}
		} while (wrongPlacedChar);
		for (int i = 0; i < sLen; i++) {
			/*
			 * Una vez colocada la palabra, se actualiza la matriz de la sopa, y la lista de
			 * posiciones ocupadas
			 */
			sopa[sPos[i][0]][sPos[i][1]] = s.charAt(i);
			ocupadas.add(sPos[i]);
		}

	}

	static void selectCharPos(int sLen, int[][] sPos) {
		Random rand = new Random();
		int direction = rand.nextInt(4);
		int fila, col;
		switch (direction) {
		case 0:// HORIZONTAL
			fila = rand.nextInt(15);
			
			col = rand.nextInt(15 - sLen);
			// Tabla con posiciones de s

			for (int i = 0; i < sLen; i++) {
				sPos[i][0] = fila;
				sPos[i][1] = col + i;
			}

			break;

		case 1:// VERTICAL
			fila = rand.nextInt(15 - sLen);
		
			col = rand.nextInt(15);
			// Tabla con posiciones de s

			for (int i = 0; i < sLen; i++) {
				sPos[i][0] = fila + i;
				sPos[i][1] = col;
			}
			break;
		case 2:// DIAG UP
			fila = rand.nextInt(15 - sLen);
			// y una columna:
			col = rand.nextInt(15 - sLen) + sLen;
			// Tabla con posiciones de s

			for (int i = 0; i < sLen; i++) {
				sPos[i][0] = fila + i;
				sPos[i][1] = col - i;
			}
			break;
		case 3:// DIAG DOWN
			fila = rand.nextInt(15 - sLen);
			// y una columna:
			col = rand.nextInt(15 - sLen);
			// Tabla con posiciones de s

			for (int i = 0; i < sLen; i++) {
				sPos[i][0] = fila + i;
				sPos[i][1] = col + i;
			}
			break;
		}

	}
}
