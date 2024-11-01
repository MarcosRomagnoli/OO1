package ar.edu.unlp.info.oo1.Ejercicio12;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PrismaRectangularTest {
	PrismaRectangular prisma;

	@BeforeEach
	void setUp() throws Exception {
		this.prisma = new PrismaRectangular ("Hierro", "Rojo",4,4,4);
	}

	@Test
	void testGetVolumen() {
		assertEquals(64,this.prisma.getVolumen());
	}
	
	@Test
	void testGetSuperficie() {
		assertEquals(96,this.prisma.getSuperficie());
	}
}
