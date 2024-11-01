package ar.edu.unlp.info.oo1.Ejercicio15;

public class Usuario {
	private String nombre;
	private String domicilio;
	private Consumo UltimoConsumo;
	
	public Usuario(String nombre, String domicilio) {
		this.nombre = nombre;
		this.domicilio = domicilio;
		this.UltimoConsumo = new Consumo (0.0,0.0);
	}
		
	public String getNombre() {
		return nombre;
	}

	public String getDomicilio() {
		return domicilio;
	}

	public Consumo getUltimoConsumo() {
		return UltimoConsumo;
	}

	public Factura facturar (CuadroTarifario tarifa) {
		double monto = this.UltimoConsumo.calcularMonto(tarifa);
		double bonificacion = 0;
		if (this.getUltimoConsumo().aplicarBonificacion(tarifa)) {
			bonificacion = monto * 0.1;
		}
		return new Factura (this, bonificacion, monto);
	}
	
	
}
