package ar.edu.unlp.info.oo1.Ejercicio13;

import java.util.*;

public class ClienteDeCorreo {
	private Carpeta inbox;
	private List<Carpeta> carpetas;
	
	
	
	public ClienteDeCorreo() {
		this.inbox = new Carpeta ("Inbox");
		this.carpetas = new ArrayList<Carpeta>();
	}

	public Carpeta getInbox() {
		return inbox;
	}

	public void setInbox(Carpeta inbox) {
		this.inbox = inbox;
	}

	public List<Carpeta> getCarpetas() {
		return carpetas;
	}

	public void recibir (Email email) {
		this.inbox.agregar(email);
	}
	
	
	public Email buscarTexto(String texto) {
        return this.carpetas.stream()
                .map(carpeta -> carpeta.buscarTextoEnCarpeta(texto))
                .filter(email -> email != null)
                .findFirst()
                .orElse(null);
    }
    
    public int espacioOcupado() {
        return this.carpetas.stream()
                .mapToInt(Carpeta -> Carpeta.espacioOcupado())
                .sum();
    } 
	
}
