package singleton;

public class Constante {
	private static Constante instancia;
	private String nombreConstante;
	private double valorConstante;
	private Constante() {
		nombreConstante = "N/A";
		valorConstante = 0;
	}
	
	public static Constante getInstance() {
		if (instancia == null) {
			instancia = new Constante();
			System.out.println("Instancia creada por primera y unica vez");
		}
		return instancia;
	}
	@Override
	public String toString() {
		return "Nombre constant "+nombreConstante+" con valor "+valorConstante;
	}
	public void setDatos(String name, double value) {
		this.nombreConstante = name;
		this.valorConstante = value;
	}
}
