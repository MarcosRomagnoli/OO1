package ar.edu.unlp.info.oo1.Ejercicio7;

import java.util.*;

public class Farola {
	private boolean on;
	private List<Farola> lista;
	
	/*
	* Crear una farola. Debe inicializarla como apagada
	*/
	public Farola (){
		this.lista = new ArrayList<Farola>();
		this.on = false;
	}
	
	/*
	* Crea la relación de vecinos entre las farolas. La relación de vecinos entre las farolas es recíproca, es decir el receptor del mensaje será vecino de otraFarola, al igual que otraFarola también se convertirá en vecina del receptor del mensaje
	*/
	public void pairWithNeighbor(Farola otraFarola) {
		if (!this.lista.contains(otraFarola)) { // 3- Como ya la tiene, no entra el if 
			this.lista.add(otraFarola); // 1-la agrega
			otraFarola.pairWithNeighbor(this); // 2-lo mismo para la vecina 
		}
	}
	
	/*
	* Retorna sus farolas vecinas
	*/
	public List<Farola> getNeighbors (){
		return this.lista;
	}

	/*
	* Si la farola no está encendida, la enciende y propaga la acción.
	*/	
	public void turnOn() {
		if (!this.isOn()) {
			this.on = true;
			this.getNeighbors().forEach(l -> l.turnOn());
		}
	}

	/*
	* Si la farola no está apagada, la apaga y propaga la acción.
	*/
	
	public void turnOff() {
		if (this.isOn()) {
			this.on = false;
			this.getNeighbors().forEach(farola -> farola.turnOff());
		}
	}

	/*
	* Retorna true si la farola está encendida.
	*/
	
	public boolean isOn() {
		return this.on;
	}
	
	public boolean isOff() {
		return !this.on;
	}
	

}
