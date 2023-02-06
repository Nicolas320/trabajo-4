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
	            System.out.println("1. Encender el auto");
	            System.out.println("2. Apagar el auto");
	            System.out.println("3. poner la alarma");
	            System.out.println("4. quitar la alarma ");
	            System.out.println("5. Salir");
	            opcion = in.nextInt();
	            if(opcion < 1 || opcion > 5){
	                System.out.println("Opcion incorrecta, netnte nuevamente");
	            }
	        }while(opcion < 1 || opcion > 5);
	        return opcion;
	
			}
		

	}


