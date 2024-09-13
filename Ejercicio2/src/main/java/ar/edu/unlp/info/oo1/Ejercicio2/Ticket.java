package ar.edu.unlp.info.oo1.Ejercicio2;

import java.time.LocalDate;

public class Ticket {
	private LocalDate fecha;
	private int cantidadDeProductos;
	private double precioTotal;
	private double pesoTotal;
	
	
	public Ticket(int cantidadDeProductos, double pesoTotal, double precioTotal) {
		this.fecha = LocalDate.now();
		this.cantidadDeProductos = cantidadDeProductos;
		this.precioTotal = precioTotal;
		this.pesoTotal = pesoTotal;
	}
	
	public double getPesoTotal() {
		return this.pesoTotal;
	}

	public double getPrecioTotal() {
		return this.precioTotal;
	}

	public int getCantidadDeProductos() {
		return this.cantidadDeProductos;
	}

	public LocalDate getFecha() {
		return this.fecha;
	}
	
	public double impuesto() {
		return this.precioTotal * 0.21;
	}
	// 1.21 o 0.21?
	//Hace falta todos los getters y setters, o solo los necesarios
	
	public String toString() {
		String aux = "Fecha emitida: " + this.fecha.toString() + "\n" + "Cantidad de productos comprados: "
				+ this.cantidadDeProductos + "\n" + "Peso total en productos: " + this.pesoTotal + "\n"
				+ "Total a pagar: " + this.precioTotal;
		return aux;
	}
}
