package ar.edu.unlp.info.oo1.Ejercicio12;

public class Cilindro extends Pieza{
	private int radio;
	private int altura;
	
	public Cilindro(String material, String color, int radio, int altura) {
		super(material, color);
		this.radio = radio;
		this.altura = altura;
	}
	
	public int getRadio() {
		return radio;
	}

	public void setRadio(int radio) {
		this.radio = radio;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public double getVolumen() {
		return Math.PI * Math.pow(this.radio,2) * this.altura;
	}
	public double getSuperficie() {
		return 2 * this.radio * Math.PI * this.altura + 2 * Math.PI * Math.pow(this.radio,2);
	}
	
	
	
}
