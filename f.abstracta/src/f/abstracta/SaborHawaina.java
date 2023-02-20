package f.abstracta;

public class SaborHawaina implements IElementoSabor {
	
	@Override 
	public void seleccion() {
		System.out.println("Se selecciono pizza Hawaina");
	}
	@Override
	public String getInformacion() {
		return "con cebolla, pimenton, champiñon, piña y tomate";
	}
}
