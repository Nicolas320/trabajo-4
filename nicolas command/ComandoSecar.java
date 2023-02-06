package patron;

public class ComandoSecar implements IComando {
	private Lavadora lv;
	public ComandoSecar(Lavadora pLv) {
		this.lv = pLv;
	}
	@Override
	public void ejecutar() {
		lv.secar();
	}
}
	
