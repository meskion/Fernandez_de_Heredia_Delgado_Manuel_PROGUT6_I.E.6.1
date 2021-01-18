package arraysMatrices;

import java.util.Scanner;

import util.Words;

public class Actividad24 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		char[] vowels = { 'a', 'e', 'i', 'o', 'u' };
		System.out.println("Leo un string por pantalla:");
		System.out.println("Tiene "+Words.countLetters(scan.next(), vowels)+" vocales");
		scan.close();
	}

}
