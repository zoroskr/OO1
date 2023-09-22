package ejercicio8;

import java.time.LocalDate;

public class Factura {
	private double montoEnergiaActiva;
	private double descuento;
	private java.time.LocalDate fecha;
	private Usuario usuario;
	
	public Factura(double montoEnergiaActiva, double descuento, Usuario usuario) {
		super();
		this.montoEnergiaActiva = montoEnergiaActiva;
		this.descuento = descuento;
		this.fecha = LocalDate.now();
		this.usuario = usuario;
	}
	public double getMontoEnergiaActiva() {
		return montoEnergiaActiva;
	}
	public void setMontoEnergiaActiva(double montoEnergiaActiva) {
		this.montoEnergiaActiva = montoEnergiaActiva;
	}
	public double getDescuento() {
		return descuento;
	}
	public void setDescuento(double descuento) {
		this.descuento = descuento;
	}
	public java.time.LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(java.time.LocalDate fecha) {
		this.fecha = fecha;
	}
	
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public double montoTotal() {
		return this.getMontoEnergiaActiva() - this.getMontoEnergiaActiva()*(this.getDescuento()/100);
	}
	public Usuario usuario () {
		return this.getUsuario();
	}
	public java.time.LocalDate fecha (){
		return this.getFecha();
	}
	public double descuento () {
		return this.getDescuento();
	}
	
	
	

}
