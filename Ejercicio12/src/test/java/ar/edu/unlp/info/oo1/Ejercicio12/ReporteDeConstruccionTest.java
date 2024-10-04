package ar.edu.unlp.info.oo1.Ejercicio12;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

class ReporteDeConstruccionTest {

	private Esfera esfera;
	private Cilindro cilindro;
	private PrismaRectangular prisma;
	private ReporteDeConstruccion reporte;

	@BeforeEach
	void setUp() throws Exception {
		esfera = new Esfera("Hierro","Rojo",5);
		cilindro = new Cilindro("Hierro","Azul",5,4);
		prisma = new PrismaRectangular ("Bronce","Rojo",3,3,3);
		reporte = new ReporteDeConstruccion();
		reporte.agregar(cilindro);
		reporte.agregar(prisma);
		reporte.agregar(esfera);
	}
	
	@Test
	void testGetVolumenDeMaterial() {
		assertEquals(27,Math.round(this.reporte.getVolumenDeMaterial("Bronce")));
	}
	
	@Test
	void testGetSuperficieDeColor() {
		assertEquals(368,Math.round(this.reporte.getSuperficieDeColor("Rojo")));
	}
}
