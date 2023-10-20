package ejercicio12;

import java.util.List;

public class ReporteDeConstruccion {

	private List<Pieza> lista;

	public ReporteDeConstruccion(List<Pieza> lista) {
		super();
		this.lista = lista;
	}

	public double volumenDeMateria(String material) {
		return lista
				.stream()
				.filter(pieza -> pieza.getMaterial().equals(material))
				.mapToDouble(pieza -> pieza.getVolumen())
				.sum();
	}
	
	public double superficieDeColor(String color) {
		return lista
				.stream()
				.filter(pieza -> pieza.getColor().equals(color))
				.mapToDouble(pieza -> pieza.getVolumen())
				.sum();
	}

}
