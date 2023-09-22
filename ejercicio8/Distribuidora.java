package ejercicio8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Distribuidora {
	private double precioKWH;
	private List<Usuario> lista;
	
	
	
	public Distribuidora(double precioKWH) {
		super();
		this.precioKWH = precioKWH;
		this.lista = new ArrayList<Usuario>();
	}

	
	
	public double getPrecioKW() {
		return precioKWH;
	}



	public void setPrecioKWH(double precioKWH) {
		this.precioKWH = precioKWH;
	}



	public List<Usuario> getUsuarios() {
		return lista;
	}



	public void setUsuarios(List<Usuario> lista) {
		this.lista = lista;
	}



	public void agregarUsuario (Usuario usuario) {
		this.lista.add(usuario);
	}
	
	public List<Factura> facturar () {
		return this.lista.stream().map(l -> l.facturarEnBaseA(this.precioKWH)).collect(Collectors.toList());
	}
	
	public double consumoTotalActiva () {
		return this.lista.stream().mapToDouble(l -> l.ultimoConsumoActiva()).sum();
	}

}
