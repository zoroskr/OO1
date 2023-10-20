package ejercicio16;

import java.time.LocalDate;

public class CancelacionEstricta implements Politica {

	@Override
	public double calcularMonto(LocalDate fechaCancelacion, LocalDate fechaInicio, double montoTotal) {
		return 0;
	}
	
	
}
