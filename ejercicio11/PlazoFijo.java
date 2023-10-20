package ejercicio11;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class PlazoFijo implements Inversion {
	private LocalDate fechaDeConstitucion;
	private double montoDepositado;
	private double porcentajeDeInteresDiario;

	public PlazoFijo(LocalDate fechaDeConstitucion, double montoDepositodo, double porcentajeDeInteresDiario) {
		super();
		this.fechaDeConstitucion = fechaDeConstitucion;
		this.montoDepositado = montoDepositodo;
		this.porcentajeDeInteresDiario = porcentajeDeInteresDiario;
	}

	public LocalDate getFechaDeConstitucion() {
		return fechaDeConstitucion;
	}

	public void setFechaDeConstitucion(LocalDate fechaDeConstitucion) {
		this.fechaDeConstitucion = fechaDeConstitucion;
	}

	public double getMontoDepositodo() {
		return montoDepositado;
	}

	public void setMontoDepositodo(double montoDepositodo) {
		this.montoDepositado = montoDepositodo;
	}

	public double getPorcentajeDeInteresDiario() {
		return porcentajeDeInteresDiario;
	}

	public void setPorcentajeDeInteresDiario(double porcentajeDeInteresDiario) {
		this.porcentajeDeInteresDiario = porcentajeDeInteresDiario;
	}

	@Override
	public double valorActual() {
		long diasPasados = ChronoUnit.DAYS.between(this.fechaDeConstitucion, LocalDate.now());
		return this.montoDepositado + this.montoDepositado * (this.porcentajeDeInteresDiario*diasPasados);
	}

}
