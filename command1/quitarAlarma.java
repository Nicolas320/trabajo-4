package command1;

public class quitarAlarma implements Icomando{
	automovilp auto;
	
	 public quitarAlarma(automovilp pauto) {
		 this.auto =pauto;
	 }
	
	 @Override
	 public void ejecutar(){
		 auto.quitarAlarma();

}

}