package ejercicio15;


public class Reserva {
	private Propiedad propiedad;
	private DateLapse periodo;
	
	public Reserva(Propiedad propiedad, DateLapse periodo) {
		super();
		this.propiedad = propiedad;
		this.periodo = periodo;
	}

	public Propiedad getPropiedad() {
		return propiedad;
	}

	public void setPropiedad(Propiedad propiedad) {
		this.propiedad = propiedad;
	}

	public DateLapse getPeriodo() {
		return periodo;
	}

	public void setPeriodo(DateLapse periodo) {
		this.periodo = periodo;
	}
	
	public Boolean overlaps (DateLapse another) {
		return this.periodo.overlaps(another);
	}
	
	public double calcularPrecio () {
		return this.propiedad.getPrecioPorNoche() * this.periodo.sizeInDays();
	}
	
	public boolean esActual() {
		return this.periodo.laterFrom();
	}

}
