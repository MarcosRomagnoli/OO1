package ar.edu.unlp.info.oo1.Ejercicio14.a;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DateLapse implements Date{
	private LocalDate from;
	private LocalDate to;
	
	
	
	public DateLapse(LocalDate fecha1, LocalDate fecha2) {
		super();
		this.from = fecha1;
		this.to = fecha2;
	}

	public LocalDate getFrom() {
		return from;
	}
	
	public LocalDate getTo() {
		return to;
	}
	
	public int sizeInDays () {
		return (int) ChronoUnit.DAYS.between(from, to);	
	}
	
	public boolean includesDate (LocalDate fecha) {
		return (fecha.equals(this.getFrom()) || fecha.equals(this.getTo()))
				|| (fecha.isBefore(this.getTo()) && fecha.isAfter(this.getFrom()));
	}
}
