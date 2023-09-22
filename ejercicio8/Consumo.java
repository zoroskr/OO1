package ejercicio8;

import java.time.LocalDate;

public class Consumo {
	private java.time.LocalDate fecha;
	private double consumoEnergiaActiva;
	private double consumoEnergiaReactiva;
	
	public Consumo(LocalDate fecha, double consumoEnergiaActiva, double consumoEnergiaReactiva) {
		super();
		this.fecha = fecha;
		this.consumoEnergiaActiva = consumoEnergiaActiva;
		this.consumoEnergiaReactiva = consumoEnergiaReactiva;
	}
	
	
	public java.time.LocalDate getFecha() {
		return fecha;
	}



	public void setFecha(java.time.LocalDate fecha) {
		this.fecha = fecha;
	}



	public double getConsumoEnergiaActiva() {
		return consumoEnergiaActiva;
	}



	public void setConsumoEnergiaActiva(double consumoEnergiaActiva) {
		this.consumoEnergiaActiva = consumoEnergiaActiva;
	}



	public double getConsumoEnergiaReactiva() {
		return consumoEnergiaReactiva;
	}



	public void setConsumoEnergiaReactiva(double consumoEnergiaReactiva) {
		this.consumoEnergiaReactiva = consumoEnergiaReactiva;
	}



	public double costoEnBaseA (double precioKWh) {
		return (this.getConsumoEnergiaActiva() * precioKWh);
	}
	
	public double factorDePotencia () {
		return this.getConsumoEnergiaActiva() / (Math.sqrt((Math.pow (this.getConsumoEnergiaActiva(),2) + Math.pow(getConsumoEnergiaReactiva(), 2))));
	}
	
}
