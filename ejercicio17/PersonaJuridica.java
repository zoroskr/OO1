package ejercicio17;

public class PersonaJuridica extends Persona {

	private int CUIT;
	private String tipo;
	
	public PersonaJuridica(String nombre, String direccion, int CUIT, String tipo) {
		super(nombre, direccion);
		this.CUIT=CUIT;
		this.tipo=tipo;
	}


	
	
	
	

}
