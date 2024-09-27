package ar.edu.unlp.info.oo1.Ejercicio9;

public class CajaDeAhorro extends Cuenta{
	
	public CajaDeAhorro() {
		super();
	}
	
	@Override
	public void depositar(double monto) {
		super.depositar(monto - (monto * 0.02));
	}

	@Override
	protected void extraerSinControlar(double monto) {
		super.extraerSinControlar(monto + (monto * 0.02));
	}

	@Override
	protected boolean puedeExtraer(double monto) {
		if (this.getSaldo() >= (monto + (monto*0.02))){
			return true;
		}else {
			return false;  
		}
	}
}

	
	