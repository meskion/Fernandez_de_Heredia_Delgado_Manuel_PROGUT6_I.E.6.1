package arraysMatrices;

import java.util.InputMismatchException;
import java.util.Scanner;

import contacto.Contacto;
import contacto.Contactos;

public class Actividad35 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		boolean continuar = true;
		String nombre, direccion;
		int index, telefono;
		Contactos agenda = new Contactos();

		while (continuar) {
			try {
				System.out.println("A: Añadir un contacto\n" + "D: Eliminar Contacto\n" + "X: Ver lista de Contactos\n"
						+ "M: Modificar un contacto\n" + "Q: Salir de la aplicacion");
				switch (scan.nextLine().toUpperCase()) {
				case "A":
					// add
					System.out.println("Nombre del nuevo contacto?");
					nombre = scan.nextLine();
					System.out.println("Direccion del nuevo contacto?");
					direccion = scan.nextLine();
					System.out.println("telefono del nuevo contacto?");
					telefono = scan.nextInt();
					scan.nextLine();
					agenda.add(new Contacto(nombre, direccion, telefono));
					break;
				case "D":
					// delete
					System.out.println("Nombre del contacto a borrar?");
					if (agenda.remove(scan.nextLine())) {
						System.out.println("Eliminado con exito");
					} else {
						System.out.println("No existe un contacto con ese nombre");
					}
					break;
				case "X":
					// imprimir
					System.out.println(agenda.toString());
					break;
				case "M":
					// Modificar
					System.out.println("posicion del contacto que vas a cambiar?");
					index = scan.nextInt();
					scan.nextLine();
					System.out.println("Nombre nuevo del contacto?");
					nombre = scan.nextLine();
					System.out.println("Direccion nueva del contacto?");
					direccion = scan.nextLine();
					System.out.println("telefono nuevo del contacto?");
					telefono = scan.nextInt();
					scan.nextLine();
					agenda.setContacto(new Contacto(nombre, direccion, telefono), index);

					break;
				case "Q":
					// bye bye
					continuar = false;
					break;
				default:
					System.err.println("ERROR: Opcion no Valida");
				}
				

			} catch (InputMismatchException e) {
				
				System.err.println("Tipo de dato no valido, vuelva a intentarlo.");
				scan.nextLine();
			} 
		}
		scan.close();
	}
}
