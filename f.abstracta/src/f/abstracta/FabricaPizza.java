package f.abstracta;

import java.util.Scanner;

public class FabricaPizza {
	
	private IElementoMasa masa;
	private IElementoSabor sabor;
	private static Scanner in = new Scanner(System.in);
	public void crearElementos() {
		int opcion;
		System.out.println("Fabricando Pizza");
		do {
			System.out.println("Selecciones el tipo de masa para su pizza");
			System.out.println("1. Masa regular");
			System.out.println("2. Masa con bordes de queso");
			opcion = in.nextInt();
			
		}while(opcion < 1 || opcion>2);
		if(opcion==1)
			masa = new MasaNormal();
		else
			masa = new MasaQueso();
		masa.producir();
		
		do {
			System.out.println("Selecciones el tipo de sabor para su pizza");		
			System.out.println("1. Hawaina");
			System.out.println("2. Americana");
			opcion = in.nextInt();
		}while (opcion <1 || opcion>2);
		
		if(opcion == 1)
			sabor = new SaborHawaina();
		else
			sabor = new SaborAmericana();
		sabor.seleccion();
	}
	public IElementoMasa getElementoMasa() {
		return masa;
	}
	public IElementoSabor getElementoSabor() {
		return sabor;
	}

}
