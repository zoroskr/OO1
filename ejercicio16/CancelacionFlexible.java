package ejercicio16;

import java.time.LocalDate;

public class CancelacionFlexible implements Politica {

	@Override
	public double calcularMonto(LocalDate fechaCancelacion, LocalDate fechaInicio, double montoTotal) {
		return montoTotal;
	}

	
}
