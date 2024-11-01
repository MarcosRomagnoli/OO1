package ar.edu.unlp.info.oo1.Ejercicio15;

public class CuadroTarifario {
	private double precioKwh;
	private double factorDePotencia;
	
	public CuadroTarifario(double precioKwh, double factorDePotencia) {
		this.precioKwh = precioKwh;
		this.factorDePotencia = factorDePotencia;
	}

	public double getPrecioKwh() {
		return precioKwh;
	}

	public void setPrecioKwh(double precioKwh) {
		this.precioKwh = precioKwh;
	}

	public double getFactorDePotencia() {
		return factorDePotencia;
	}

	public void setFactorDePotencia(double factorDePotencia) {
		this.factorDePotencia = factorDePotencia;
	}
	
	
	
	
}
