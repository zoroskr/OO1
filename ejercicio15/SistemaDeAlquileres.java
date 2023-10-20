package ejercicio15;

import java.util.List;
import java.util.stream.Collectors;

public class SistemaDeAlquileres {
	private List<Usuario> usuarios;
	private List<Propiedad> propiedades;
	
	public Usuario registrarUsuario(String nombre, String direccion, int dni){
		Usuario user = new Usuario (nombre, direccion, dni);
		this.usuarios.add(user);
		return user;
	}
	
	public Propiedad registrarPropiedad (String nombre, String descripcion, double precio, String direccion, Usuario propietario) {
		Propiedad propiedad = new Propiedad(nombre, descripcion, precio, direccion, propietario);
		this.propiedades.add(propiedad);
		return propiedad;
	}
	
	public List<Propiedad> buscarPropiedad (DateLapse periodo) {
		return this.propiedades.stream().filter(propiedad -> propiedad.disponibilidad(periodo)).collect(Collectors.toList());
	}
	
	public Reserva realizarReserva (Propiedad propiedadAlquilar, DateLapse periodo, Usuario inquilino) {
		if (propiedadAlquilar.disponibilidad(periodo)) {
			Reserva reserva = new Reserva(propiedadAlquilar, periodo);
			propiedadAlquilar.añadirReserva(reserva);
			inquilino.añadirReserva(reserva);
			return reserva;
		}
		return null;
	}
	
	public double calcularPrecio (Reserva reserva) {
		return reserva.calcularPrecio();
	}
	
	public void eliminarReserva (Reserva reserva) {
		if (reserva.esActual()) {
			this.usuarios.stream().forEach(usuario -> usuario.eliminarReserva(reserva));
			this.propiedades.stream().forEach(propiedad -> propiedad.eliminarReserva(reserva));
		}
	}
	
	public List<Reserva> obtenerReservas (Usuario usuario){
		return usuario.getReservas();
	}
	
	public double calcularIngresos (Usuario propietario, DateLapse periodo) {
		return propietario.totalReservas(periodo);
	}

}
