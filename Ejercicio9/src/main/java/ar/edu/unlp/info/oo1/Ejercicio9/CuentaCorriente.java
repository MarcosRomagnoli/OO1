package ar.edu.unlp.info.oo1.Ejercicio9;

public class CuentaCorriente extends Cuenta {
	private double limite;
	
	public CuentaCorriente() {
		super();
		this.limite = 0;
	}
	
	public double getLimite() {
		return limite;
	}
	
	public void setLimite(double unLimite) {
		this.limite=unLimite;
	}


	@Override
	protected boolean puedeExtraer(double monto) {
		return monto <= (this.getSaldo()+limite) ;
	}
	
	
}
