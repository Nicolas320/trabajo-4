package command1;

public class ponerAlarma implements Icomando{
	automovilp auto;
	
	 public ponerAlarma(automovilp pauto) {
		 this.auto =pauto;
	 }
	
	 @Override
	 public void ejecutar() {
		auto.ponerAlarma();
}
	 
}