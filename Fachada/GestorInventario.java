package fachada;

public class GestorInventario {

	private int stock;
	public GestorInventario() {
		this.stock = 2;
	}
	public boolean retirarStock() {
		if(stock > 0) {
			System.out.println("Producto listo para el envio");
			stock--;
			return true;
		}else {
			System.out.println("Producnto no disponbile, no hay existencias, entrega reprogramada!");
			return false;
		}
	}
	
}
