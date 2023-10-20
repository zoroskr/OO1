package ejercicio17;

import java.time.LocalDateTime;
import java.util.List;

public class Sistema {

	private List<Integer> disponibles;
	private List<Persona> clientes;

	public void agregarNumero(int num) {
		this.disponibles.add(num);
	}

	public PersonaFisica añadirClienteFisico(String nombre, String direccion, int DNI) {
		PersonaFisica nuevoC = new PersonaFisica(nombre, direccion, DNI);
		this.clientes.add(nuevoC);
		nuevoC.añadirNumero(this.disponibles.get(this.disponibles.size()));
		this.disponibles.remove(this.disponibles.size());
		return nuevoC;
	}

	public PersonaJuridica añadirClienteJuridico(String nombre, String direccion, int CUIT, String tipo) {
		PersonaJuridica nuevoC = new PersonaJuridica(nombre, direccion, CUIT, tipo);
		this.clientes.add(nuevoC);
		nuevoC.añadirNumero(this.disponibles.get(this.disponibles.size()));
		this.disponibles.remove(this.disponibles.get(this.disponibles.size()));
		return nuevoC;
	}

	private Persona buscarCliente(int num) {
		return this.clientes.stream().filter(p -> p.getNumero() == num).findFirst().orElse(null);
	}

	public LlamadaLocal registrarLlamadaLocal(LocalDateTime fecha, int duracion, int emisor, int receptor) {
		LlamadaLocal llamadaNew = new LlamadaLocal(fecha, duracion, emisor, receptor);
		this.buscarCliente(emisor).registrarLlamadaLocal(llamadaNew);
		;
		return llamadaNew;
	}

	public LlamadaUrbana registrarLlamadaUrbana(LocalDateTime fecha, int duracion, int emisor, int receptor,
			int distancia) {
		LlamadaUrbana llamadaNew = new LlamadaUrbana(fecha, duracion, emisor, receptor, distancia);
		this.buscarCliente(emisor).registrarLlamadaUrbana(llamadaNew);
		return llamadaNew;
	}

	public LlamadaInternacional registrarLlamadaInternacional(LocalDateTime fecha, int duracion, int emisor,
			int receptor, String origen, String destino) {
		LlamadaInternacional llamadaNew = new LlamadaInternacional(fecha, duracion, emisor, receptor, origen, destino);
		this.buscarCliente(emisor).registrarLlamadaInternacional(llamadaNew);
		return llamadaNew;
	}
	
	public Factura facturarLlamada (Persona cliente, LocalDateTime fechaInicio, LocalDateTime fechaFin) {
		
		return facturaN;
	}

}
