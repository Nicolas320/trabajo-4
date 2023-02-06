package patron;

public class ComandoApagar implements IComando{
	private Lavadora lv;
	public ComandoApagar(Lavadora pLv) {
		this.lv = pLv;
	}
	@Override
	public void ejecutar() {
		lv.apagar();
	}

}
