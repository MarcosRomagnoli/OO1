package ar.edu.unlp.info.oo1.Ejercicio5;

public class Cuadrado implements Figura {
	private int lado;
	

	public int getLado() {
		return lado;
	}

	public void setLado(int lado) {
		this.lado = lado;
	}
	
	public double getPerimetro() {
		return this.lado * 4;
	}
	
	public double getArea() {
		return Math.pow(this.lado, 2);
		//return this.lado * this.lado;
	}
}
