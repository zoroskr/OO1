package Ejercicio13;

public class Archivo {
	private String nombre;

	public Archivo(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int tamaño() {
		return this.nombre.length();
	}

}
