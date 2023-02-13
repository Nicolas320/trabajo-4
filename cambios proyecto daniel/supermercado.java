package proyecto_supermercado;
import java.util.Scanner;

public class supermercado {

	 private static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opcion;
	       
        Icompra operacion=null;
        do{
            opcion = Menu();
            
            switch(opcion){
                case 1:{
                    operacion= new manzana();
                    break;}
                case 2:{
                    operacion=  new banano();
                    break;}
                case 3:{
                    operacion=   new pollo();
                    break;}
                case 4:{
                    operacion=  new sal();
                    break;}
            }
            
           
            
            if(opcion!=5){
               operacion.valor();
               
            }
            
          
        }while(opcion!=5);
        
	 }
    public static int Menu(){
        int opcion = 0;
         in = new Scanner(System.in);
        do{
            System.out.println("Seleccione una de las siguientes opciones:");
            System.out.println("1. pagar manzana");
            System.out.println("2.  pagar banano");
            System.out.println("3.  pagar pollo");
            System.out.println("4.  pagar sal");
            System.out.println("5. Salir");
            opcion = in.nextInt();

            if(opcion < 1 || opcion > 5){
                System.out.println("Opcion incorrecta, intente nuevamente");
                System.out.println(" ");
                
                }
        }while(opcion < 1 || opcion > 5);
        return opcion;
	}

	}


