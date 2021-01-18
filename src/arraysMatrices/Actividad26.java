package arraysMatrices;

import java.util.Scanner;

import util.Words;

public class Actividad26 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Leo un string por pantalla:");
		
		String s = scan.nextLine();
		System.out.println(Words.caesarEncrypt(s, 3));
		scan.close();

	}

}
