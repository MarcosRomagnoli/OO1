package ar.edu.unlp.info.oo1.Ejercicio11;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class InversionEnAccionesTest {

	private InversionEnAcciones inversion;

	@BeforeEach
	void setUp() throws Exception {
		inversion = new InversionEnAcciones("SoyUnaInversion", 5, 5);
	}

	@Test
	void testConstructor() {
		assertEquals("SoyUnaInversion", inversion.getNombre());
		assertEquals(5, inversion.getCantidad());
		assertEquals(5,inversion.getValorUnitario());
	}
	
	@Test
	void testValorActual() {
		assertEquals(25,inversion.valorActual());
	}

}
