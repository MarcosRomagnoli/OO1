package ar.edu.unlp.info.oo1.Ejercicio11;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class PlazoFijo implements Inversion{
	private LocalDate fechaDeConstitucion;
	private double montoDepositado;
	private double porcentajeDeInteresDiario;
	
	public PlazoFijo(LocalDate fechaDeconstitucion, double montoDepositado, double porcentajeDeInteresDiario) {
		super();
		this.fechaDeConstitucion = fechaDeconstitucion;
		this.montoDepositado = montoDepositado;
		this.porcentajeDeInteresDiario = porcentajeDeInteresDiario;
	}
	
	public LocalDate getFechaDeConstitucion() {
		return fechaDeConstitucion;
	}
	
	public void setFechaDeConstitucion(LocalDate fechaDeconstitucion) {
		this.fechaDeConstitucion = fechaDeconstitucion;
	}
	
	public double getMontoDepositado() {
		return montoDepositado;
	}
	
	public void setMontoDepositado(double montoDepositado) {
		this.montoDepositado = montoDepositado;
	}
	
	public double getPorcentajeDeInteresDiario() {
		return porcentajeDeInteresDiario;
	}
	
	public void setPorcentajeDeInteresDiario(double porcentajeDeInteresDiario) {
		this.porcentajeDeInteresDiario = porcentajeDeInteresDiario;
	}

	@Override
	public double valorActual() {
		long dias = ChronoUnit.DAYS.between(this.getFechaDeConstitucion(), LocalDate.now()); // ESTE ME DA LOS DIAS EN CALENDARIO
		return this.getMontoDepositado() + (this.getMontoDepositado() * this.getPorcentajeDeInteresDiario() * dias);
	}
	


	
	
}
