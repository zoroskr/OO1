package ejercicio16;

import java.util.ArrayList;
import java.util.List;

public class Propiedad {
	private String nombre;
	private String decripcion;
	private double precioPorNoche;
	private String direccion;
	private Usuario propietario;
	private List<Reserva> reservas;

	public Propiedad(String nombre, String decripcion, double precioPorNoche, String direccion, Usuario propietario) {
		super();
		this.nombre = nombre;
		this.decripcion = decripcion;
		this.precioPorNoche = precioPorNoche;
		this.direccion = direccion;
		this.propietario = propietario;
		this.reservas = new ArrayList<Reserva>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDecripcion() {
		return decripcion;
	}

	public void setDecripcion(String decripcion) {
		this.decripcion = decripcion;
	}

	public double getPrecioPorNoche() {
		return precioPorNoche;
	}

	public void setPrecioPorNoche(double precioPorNoche) {
		this.precioPorNoche = precioPorNoche;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Usuario getPropietario() {
		return propietario;
	}

	public void setPropietario(Usuario propietario) {
		this.propietario = propietario;
	}
	
	public Boolean disponibilidad (DateLapse periodo) {
		return this.reservas.stream().noneMatch(reserva -> reserva.overlaps(periodo));
	}
	
	public void añadirReserva (Reserva reserva) {
		this.reservas.add(reserva);
	}
	
	public void eliminarReserva (Reserva reserva) {
		this.reservas.remove(reserva);
	}
	
	public double calcularIngresoPropiedad(DateLapse periodo) {
		return this.reservas.stream().filter(reserva -> reserva.overlaps(periodo)).mapToDouble(reserva -> reserva.calcularPrecio()).sum();
		
	}

}
