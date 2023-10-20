package ejercicio11;

import java.util.List;

public class Inversor implements Inversion {
	private String nombre;
	private List<Inversion> inversiones;
	public Inversor(String nombre, List<Inversion> inversiones) {
		super();
		this.nombre = nombre;
		this.inversiones = inversiones;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public List<Inversion> getInversiones() {
		return inversiones;
	}
	public void setInversiones(List<Inversion> inversiones) {
		this.inversiones = inversiones;
	}
	@Override
	public double valorActual() {
		return this.inversiones.stream().mapToDouble(i -> i.valorActual()).sum();
	}	
}
