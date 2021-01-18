package arraysMatrices;

import java.util.Scanner;

import util.Words;

public class Actividad25 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Leo un string por pantalla:");
		String s = scan.nextLine();
		System.out.println("Que palabra quieres sustituir?");
		String target = scan.next();
		System.out.println("por que palabra cambiamos "+target+"?");
		String replacement = scan.next();
		
		System.out.println(Words.replaceWord(s, target, replacement));
		scan.close();
	
	}
}
