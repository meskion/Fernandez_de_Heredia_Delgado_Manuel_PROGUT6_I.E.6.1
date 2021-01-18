package util;

import java.util.Arrays;

/**
 * Clase de utilidad con metodos para trabajar con Strings.
 * 
 * @author manuf
 *
 */
public class Words {

	public static int countLetters(String s, char t) {
		int count = 0;

		String s2 = new String(s);
		s2.toLowerCase();
		for (int i = 0; i < s2.length(); i++) {
			if (s2.charAt(i) == t) {
				count++;
			}

		}

		return count;
	}

	/**
	 * Cuenta las veces que aparecen en un String los caracteres incluidos en el
	 * array del segundo parametro.
	 * 
	 * @param s String en el que contamos caracteres
	 * @param t array con los caracteres a contar.
	 * @return numero de veces que aparecen los caracteres en t.
	 */
	public static int countLetters(String s, char[] t) {
		int count = 0;
		Arrays.sort(t);
		String s2 = new String(s);
		s2.toLowerCase();
		for (int i = 0; i < s2.length(); i++) {

			if (Arrays.binarySearch(t, s2.charAt(i)) >= 0) {
				count++;
			}

		}

		return count;
	}

	/**
	 * Encuentra en un String una palabra aislada por espacios en blanco, y la
	 * sustituye por otra especificada como parametro
	 * 
	 * @param s           String donde buscar
	 * @param target      Palabra a cambiar.
	 * @param replacement palabra sustituta.
	 * @return Copia del string original pero con la sustitucion deseada.
	 */

	public static String replaceWord(String s, String target, String replacement) {

		String[] splitted = s.split(" ");
		for (int i = 0; i < splitted.length; i++) {
			if (splitted[i].equals(target)) {
				splitted[i] = replacement;
			}
		}
		return String.join(" ", splitted);

	}

	/**
	 * Dado un String, lo encripta segun el metodo cesar, que desplaza cada letra un
	 * cierto offset en el abecedario. Solo acepta espacios y letras. ningun otro simbolo o puntuacion.(ni la ñ)
	 * 
	 * @param s      String a encriptar
	 * @param offset Desplazamiento de las letras
	 * @return String encriptado.
	 */

	public static String caesarEncrypt(String s, int offset) {

		// Trabaja con minusculas solo.
		char[] charArr = s.toLowerCase().toCharArray();

		for (int i = 0; i < charArr.length; i++) {
			if (charArr[i] != ' ') {// Ignora espacios en blanco
				/*
				 * movemos la referencia del codigo unicode de los caracteres restando por 'a',
				 * entonces auxCode sera 0 cuando encuentra 'a', un 1 con la 'b', etc
				 */
				int auxCode = charArr[i] - 'a';
				/*
				 * Aplicamos el offset y con el operador modulo nos aseguramos de que nos de un
				 * valor entre 0 y 26
				 */

				auxCode = (auxCode + offset) % 26;
				/*
				 * Guardamos el codigo desfasado en el propio array de chars y volvemos a mover
				 * la referencia para que los caracteres tengan el codigo correcto
				 */
				charArr[i] = (char) ('a' + auxCode);
			}
		}
		return String.valueOf(charArr);
	}

	/**
	 * Invierte un string
	 * 
	 * @param s
	 * @return
	 */

	public static String reverse(String s) {
		
		return String.valueOf(
				Matrix.reverse(
				s.toCharArray()));
	}

	/**
	 * comprueba si un string es un palindromo, es decir, que sea simetrico
	 * 
	 * @param s
	 * @return
	 */
	public static boolean isPalindrome(String s) {

		return s.equals(reverse(s));

	}

	/**
	 * Comprueba que un string este bien formado como codigo de NIF
	 * 
	 * @param s
	 * @return
	 */
	public static boolean isNIF(String s) {
		/*
		 * '0' = 48 '9' = 57 'a' = 97 'z' = 122
		 */
		if (s.length() != 9) {
			return false;
		}

		char[] cArray = s.toLowerCase().toCharArray();
		if ((cArray[8]) < 97 || cArray[8] > 122) {
			return false;
		}

		for (int i = 0; i < cArray.length - 1; i++) {
			if (cArray[i] < 48 || cArray[i] > 57) {
				return false;
			}
		}

		return true;
	}
}
