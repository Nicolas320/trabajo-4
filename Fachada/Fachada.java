package fachada;

public class Fachada {

	private GestorCompra compra = new GestorCompra();
	private GestorInventario inventario = new GestorInventario();
	private GestorEnvio envio = new GestorEnvio();

	public void compra() {
		if(compra.comprar() && inventario.retirarStock()) {
			envio.enviarPedido();
		}
	}

}

