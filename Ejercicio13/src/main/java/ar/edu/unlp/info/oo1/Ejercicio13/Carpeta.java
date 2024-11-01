package ar.edu.unlp.info.oo1.Ejercicio13;

import java.util.ArrayList;
import java.util.List;

public class Carpeta {
	private String nombre;
	private List<Email> emails;
	
	public Carpeta(String nombre) {
		this.nombre = nombre;
		this.emails = new ArrayList<Email>();
	}
	
	public String getNombre() {
		return nombre;
	}

	
	public List<Email> getEmails() {
		return emails;
	}

	public void agregar(Email email) {
		this.emails.add(email);
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	public void mover (Email email, Carpeta destino) {
		this.emails.remove(email); //se asume que esta?
		destino.agregar(email);
		System.out.println("Operación exitosa");
	}
	
	public Email buscarTextoEnCarpeta(String texto) {
	    return this.emails.stream()
	            .filter(email -> email.contieneTexto(texto))
	            .findFirst()
	            .orElse(null);
	}
	
	public int espacioOcupado() {
	    return this.emails.stream()
	            .mapToInt(email -> email.getTamaño())
	            .sum();
	}
}
