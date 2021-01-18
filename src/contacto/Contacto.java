package contacto;
/**
 * Clase simple que guarda tres atributos de un contacto
 * 
 * @author manuf
 *
 */
public class Contacto {
	private String nombre;
	private String direccion;
	private int telefono;
	
	public Contacto(String nombre, String direccion, int telefono) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	@Override
	public String toString() {
		return nombre + ": " 
				+"\n\t"+ telefono
				+"\n\t"+ direccion;
	}
	
	

}
