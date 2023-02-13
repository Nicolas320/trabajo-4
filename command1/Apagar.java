package command1;

public class Apagar implements Icomando{
	
	automovilp auto;
	
	 public Apagar(automovilp pauto) {
		 this.auto =pauto;
	 }
	
	 @Override
	 public void ejecutar() {
		 auto.apagar();

}
}