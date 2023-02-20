package fachada;

import java.util.Scanner;

public class GestorCompra {
	
	private Scanner in = new Scanner(System.in);
	
	public boolean comprar() {
		int numero;
		System.out.println("Ingrese el numero de tarjeta para realizar el pago");
		numero = in.nextInt();
		if(numero == 4567) {
			System.out.println("Procesando la compra");
			System.out.println(":---------------------");
			System.out.println("Pago aceptado");
			return true;
		}else {
			System.out.println("Pago rechazado");
			return false;
		}
	}
}
