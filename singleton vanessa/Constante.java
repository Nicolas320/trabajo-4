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
	            System.out.println("Instancia creada por primer y unica vez");
	        }
	        return instancia;
	    }

	    @Override
	    public String toString() {
	        return "Nombre constant "+nombreConstante+" con valor "+valorContante;
	    }
	    
	    public void setDatos(String name, double value){
	        this.nombreConstante = name;
	        this.valorContante = value;
	    }
	    
	    
	}

}
