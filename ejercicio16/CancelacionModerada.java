package ejercicio16;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class CancelacionModerada implements Politica {

	@Override
	public double calcularMonto(LocalDate fechaCancelacion, LocalDate fechaInicio, double montoTotal) {
		if ((int) fechaCancelacion.until(fechaInicio, ChronoUnit.DAYS) > 2) {
			return montoTotal;
		}
		else {
			return montoTotal/2;
		}
	}
	

}
