package arraysMatrices;

import java.util.Scanner;

import util.Words;

public class Actividad29 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Introducir una cadena de texto:");
		String s = scan.nextLine();
		
		System.out.println("Es un NIF Valido? ");
		if (Words.isNIF(s)){
			//Muestra el dni sin la letra.
			System.out.println(s.substring(0, s.length()-1));
		} else {
			System.out.println("NIF no valido");
		}
		
		scan.close();
	
	
	}

}
