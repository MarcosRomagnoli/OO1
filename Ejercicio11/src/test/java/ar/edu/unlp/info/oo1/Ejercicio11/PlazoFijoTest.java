package ar.edu.unlp.info.oo1.Ejercicio11;

import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

class PlazoFijoTest {

	private PlazoFijo plazoFijo;

	@BeforeEach
	void setUp() throws Exception {
		LocalDate fecha = LocalDate.now().minus(10,ChronoUnit.DAYS);
		plazoFijo = new PlazoFijo(fecha,100, 0.1); 
	}

	@Test
	void testConstructor() {
		assertEquals(LocalDate.now().minus(10,ChronoUnit.DAYS) , plazoFijo.getFechaDeConstitucion());
		assertEquals(100, plazoFijo.getMontoDepositado());
		assertEquals(0.1,plazoFijo.getPorcentajeDeInteresDiario());
	}
	
	void testValorActual() {
		assertEquals(200,plazoFijo.valorActual());
	}
}
