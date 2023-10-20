package Ejercicio13;

import java.util.List;

public class Email {
	private String titulo;
	private String cuerpo;
	private List<Archivo> adjuntos;
	
	public Email(String titulo, String cuerpo, List<Archivo> adjuntos) {
		super();
		this.titulo = titulo;
		this.cuerpo = cuerpo;
		this.adjuntos = adjuntos;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getCuerpo() {
		return cuerpo;
	}

	
	public List<Archivo> getAdjuntos() {
		return adjuntos;
	}

	public double espacioOcupado() {
		return this.titulo.length() + this.cuerpo.length() + this.adjuntos.stream().mapToDouble(a -> a.tamaño()).sum();
	}
}
