package ar.edu.unlp.info.oo1.Ejercicio4;

import java.time.LocalDate;
import java.util.*;


public class Ticket {
	private LocalDate fecha;
	private int cantidadDeProductos;
	private double pesoTotal;
	private double precioTotal;
	

	
	public Ticket(int cantidadDeProductos, double pesoTotal, double precioTotal, List<Producto> productos) {
		this.cantidadDeProductos = cantidadDeProductos;
		this.pesoTotal = pesoTotal;
		this.precioTotal = precioTotal;
		this.fecha = LocalDate.now();
	}
	
	
	
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	
	public void setCantidadDeProductos(int cantidadDeProductos) {
		this.cantidadDeProductos = cantidadDeProductos;
	}
	
	public void setPesoTotal(double pesoTotal) {
		this.pesoTotal = pesoTotal;
	}
	
	public void setPrecioTotal(double precioTotal) {
		this.precioTotal = precioTotal;
	}
	
	
	
	public LocalDate getFecha() {
		return fecha;
	}
	
	public int getCantidadDeProductos() {
		return cantidadDeProductos;
	}
	
	public double getPesoTotal() {
		return pesoTotal;
	}
	
	public double getPrecioTotal() {
		return precioTotal;
	}
	
	
	public double impuesto() {
		return (this.getPrecioTotal() * 0.21);
	}
	
	
	public String toString() {
		String ticket = "Fecha emitida: " + this.fecha.toString() + "\n" + "Cantidad de productos comprados: "
				+ this.cantidadDeProductos + "\n" + "Peso total en productos: " + this.pesoTotal + "\n"
				+ "Total a pagar: " + this.precioTotal;
		return ticket;
	}
	

}
