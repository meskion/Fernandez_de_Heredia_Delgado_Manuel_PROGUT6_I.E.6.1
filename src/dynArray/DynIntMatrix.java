package dynArray;

import java.util.Arrays;

public class DynIntMatrix {

	private DynIntArray[] arr;
	private int nextPos;

	public DynIntMatrix() {
		nextPos = 0;
		arr = new DynIntArray[8];
	}

	/**
	 * Añade al final del array el elemento a. Si no hay espacio aumenta el tamaño
	 * del array.
	 * 
	 * @param a Elemento a añadir al final.
	 */
	
	

	public void add(int[] a) {
		if (nextPos >= arr.length) {
			arr = Arrays.copyOf(arr, arr.length * 2);
		}

		arr[nextPos] = new DynIntArray(a);
		nextPos++;
	}

	public int length() {
		return nextPos;
	}

	public void add(int x, int y) {
		int[] aux = { x, y };
		this.add(aux);
	}

	/**
	 * Devuelve una copia sin espacios vacios extra del array.
	 * 
	 * @return
	 */
	public int[][] get() {
		/*
		 * Asumimos que la matriz es rectangular para poder pasarlo a array
		 * 
		 */
		int[][] res = {};
		if (nextPos > 0) {
			res = new int[nextPos][arr[0].length()];
			for (int i = 0; i < nextPos; i++) {
				res[i] = arr[i].get();
			}
		}

		return res;
	}

}
