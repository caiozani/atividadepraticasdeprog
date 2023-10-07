import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class ConversorDeCartasTest {

    @Test
    public void testConverteAsPara1() {
        ConversorDeCartas conversor = new ConversorDeCartas();
        assertEquals(1, conversor.converteCartaParaInt("A"));
    }

    @Test
    public void testConverteDoisPara2() {
        ConversorDeCartas conversor = new ConversorDeCartas();
        assertEquals(2, conversor.converteCartaParaInt("2"));
    }

    @Test
    public void testConverteTresPara3() {
        ConversorDeCartas conversor = new ConversorDeCartas();
        assertEquals(3, conversor.converteCartaParaInt("3"));
    }

    @Test
    public void testConverteDezPara10() {
        ConversorDeCartas conversor = new ConversorDeCartas();
        assertEquals(10, conversor.converteCartaParaInt("10"));
    }

    @Test
    public void testConverteJPara11() {
        ConversorDeCartas conversor = new ConversorDeCartas();
        assertEquals(11, conversor.converteCartaParaInt("J"));
    }

    @Test
    public void testConverteQPara12() {
        ConversorDeCartas conversor = new ConversorDeCartas();
        assertEquals(12, conversor.converteCartaParaInt("Q"));
    }

    @Test
    public void testConverteKPara13() {
        ConversorDeCartas conversor = new ConversorDeCartas();
        assertEquals(13, conversor.converteCartaParaInt("K"));
    }

    @Test
    public void testConverteCoringaParaMenosUm() {
        ConversorDeCartas conversor = new ConversorDeCartas();
        assertEquals(-1, conversor.converteCartaParaInt("Coringa"));
    }
}
