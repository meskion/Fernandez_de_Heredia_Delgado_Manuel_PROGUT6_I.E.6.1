package arraysMatrices;

import java.util.StringTokenizer;

public class Actividad30 {

	public static void main(String[] args) {

		String notas = "Juan Carlos \n 8.5 \n Andrés \n 4.9 \n Pedro \n 3.8 \n Juan \n 6.3";

		
		StringTokenizer st = new StringTokenizer(notas, "\n");
		while (st.hasMoreTokens()) {
	         System.out.println("El Alumno "+st.nextToken().strip()+" ha sacado la nota "+st.nextToken().strip()+".");
	     }

/*
 * Segun la propia documentacion de la clase StringTokenizer, esta clase no se deberia usar,
 * y en su lugar deberia usarse el metodo split de la clase String. Abajo esta comentado el
 * codigo equivalente usando ese metodo para resolver el ejercicio.
 */
		
//		String[] splitted = notas.split(" \n ");
//		for (int i = 0; i < splitted.length; i+=2) {
//			System.out.println("El Alumno " +splitted[i]+ " ha sacado la nota "+splitted[i+1]+".");
//		}
		
	}

}
