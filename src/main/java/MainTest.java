import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class MainTest {

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.Test(expected = IOException.class)
    public void leer_Archivo_DaExcepcion() throws IOException {
        Main.leer_Archivo("\\Users\\Rail\\Desktop\\NoExiste.txt");
    }

    @org.junit.Test
    public void añadir_NoExisteArchivo() {
        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        Main.añadir("\\Users\\Rail\\Desktop\\NoExiste.txt","mensaje");
        assertEquals("El archivo no fue encontrado en este directorio!!\r\n", outContent.toString() );

    }

}