package registros;

public class Cliente {
	private String nombre;
	private String rut;
	private String tipocliente;
	

	Cliente(String nombre, String rut, String tipocliente){
	this.nombre = nombre;
	this.rut = rut;
	this.tipocliente = tipocliente;
	
	}


	 String getNombre() {
		return nombre;
	}


	 void setNombre(String nombre) {
		this.nombre = nombre;
	}


	String getRut() {
		return rut;
	}


	void setRut(String rut) {
		this.rut = rut;
	}


	String getTipocliente() {
		return tipocliente;
	}


	private void setTipocliente(String tipocliente) {
		this.tipocliente = tipocliente;
	}
	
	

}
