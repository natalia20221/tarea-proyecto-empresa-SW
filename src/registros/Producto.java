package registros;

public class Producto {
	private String nombre;
	private int precio;
	private int codigo;
	
	Producto(String nombre, int precio, int codigo){
		this.nombre = nombre;
		this.precio = precio;
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;	
    }
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;	
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;	
}

}
