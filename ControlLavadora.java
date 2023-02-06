package patron;

public class ControlLavadora {
	private IComando[] comandos = new IComando[6];
	public ControlLavadora(Lavadora pLv) {
		comandos[0] = new ComandoEncender(pLv);
		comandos[1] = new ComandoEnjuagar(pLv);
		comandos[2] = new ComandoSecar(pLv);
		comandos[3] = new ComandoApagar(pLv);
		}
	public void SeleccionControl(int pIndice) {
		comandos[pIndice].ejecutar();
	}

}
