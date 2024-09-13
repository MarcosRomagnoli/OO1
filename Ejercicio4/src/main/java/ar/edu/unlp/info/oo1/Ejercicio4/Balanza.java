package ar.edu.unlp.info.oo1.Ejercicio4;

import java.util.List;
import java.util.LinkedList;

public class Balanza {
	private List<Producto> lista = new LinkedList<Producto>();
	
	
	/*public Balanza() {
		this.ponerEnCero();
	}
	
	public void ponerEnCero() {
		this.lista = new LinkedList<Producto>();
	}
	
	
	*/
	public void ponerEnCero() {
		this.lista.clear();
	}

	public void agregarProducto(Producto p) {
		this.lista.add(p);
	}

	public Ticket emitirTicket() {
		Ticket tick = new Ticket(this.getCantidadDeProductos(),this.getPesoTotal(),this.getPrecioTotal(),this.getProductos());
		this.ponerEnCero();
		return tick;
	}

	public double getPesoTotal() {
		return this.lista.stream().mapToDouble(Producto::getPeso).sum();
	}

	public double getPrecioTotal() {
		return this.lista.stream().mapToDouble(Producto::getPrecio).sum();
	}

	public int getCantidadDeProductos() {
		return this.lista.size();
	}

	public List<Producto> getProductos() {
		return this.lista;
	}
}
