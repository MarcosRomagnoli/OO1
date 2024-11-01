package ar.edu.unlp.info.oo1.Ejercicio15;

public class Consumo {
	private double energiaActiva;
	private double energiaReactiva;
	
	public Consumo(double energiaActiva, double energiaReactiva) {
		this.energiaActiva = energiaActiva;
		this.energiaReactiva = energiaReactiva;
	}
	
	public double calcularMonto(CuadroTarifario tarifa) {
		return tarifa.getPrecioKwh() * this.energiaActiva;
	}
	
	public boolean aplicarBonificacion(CuadroTarifario tarifa) {
		return this.energiaActiva / (
			Math.sqrt(
				Math.pow(energiaActiva, 2) +
				Math.pow(energiaReactiva, 2)
			) 
		) > tarifa.getFactorDePotencia();
	}
}
