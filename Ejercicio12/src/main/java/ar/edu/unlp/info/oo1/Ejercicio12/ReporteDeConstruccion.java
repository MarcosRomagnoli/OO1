package ar.edu.unlp.info.oo1.Ejercicio12;

import java.util.ArrayList;
import java.util.List;

public class ReporteDeConstruccion {
	private List<Pieza> lista;

	public ReporteDeConstruccion() {
		this.lista = new ArrayList<Pieza>();
	}

	public List<Pieza> getLista() {
		return lista;
	}
	
	public void agregar(Pieza pieza) {
		this.lista.add(pieza);
	}
	
	public double getVolumenDeMaterial (String material) {
		return this.lista
				.stream()
				.filter(pieza -> pieza.getMaterial().equals(material))
				.mapToDouble(pieza -> pieza.getVolumen())
				.sum();
		
	}
	
	public double getSuperficieDeColor(String color) {
		return this.lista
				.stream()
				.filter(pieza -> pieza.getColor().equals(color))
				.mapToDouble(pieza -> pieza.getSuperficie())
				.sum();
	}
	
}
