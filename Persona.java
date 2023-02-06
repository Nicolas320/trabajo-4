package patron;

import java.util.Scanner;


public class Persona {

	public static void main(String[] args) {
		
		Lavadora lavadora1 = new Lavadora();
		ControlLavadora control_lavadora = new ControlLavadora(lavadora1);
		
		int opcion;
		do {
			opcion = Menu();
			if(opcion != 7) {
				control_lavadora.SeleccionControl(opcion-1);
			}
		
		}while(opcion!=7);
	}
	public static int Menu() {
		int opcion = 0;
		Scanner in = new Scanner(System.in);
		do {
			System.out.println("***Lavadora LG RemaX3...2022 BIENVENIDO usuario***");
			System.out.println("Seleccione alguna de las Opciones");
			System.out.println("1. Encender Lavadora");
			System.out.println("2. Lavadora Enjuagar");
			System.out.println("3. Lavadora Secar");
			System.out.println("4. Apagar Lavadora");
			opcion = in.nextInt();
			if(opcion < 1 || opcion > 4) {
				System.out.println("Opcion Incorrecta, ¿Se le desvio el dedo?");
			}
			
		}while(opcion < 1 || opcion > 4);
		return opcion;
	}

}





