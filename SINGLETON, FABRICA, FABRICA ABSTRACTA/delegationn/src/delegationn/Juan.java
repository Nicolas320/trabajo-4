package delegationn;

public class Juan extends Persona {

	private Alumno varAlumno;
	private Hijo varHijo;
	
	public Juan() {
		varAlumno= new Alumno();
		varHijo= new Hijo();
		}
	public void asistirAclases() {
		varAlumno.asistirAclases();
	}
	public void AyudarEnCasa() {
		varHijo.ayudarEnCasa();
	}
	public void PerdirPermiso() {
		varHijo.PedirPermiso();
	}
	
	
	
	
	
}
