package f.abstracta;

public class Principal {

	public static void main(String[] args) {

        FabricaPizza miFabrica = new FabricaPizza();	
        
		miFabrica.crearElementos();
		IElementoMasa miMasa = miFabrica.getElementoMasa();
		IElementoSabor miSabor = miFabrica.getElementoSabor();
		
		System.out.println("Mi Pizza tiene: "+miMasa.getDatos()+miSabor.getInformacion());
	}

}
