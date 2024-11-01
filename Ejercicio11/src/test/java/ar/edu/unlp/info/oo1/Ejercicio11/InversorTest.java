package ar.edu.unlp.info.oo1.Ejercicio11;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class InversorTest {
	
	private Inversor inversorConInversiones;
	private Inversor inversorSinInversiones;
	private Inversion plazoFijo;
	private Inversion inversion;
	private Inversion plazoFijo2;
	
	@BeforeEach
	void setUp() throws Exception {
		inversorConInversiones = new Inversor("Max Verstappen");
		inversorSinInversiones = new Inversor ("Franco Colapinto");
		LocalDate fecha = LocalDate.now().minus(10,ChronoUnit.DAYS);
		plazoFijo = new PlazoFijo(fecha,100, 0.05);
		inversion = new InversionEnAcciones("Red Bull", 10, 10);
		plazoFijo2 = new PlazoFijo(LocalDate.now(),100, 0.05);
	}

	@Test
	void testConstructor() {
		assertEquals("Max Verstappen",inversorConInversiones.getNombre());
		assertEquals("Franco Colapinto",inversorSinInversiones.getNombre());
		assertNotNull(inversorSinInversiones.getInversiones());
		assertNotNull(inversorConInversiones.getInversiones());
	}
	
	@Test
	void agregarInversion() {
		inversorConInversiones.agregarInversion(inversion);
		inversorConInversiones.agregarInversion(plazoFijo);
		inversorConInversiones.agregarInversion(plazoFijo2);
		assertEquals(3, inversorConInversiones.getInversiones().size());
		assertEquals(0, inversorSinInversiones.getInversiones().size());

		
	}
	
	@Test 
	void testValorActual() {
		inversorConInversiones.agregarInversion(inversion);
		inversorConInversiones.agregarInversion(plazoFijo);
		inversorConInversiones.agregarInversion(plazoFijo2);
		assertEquals(350, inversorConInversiones.valorActual());
		assertEquals(0, inversorSinInversiones.valorActual());
	}


}
