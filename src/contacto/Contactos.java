package contacto;

import java.util.Arrays;

/**
 * Clase que almacena objetos tipo contacto de manera dinamica, permitiendo la
 * agregacion, eliminacion y modificacion de los elementos.
 * 
 * @author manuf
 *
 */
public class Contactos {

	

	/*
	 * Este atributo cuenta donde hay que insertar el siguiente elemento, tambien es
	 * el numero de elementos no vacios en el array contactos.
	 */
	private int nextCont;
	private Contacto[] contactos;
	/**
	 * Constructor por defecto.
	 */
	public Contactos() {
		nextCont = 0;
		contactos = new Contacto[8];
	}

	/**
	 * Constructor mediate un array de contactos.
	 * 
	 * @param contactos
	 */
	public Contactos(Contacto[] contactos) {
		this.contactos = contactos;
		nextCont = contactos.length;
	}

	/**
	 * Metodo para añadir un nuevo contacto al final de la lista
	 * 
	 * @param c contacto a añadir
	 */
	public void add(Contacto c) {
		if (nextCont >= contactos.length) {
			contactos = Arrays.copyOf(contactos, contactos.length * 2);
		}

		contactos[nextCont] = c;
		nextCont++;
	}

	/**
	 * Elimina un contacto del array segun su nombre.
	 * 
	 * @param nombre atributo nombre del contacto a borrar
	 * @return devuelve true si encuentra un contact con el nombre dado
	 */
	public boolean remove(String nombre) {

		for (int i = 0; i < nextCont; i++) {
			if (contactos[i].getNombre().equals(nombre)) {
				removeAt(i);
				return true;
			}
		}

		return false;

	}

	/**
	 * Elimina el elemento en la poosicion dada, y desplaza el resto de contactos
	 * para que no queden huecos vacios en medio del array.
	 * 
	 * @param index posicion del elemento a borrar.
	 */
	private void removeAt(int index) {
		/*
		 * index debe ser < nextCont. Habria que lanzar una excepcion. Como es privado y
		 * solo lo accede remove(),que es imposible que seleccione un indice incorrecto,
		 * no hay problema
		 * 
		 */
		for (int i = index; i < nextCont; i++) {
			contactos[i] = contactos[i + 1];
		}
		nextCont--;

	}

	/**
	 * Devuelve una copia del array interno con los contactos. y con el tamaño
	 * ajustado.
	 * 
	 * @return
	 */
	public Contacto[] toArray() {
		return Arrays.copyOf(contactos, nextCont);
	}

	/**
	 * Devuelve el contacto en la posicion index
	 * 
	 * @param index
	 * @return
	 */
	public Contacto getContacto(int index) {
		/*
		 * Deberia lanzar excepcion si se pasa de nextCont No se si es mejor practica
		 * devolver el objeto asi o devolver una copia y hacer un metodo set para
		 * acceder a los contactos de la agenda.
		 * 
		 */

		return contactos[index];
	}

	/**
	 * Actualiza el objeto en la posicion index con el objeto dado.
	 * 
	 * @param c
	 * @param index
	 * @return
	 */
	public boolean setContacto(Contacto c, int index) {
		if (index < nextCont) {
			contactos[index] = c;
			return true;
		}
		return false;
	}

	/**
	 * Devuelve un string con la informacion del objeto.
	 */
	public String toString() {
		Contacto[] copia = toArray();
		String res = "";
		for (Contacto contacto : copia) {
			res += contacto.toString() + "\n";
		}
		return res;
	}

}
