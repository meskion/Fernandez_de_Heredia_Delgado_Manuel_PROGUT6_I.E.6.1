package arraysMatrices;

import java.util.Random;

import util.Numbers;

public class Actividad32 {

	public static void main(String[] args) {

	Random rand = new Random();
	System.out.println("Genero un numero aleatorio:");
	int n = rand.nextInt(100); //~20% de que salga capicua
//	int n = 33; 
	System.out.println(n);
	System.out.println("es capicua?");
	System.out.println(Numbers.esCapicua(n));
	
	
	
	
	
	}
}
