package ar.edu.unlp.info.oo1.Ejercicio6;

import java.time.LocalDate;

public class Mamifero {
	private String identificador;
	private String especie;
	private LocalDate fechaNacimiento;
	private Mamifero madre;
	private Mamifero padre;
	
	public Mamifero() {
		
	}
	
	public Mamifero (String identificador) {
		this.identificador = identificador;
	} // como se cual es el constructor, entrando al test? y ne el parcial?
	
	public String getIdentificador() {
		return identificador;
	}
	
	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}
	
	public String getEspecie() {
		return especie;
	}
	
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	
	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}
	
	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	
	public Mamifero getMadre() {
		return madre;
	}
	
	public void setMadre(Mamifero madre) {
		this.madre = madre;
	}
	
	public Mamifero getPadre() {
		return padre;
	}
	
	public void setPadre(Mamifero padre) {
		this.padre = padre;
	}
	
	public Mamifero getAbueloMaterno() {
		if (this.getMadre() != null)
			return this.getMadre().getPadre() ;
		return null;
	}
	
	public Mamifero getAbuelaMaterna() {
		if (this.getMadre() != null)
			return this.getMadre().getMadre() ;
		return null;
	}

	public Mamifero getAbueloPaterno() {
		if (this.getPadre() != null)
			return this.getPadre().getPadre() ;
		return null;
	}
	
	public Mamifero getAbuelaPaterna() {
		if (this.getPadre() != null)
			return this.getPadre().getMadre() ;
		return null;
	}
	
	public boolean tieneComoAncestroA(Mamifero unMamifero) {
		return (tieneAncestro(this.getMadre(),unMamifero) || tieneAncestro(this.getPadre(),unMamifero));
	}

	
	private boolean tieneAncestro (Mamifero parent, Mamifero unMamifero) {
		return ((parent != null) && (unMamifero.equals(parent) || parent.tieneComoAncestroA(unMamifero)));
	}
	
}
