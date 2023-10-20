package ejercicio17;

import java.time.LocalDateTime;

public class LlamadaUrbana extends Llamada {
	private int distancia;

	public LlamadaUrbana(LocalDateTime fecha, int duracion, int emisor, int receptor, int distancia) {
		super(fecha, duracion, emisor, receptor);
		this.distancia = distancia;
	}

	@Override
	public double costo() {
		double monto = 0;
		if (this.distancia < 100) {
			monto = 2;
		}
		if (this.distancia >= 100 && this.distancia <= 500) {
			monto = 2.5;
		}
		if (this.distancia > 500) {
			monto = 3;
		}
		
		return this.getDuracion() * monto + 5;
	}
	
	
	
	

}
