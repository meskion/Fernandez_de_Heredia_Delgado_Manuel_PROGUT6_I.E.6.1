package arraysMatrices;

import java.util.Arrays;
//import java.util.StringTokenizer;

public class Actividad31 {

	public static void main(String[] args) {

		String notas = "Juan Carlos \n 8.5 \n Andrés \n 4.9 \n Pedro \n 3.8 \n Juan \n 6.3";

		String[] splitted = notas.split(" \n ");
		double[] valorNotas = new double[splitted.length/2];

		for (int i = 0; i < splitted.length; i+=2) {
			System.out.println("El Alumno " +splitted[i]+ " ha sacado la nota "+splitted[i+1]+".");
			valorNotas[(i+1)/2] =  Double.parseDouble(splitted[i+1]);
		}
		System.out.println("Notas: "+Arrays.toString(valorNotas));
		
		
		/*
		 * Segun la propia documentacion de la clase StringTokenizer, esta clase no se deberia usar,
		 * y en su lugar deberia usarse el metodo split de la clase String. Abajo esta comentado el
		 * codigo equivalente usando el string tokenizer para resolver el ejercicio.
		 */
		
//		StringTokenizer st = new StringTokenizer(notas, "\n");
//		int i = 0
//		while (st.hasMoreTokens()) {
//			String nombre = st.nextToken().strip();
//			String nota = st.nextToken().strip();
//			valorNotas[i] = nota;
//			i++;
//	         System.out.println("El Alumno "+nombre+" ha sacado la nota "+nota+".");
//	     }
	
		
	}
	



}
