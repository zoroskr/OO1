package ejercicio17;

import java.time.LocalDateTime;

public class Factura {
	private Persona cliente;
	private LocalDateTime facturacion;
	private LocalDateTime fechaInicio;
	private LocalDateTime fechaFin;
	private double monto;
	
	public Factura(Persona cliente, LocalDateTime facturacion, LocalDateTime fechaInicio, LocalDateTime fechaFin,
			double monto) {
		super();
		this.cliente = cliente;
		this.facturacion = facturacion;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.monto = monto;
	}

	public Persona getCliente() {
		return cliente;
	}

	public LocalDateTime getFacturacion() {
		return facturacion;
	}

	public LocalDateTime getFechaInicio() {
		return fechaInicio;
	}

	public LocalDateTime getFechaFin() {
		return fechaFin;
	}

	public double getMonto() {
		return monto;
	}
	
	
	
}
