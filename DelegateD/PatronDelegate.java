package Delegate;

public class PatronDelegate {

	public static void main(String[] args) {
		
		 Empleado objEmpleado = new Empleado(new ClaseCodificadora(),new ClaseDisenadora());
	        objEmpleado.codificar();
	        objEmpleado.disenar();
	    }
	
}
