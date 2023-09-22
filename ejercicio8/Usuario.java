package ejercicio8;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
	private String nombre;
	private String direccion;
	private List<Factura> facturas;
	private List<Consumo> consumos;
	public Usuario(String nombre, String direccion) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.facturas = new ArrayList<Factura> ();
		this.consumos = new ArrayList<Consumo> ();
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
	public List<Factura> getFactura() {
		return facturas;
	}
	public void setFactura(List<Factura> factura) {
		this.facturas = factura;
	}
	public List<Consumo> getConsumo() {
		return consumos;
	}
	public void setConsumo(List<Consumo> consumo) {
		this.consumos = consumo;
	}
	
	public void agregarMedicion (Consumo medicion) {
		this.consumos.add(medicion);
	}
	public double ultimoConsumoActiva() {
		if (this.consumos.size() > 0) {
			return this.consumos.stream().max((Consumo c1, Consumo c2) -> c1.getFecha().compareTo(c2.getFecha())).orElse(null).getConsumoEnergiaActiva();
		}
		return 0;
	}
	
	public Consumo ultimoConsumo () {
		if (this.consumos.size() > 0) {
			return this.consumos.stream().max((Consumo c1, Consumo c2) -> c1.getFecha().compareTo(c2.getFecha())).orElse(null);
		}
		return null;
	}
	
	public Factura facturarEnBaseA(double precioKWh) {
		int descuento = 0;
		double total = 0;
		if (this.consumos.size() > 0) {
		Consumo aux = this.consumos.stream().max((Consumo c1, Consumo c2) -> c1.getFecha().compareTo(c2.getFecha())).orElse(null);
		total = aux.costoEnBaseA(precioKWh);
		if (aux.factorDePotencia() > 0.8) {
			descuento = 10;
		}
		}
		Factura factura_usuario = new Factura (total, descuento, this);
		return factura_usuario;
		
	}
	public List<Factura> facturas(){
		return this.facturas;
	}
	
	
}
