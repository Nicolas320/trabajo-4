package patron;

public class ComandoEncender implements IComando{
	private Lavadora lv;
	public ComandoEncender(Lavadora pLv) {
		this.lv = pLv;
	}
	@Override
	public void ejecutar() {
		lv.encender();
	}

}
