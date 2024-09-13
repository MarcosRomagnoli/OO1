package ar.edu.unlp.info.oo1.Ejercicio2;

public class Balanza {
	private int cantidadDeProductos;
	private double precioTotal;
	private double pesoTotal;
	
	
	public int getCantidadDeProductos() {
		return cantidadDeProductos;
	}

	public double getPrecioTotal() {
		return precioTotal;
	}
	
	public double getPesoTotal() {
		return pesoTotal;
	}

	
	public void ponerEnCero() {
		this.cantidadDeProductos = 0;
		this.pesoTotal = 0;
		this.precioTotal = 0;
	}
	
	public void agregarProducto(Producto p) {
		this.cantidadDeProductos++;
		this.pesoTotal += p.getPeso();
		this.precioTotal += p.getPrecio();
	}
	
	public Ticket emitirTicket() {
		Ticket ticket = new Ticket (this.getCantidadDeProductos(), this.getPesoTotal(), this.getPrecioTotal());
		return ticket;
	}
	
}
