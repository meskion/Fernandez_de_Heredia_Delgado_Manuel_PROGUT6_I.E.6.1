package arraysMatrices;

import java.util.Scanner;

import util.Matrix;
import util.Words;

public class Actividad27 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Introducir una cadena de texto solo con caracteres alfabeticos:");
		String s = scan.nextLine();
		
		System.out.println("a) Invertida: "+Words.reverse(s));
		
		int countA = Words.countLetters(s, 'a');
		int countO = Words.countLetters(s, 'o');
		int countE = Words.countLetters(s, 'e');
		System.out.println(	"b) Veces que aparece \'a\': "+countA+
							"\n   Veces que aparece \'o\': "+countO+
							"\n   Veces que aparece \'e\': "+countE);
		if (countA > 10) {
			System.out.println("Exceso de a");
		}
		if (countO > 5) {
			System.out.println("Exceso de o");
		}
		if (countE > 3) {
			System.out.println("Exceso de e");
		}
		System.out.println("c) que palabra quieres buscar?");
		String t = scan.next();
//		He interpretado que solo queremos saber si la cadena leida esta
//		en el string original, sin requerir que esta rodeada de espacios
//		en blanco
		if (Matrix.contains(s.toCharArray(), t.toCharArray())) {
			System.out.println("La cadena original contiene \""+t+"\"");
		} else {
			System.out.println("La cadena original NO contiene \""+t+"\"");
		}
		scan.close();
	}

}
