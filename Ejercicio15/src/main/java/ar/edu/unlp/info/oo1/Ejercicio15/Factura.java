package ar.edu.unlp.info.oo1.Ejercicio15;

import java.time.LocalDate;

public class Factura {
	private Usuario usuario;
	private LocalDate fecha;
	private double bonificacion;
	private double monto;
	
	
	
	public Factura(Usuario usuario, double bonificacion, double montoFinal) {
		super();
		this.usuario = usuario;
		this.bonificacion = bonificacion;
		this.monto = montoFinal - bonificacion;
		this.fecha = LocalDate.now();
	}

	public Usuario getUsuario() {
		return usuario;
	}
	
	public LocalDate getFecha() {
		return fecha;
	}
	
	public double getBonificacion() {
		return bonificacion;
	}
	
	public double getMonto() {
		return monto;
	}
	
}
