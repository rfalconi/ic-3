import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FraccionTest {

    private Fraccion fraccion;


    @Before
    public void before(){
        this.fraccion = new Fraccion(5,6);
    }

    @Test
    public void suma() {
        assertEquals(11, this.fraccion.suma());
    }


    @Test
    public void resta() {
        assertEquals(-1, this.fraccion.resta());
    }

    @Test
    public void inversa() {
        assertEquals("6/5",this.fraccion.inversa());
    }

    @Test
    public void multiplicacion() {
        assertEquals(30,this.fraccion.multiplicacion());
    }
}