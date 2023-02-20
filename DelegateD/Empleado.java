package Delegate;

public class Empleado implements ICodificadora, IDisenadora   {
	ICodificadora codificador;
	IDisenadora disenador;

    public Empleado(ICodificadora codificador, IDisenadora disenador) {
        this.codificador = codificador;
        this.disenador = disenador;
    }

	@Override
	public void disenar() {
		// TODO Auto-generated method stub
		codificador.codificar();
	}

	@Override
	public void codificar() {
		// TODO Auto-generated method stub
		disenador.disenar();
	}


  
}
