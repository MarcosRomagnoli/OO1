package ar.edu.unlp.info.oo1.Ejercicio13;

import java.util.List;
import java.util.ArrayList;

public class Email {
	private String titulo;
	private String cuerpo;
	private List<Archivo> adjuntos;
	
	
	public Email(String titulo, String cuerpo) {
		this.titulo = titulo;
		this.cuerpo = cuerpo;
		this.adjuntos = new ArrayList<Archivo>();
	}
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getCuerpo() {
		return cuerpo;
	}

	public void setCuerpo(String cuerpo) {
		this.cuerpo = cuerpo;
	}

	public List<Archivo> getAdjuntos() {
		return adjuntos;
	}	
	
	public void agregar(Archivo archivo) {
		this.adjuntos.add(archivo);
	}
	
    private int getTamañoAdjuntos() {
    	return this.adjuntos.stream()
    		.mapToInt(archivo -> archivo.getTamaño())
    		.sum();
    }
    
	public int getTamaño() {
		return this.getTitulo().length() + this.getCuerpo().length() + this.getTamañoAdjuntos() ;
	}
	
	/*public int getTamaño() {
		return this.getTitulo().length() + this.getCuerpo().length() + this.getAdjuntos().size() ;
	}*/
	
	public boolean contieneTexto(String texto) {
    	return this.titulo.contains(texto) || this.cuerpo.contains(texto);
    }
}
	