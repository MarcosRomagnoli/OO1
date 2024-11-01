package ar.edu.unlp.info.oo1.Ejercicio12;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

class CilindroTest {
	Cilindro cilindro;

	@BeforeEach
	void setUp() throws Exception {
		this.cilindro = new Cilindro("Hierro", "Rojo", 3,3);
	}
	

	@Test
	void testGetVolumen() {
		assertEquals(85,Math.round(this.cilindro.getVolumen()));
	}
	
	@Test
	void testGetSuperficie() {
		assertEquals(113,Math.round(this.cilindro.getSuperficie()));
	}
	

}
