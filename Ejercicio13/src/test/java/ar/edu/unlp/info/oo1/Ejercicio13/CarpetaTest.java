package ar.edu.unlp.info.oo1.Ejercicio13;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CarpetaTest {

    private Carpeta carpeta;
    private Carpeta destino;
    private Email email1;
    private Email email2;
    private Archivo adjunto;

    @BeforeEach
    public void setUp() {
        carpeta = new Carpeta("carpeta");
        destino = new Carpeta("destino");
        email1 = new Email("Asunto1", "Cuerpo1");
        email2 = new Email("Asunto2", "Cuerpo2");
        adjunto = new Archivo("adjunto");
    }

    @Test
    public void testAgregarEmail() {
        carpeta.agregar(email1);
        assertEquals(1, carpeta.getEmails().size());
        assertEquals(email1, carpeta.getEmails().get(0));
    }

    @Test
    public void testMoverEmail() {
        carpeta.agregar(email1);
        carpeta.mover(email1, destino);
        assertEquals(0, carpeta.getEmails().size());
        assertEquals(1, destino.getEmails().size());
        assertEquals(email1, destino.getEmails().get(0));
    }

    @Test
    public void testBuscarTexto() {
        carpeta.agregar(email1);
        carpeta.agregar(email2);
        assertEquals(email2, carpeta.buscarTextoEnCarpeta("Cuerpo2"));
        assertNull(carpeta.buscarTextoEnCarpeta("no existe"));
    }

    @Test
    public void testEspacioOcupado() {
        email1.agregar(adjunto);
        carpeta.agregar(email1);
        carpeta.agregar(email2);
        int espacioEsperado = email1.getTamaño() + email2.getTamaño();
        assertEquals(espacioEsperado, carpeta.espacioOcupado());
    }
}
