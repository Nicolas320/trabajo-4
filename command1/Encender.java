package command1;

public class Encender implements Icomando{
	
 automovilp auto;
 public Encender(automovilp pauto) {
	 this.auto =pauto;
	 
 }
 @Override
 public void ejecutar() {
	 auto.encender();
 }
 
}
