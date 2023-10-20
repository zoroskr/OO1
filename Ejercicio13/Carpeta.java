package Ejercicio13;

import java.util.List;

public class Carpeta {
	private String nombre;
	private List<Email> emails;
	
	
	public Carpeta(String nombre, List<Email> emails) {
		super();
		this.nombre = nombre;
		this.emails = emails;
	}


	public String getNombre() {
		return nombre;
	}
	
	public void añadirMail (Email mail) {
		emails.add(mail);
	}
	
	public void quitarMail (Email mail) {
		this.emails.remove(mail);
	}
	
	public Email buscar (String mail) {
		return this.emails.stream().filter(m -> m.getTitulo().equals(mail)).findFirst().orElse(null);
	}
	
	public double total () {
		return this.emails.stream().mapToDouble(m -> m.espacioOcupado()).sum();
	}
	
}
