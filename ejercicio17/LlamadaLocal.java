package ejercicio17;

import java.time.LocalDateTime;

public class LlamadaLocal extends Llamada{

	public LlamadaLocal(LocalDateTime fecha, int duracion, int emisor, int receptor) {
		super(fecha, duracion, emisor, receptor);
	}

	@Override
	public double costo () {
		return this.getDuracion() * 1;
	}
	

	
	
}
