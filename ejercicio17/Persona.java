package ejercicio17;

import java.util.ArrayList;
import java.util.List;

public abstract class Persona {
	private String nombre;
	private String direccion;
	private int numero;
	private List<Llamada> llamadas;
	
	public Persona(String nombre, String direccion) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.numero = -1;
		this.llamadas = new ArrayList<Llamada>();
	}
	
	public void añadirNumero(int num) {
		this.numero = num;
	}
	
	public void registrarLlamadaUrbana(LlamadaUrbana llamadaN) {
		this.llamadas.add(llamadaN);
	}
	
	public void registrarLlamadaLocal (LlamadaLocal llamadaN) {
		this.llamadas.add(llamadaN);
	}
	
	public void registrarLlamadaInternacional (LlamadaInternacional llamadaN) {
		this.llamadas.add(llamadaN);
	}

	public int getNumero() {
		return numero;
	}
	
	public double calcularMonto () {
		this.llamadas.stream()
	}
	

}
