package registros;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Programador programador1 = new Programador("Natalia", "16278882-1" );
		System.out.println("nombre programador: "+programador1.getNombre());
		System.out.println("rut programador: "+programador1.getRut());
		
		Producto producto1 = new Producto("Sistema de registro", 20000000, 2340);
		System.out.println("nombre del producto: "+producto1.getNombre());
		System.out.println("precio producto: "+producto1.getPrecio());
		System.out.println("codigo producto: "+producto1.getCodigo());
		
		Cliente cliente1 = new Cliente("Emilio", "15992000-2", "público");
		System.out.println("nombre del cliente: "+cliente1.getNombre());
		System.out.println("rut cliente: "+cliente1.getRut());
		System.out.println("tipo de cliente: "+cliente1.getTipocliente());
		
		Venta venta1 = new Venta(producto1, cliente1, true);
		
		System.out.println("venta1 nombre producto: "+venta1.getProducto().getNombre());
		System.out.println("venta1 precio producto:"+venta1.getProducto().getPrecio());
		System.out.println("venta1 nombre cliente: "+venta1.getCliente().getRut());	
		System.out.println("venta1 es convenio marco?: "+venta1.getEsconveniomarco());
		
		
		
	}

}
