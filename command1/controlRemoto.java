package command1;

public class controlRemoto {
	private Icomando[]command1 = new Icomando[4];
	public controlRemoto(automovilp pauto) {
		command1[0]= new Encender(pauto);
		command1[1]= new Apagar(pauto);
		command1[2]= new ponerAlarma(pauto);
		command1[3]= new quitarAlarma(pauto);
	}

 public void SeleccionControl(int pIndice){
    command1[pIndice].ejecutar();
} 

	

}
