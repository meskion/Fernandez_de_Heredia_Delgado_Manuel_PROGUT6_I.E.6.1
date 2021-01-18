package dynArray;

import java.util.Arrays;
/**
 * Clase que contiene un array con metodos para a�adir
 * elementos dinamicamente, sin necesidad de fijar un tama�o.
 * @author manuf
 *
 */
public class DynIntArray{
	
	private int[] arr;
	private int nextPos;
	
	public DynIntArray() {
		nextPos = 0;
		arr = new int [10];
	}

	/**
	 * Constructor que toma un array existente
	 * @param arr
	 */
	public DynIntArray(int[] arr) {
		
		this.arr = arr;
		nextPos =arr.length;
	}
	/**
	 * A�ade al final del array el elemento a. 
	 * Si no hay espacio aumenta el tama�o del array.
	 * @param a Elemento a a�adir al final.
	 */
	
	public void add(int a) {
		if (nextPos >= arr.length) {
			arr = Arrays.copyOf(arr, arr.length*2);	
		}
		
		arr[nextPos] = a;
		nextPos++;
	}
	public int length() {
		return nextPos;
	}

	/**
	 * Devuelve una copia sin espacios vacios extra del array.
	 * @return
	 */
	public int[] get() {
		return Arrays.copyOf(arr, nextPos);
	}
	/*
	 * TODO pop(), remove(), edit at position.
	 */
	
	

}
