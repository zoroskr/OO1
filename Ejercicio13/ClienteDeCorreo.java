package Ejercicio13;

import java.util.List;

public class ClienteDeCorreo {
	Carpeta inbox;
	List<Carpeta> carpetas;

	public ClienteDeCorreo(Carpeta inbox, List<Carpeta> carpetas) {
		super();
		this.inbox = inbox;
		this.carpetas = carpetas;
	}

	public void recibir(Email email) {
		this.inbox.añadirMail(email);
	}

	public void mover(Email email, Carpeta origen, Carpeta destino) {
		origen.quitarMail(email);
		destino.añadirMail(email);
	}

	public Email buscar(String texto) {
		if (this.inbox.buscar(texto) != null) {
			return this.inbox.buscar(texto);
		}
		return this.carpetas.stream().map(c -> c.buscar(texto)).filter(email -> email != null).findFirst().orElse(null);
	}
	
	public int espacioOcupado () {
		return (int) this.inbox.total() + (int) this.carpetas.stream().mapToDouble(e -> e.total()).sum();
	}
}
