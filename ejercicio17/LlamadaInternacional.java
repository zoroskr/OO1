package ejercicio17;

import java.time.LocalDateTime;

public class LlamadaInternacional extends Llamada{
	private String origen;
	private String destino;
	
	public LlamadaInternacional(LocalDateTime fecha, int duracion, int emisor, int receptor, String origen, String destino) {
		super(fecha, duracion, emisor, receptor);
		this.origen = origen;
		this.destino = destino;
	}

	@Override
	public double costo() {
		if (this.getFecha().getHour() >= 8 && this.getFecha().getHour() <= 20) {
			return this.getDuracion()*4;
		}
		else {
			return this.getDuracion()*3;
		}
	}
	
	
	

}
