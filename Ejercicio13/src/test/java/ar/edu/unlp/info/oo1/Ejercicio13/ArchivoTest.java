package ar.edu.unlp.info.oo1.Ejercicio13;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ArchivoTest {

    private Archivo archivo;

    @BeforeEach
    public void setUp() {
        archivo = new Archivo("archivo");
    }

    @Test
    public void testGetTamaño() {
        assertEquals(7, archivo.getTamaño()); 
    }
}
