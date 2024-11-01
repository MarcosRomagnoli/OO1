package ar.edu.unlp.info.oo1.Ejercicio14.b;

import java.time.LocalDate;

public class DateLapse2 {
	private LocalDate from;
	private int sizeInDays;
	
	
	public DateLapse2(LocalDate fecha1, int cant) {
		this.from = fecha1;
		this.sizeInDays = cant;
	}

	public LocalDate getFrom() {
		return from;
	}
	
	public LocalDate getTo() {
		return this.from.plusDays(this.sizeInDays());
	}
	
	public int sizeInDays () {
		return sizeInDays;	
	}
	
	public boolean includesDate (LocalDate fecha) {
		return (fecha.equals(this.getFrom()) || fecha.equals(this.getTo()))
				|| (fecha.isBefore(this.getTo()) && fecha.isAfter(this.getFrom()))
						;
	}
}
