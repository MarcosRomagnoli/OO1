package ar.edu.unlp.info.oo1.Ejercicio14.a;

import java.time.LocalDate;

public interface Date {
	
	public LocalDate getFrom();
	
	public int sizeInDays();
	
	public boolean includesDate (LocalDate fecha);
}
