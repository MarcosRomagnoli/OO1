package ar.edu.unlp.info.oo1.Ejercicio11;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class InversionEnAccionesTest {

	private InversionEnAcciones inversion;

	@BeforeEach
	void setUp() throws Exception {
		inversion = new InversionEnAcciones("Williams", 10, 10);
	}

	@Test
	void testConstructor() {
		assertEquals("Williams", inversion.getNombre());
		assertEquals(10, inversion.getCantidad());
		assertEquals(10,inversion.getValorUnitario());
	}
	
	@Test
	void testValorActual() {
		assertEquals(100,inversion.valorActual());
	}

}
