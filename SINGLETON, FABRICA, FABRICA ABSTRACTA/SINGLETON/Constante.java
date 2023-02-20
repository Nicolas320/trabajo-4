public class Constante {

	public class Constante {
	    
	    private static Constante instancia;
	    
	    private String nombreConstante;
	    private double valorContante;
	    
	    private Constante(){
	        nombreConstante = "N/A";
	        valorContante = 0;
	    }
	    
	    public static Constante getInstance(){
	        if(instancia == null){
	            instancia = new Constante();
	            System.out.println("Instancia lista, unica vez");
	        }
	        return instancia;
	        else;
	    }

	    @Override
	    public String toString() {
	        return "Nombre constant "+nombreConstante+" con valor "+valorContante;
	    }
	    
	    public void setDatos(String nombre, double value){
	        this.nombreConstante = nombre;
	        this.valorContante = value;
	    }
	    
	    
	}

}
