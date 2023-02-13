package command1;

import java.util.Scanner;
public class Cliente {

	public static void main(String[] args) {
		
		automovilp automovilp= new automovilp();
		
		controlRemoto controlRemoto	= new controlRemoto(automovilp);
		
		int opcion;
		do {
			opcion = Menu();
			if(opcion != 5) {
				
				controlRemoto.SeleccionControl(opcion-1);
				
	         }
            
	        }while(opcion!=7);
	        
	    }
	    public static int Menu(){
	        int opcion = 0;
	        Scanner in = new Scanner(System.in);
	        do{
	            System.out.println("Seleccione una de las siguientes opciones:");
	            System.out.println("1. ENCENDER EL CARRO");
	            System.out.println("2. APAGAR EL CARRO");
	            System.out.println("3. CONFIGURAR  LA ALARMA Y ENCENDERLA");
	            System.out.println("4. CONFIGURAR  LA ALARMA Y APAGARLA ");
	            System.out.println("5. Salir");
	            opcion = in.nextInt();
	            if(opcion < 1 || opcion > 5){
	                System.out.println("Opcion incorrecta, HAGALO NUEVAMENTE");
	            }
	        }while(opcion < 1 || opcion > 5);
	        return opcion;
	
			}
		

	}


