package ar.edu.unlp.info.oo1.Ejercicio9;

public class CuentaCorriente extends Cuenta {
	private double limite;
	

	public double getLimite() {
		return limite;
	}
	
	public void setLimite(double unLimite) {
		this.limite=unLimite;
	}

	public CuentaCorriente() {
		super();
		this.limite = 0;
	}

	@Override
	protected boolean puedeExtraer(double monto) {
		return (this.getSaldo()+limite) >= monto;
	}



	
	
}
