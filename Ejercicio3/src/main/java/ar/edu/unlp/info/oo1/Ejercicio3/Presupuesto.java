package ar.edu.unlp.info.oo1.Ejercicio3;

import java.time.LocalDate;
import java.util.*;

public class Presupuesto {
	private LocalDate fecha;
	private String cliente;
	private List <Item> items;
	//conviene linked o arraylist
	
	public Presupuesto(String cliente) {
		this.cliente = cliente;
		this.fecha = LocalDate.now();
		this.items = new LinkedList<Item>();
	}
	
	
	public void agregarItem(Item item) {
		items.add(item);
	}
	
	
	public double calcularTotal() {
		return this.items.stream().mapToDouble(item -> item.costo()).sum();
	}
	//
	//public double calcularTotal() {
	//	return this.items.stream().mapToDouble(Item::costo).sum();
	//}
	
	public String getCliente() {
		return this.cliente;
	}
	
	public LocalDate getFecha() {
		return fecha;
	}
}
