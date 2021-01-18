package arraysMatrices;

import java.util.Scanner;

import util.Words;

public class Actividad28 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Introducir una cadena de texto:");
		String s = scan.nextLine();
		
		System.out.println("Es un palindromo? "+Words.isPalindrome(s));
		
		
		scan.close();
	}

}
