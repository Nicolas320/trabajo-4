package f.abstracta;

public class SaborAmericana implements IElementoSabor {
	
	@Override
	public void seleccion() {
		System.out.println("Se selecciono pizza americana");
	}
	@Override
	public String getInformacion() {
		return "con maiz tierno y tocineta con un toque picante de pepperoni";
	}

}
