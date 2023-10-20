package ejercicio17;

import java.time.LocalDateTime;

public abstract class Llamada {
	private LocalDateTime fecha;
	private int duracion;
	private int emisor;
	private int receptor;
	
	public Llamada(LocalDateTime fecha, int duracion, int emisor, int receptor) {
		super();
		this.fecha = fecha;
		this.duracion = duracion;
		this.emisor = emisor;
		this.receptor = receptor;
	}

	public LocalDateTime getFecha() {
		return fecha;
	}

	public int getDuracion() {
		return duracion;
	}

	public int getEmisor() {
		return emisor;
	}

	public int getReceptor() {
		return receptor;
	}
	
	public abstract double costo();
	
}
