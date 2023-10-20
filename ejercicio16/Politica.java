package ejercicio16;

import java.time.LocalDate;

public interface Politica {
	
	public double calcularMonto (LocalDate fechaCancelacion, LocalDate fechaInicio, double montoTotal);


	
}
