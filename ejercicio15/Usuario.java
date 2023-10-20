package ejercicio15;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
	private String nombre;
	private String direccion;
	private int dni;
	private List<Propiedad> alquileres;
	private List<Reserva> reservas;
	
	public Usuario(String nombre, String direccion, int dni) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.dni = dni;
		this.alquileres = new ArrayList<Propiedad>();
		this.reservas = new ArrayList<Reserva>();
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

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}
	
	
	public List<Propiedad> getAlquileres() {
		return alquileres;
	}

	public List<Reserva> getReservas() {
		return reservas;
	}

	public void añadirReserva (Reserva reserva) {
		this.reservas.add(reserva);
	}
	
	public void eliminarReserva (Reserva reserva) {
		this.reservas.remove(reserva);
	}
	
	public double totalReservas (DateLapse periodo) {
		return this.alquileres.stream().mapToDouble(propiedad -> propiedad.calcularIngresoPropiedad(periodo)).sum();
	}
}
