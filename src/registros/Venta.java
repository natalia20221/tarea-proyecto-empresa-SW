package registros;

public class Venta {
	private Producto producto;
	private Cliente cliente;
	private Boolean esconveniomarco;
	


public Venta(Producto producto, Cliente cliente, Boolean esconveniomarco) {
		super();
		this.producto = producto;
		this.cliente = cliente;
		this.esconveniomarco = esconveniomarco;
	}



Producto getProducto() {
	return producto;
}



void setProducto(Producto producto) {
	this.producto = producto;
}



 Cliente getCliente() {
	return cliente;
}



void setCliente(Cliente cliente) {
	this.cliente = cliente;
}



Boolean getEsconveniomarco() {
	return esconveniomarco;
}



 void setEsconveniomarco(Boolean esconveniomarco) {
	this.esconveniomarco = esconveniomarco;
}

}