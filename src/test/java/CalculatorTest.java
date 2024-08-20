import org.example.exceptions.CtgInvalideException;
import org.example.exceptions.DivideByZeroException;
import org.example.exceptions.LogorhythmException;
import org.example.exceptions.TanZeroExceptions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest{

    @Test
    public void sumTest(){
        double a = 5;
        double b = 7;
        double expected = 12;
        assertEquals(expected, new Calculator().sum(a,b));
    }

    @Test
    void divisionByZeroTest() {
        double a = 7;
        double b = 0;
        assertThrows(DivideByZeroException.class,() -> new Calculator().division(a,b));

    }

    @Test
    void divisionPositiveTest() {
        double a = 7;
        double b = 7;
        double expected = 1;
        assertEquals(expected, new Calculator().division(a,b));
    }

    @Test
    void multiplyTest() {
        double a = 7;
        double b = 7;
        double expected = 49;
        assertEquals(expected, new Calculator().multiply(a,b));
    }

    @Test
    void sinTest() {
        double a=Math.PI/6;
        double expected = 0.5 ;
        assertEquals(expected, new Calculator().sin(a),0.0001);
    }
    @Test
    void cosTest() {
        double a=Math.PI/3;
        double expected = 0.5 ;
        assertEquals(expected, new Calculator().cos(a),0.0001);
    }

    @Test
    void tanPositiveTest(){
        double a=Math.PI/4;
        double expected = 1;
        assertEquals(expected, new Calculator().tan(a),0.0001);
    }

    @Test
    void tanNegativeTest(){
        double a=Math.PI/2;
        assertThrows(TanZeroExceptions.class,() -> new Calculator().tan(a));
    }

    @Test
    void ctgPositiveTest(){
        double a=Math.PI/4;
        double expected = 1;
        assertEquals(expected, new Calculator().tan(a),0.0001);
    }

    @Test
    void ctgNegativeTest(){
        double a=Math.PI*2;
        assertThrows(CtgInvalideException.class,() -> new Calculator().ctg(a));
    }

    @Test
    void logorhythmPositiveTest() {
        double a = 16;
        double expected = 2.772588;
        assertEquals(expected,new Calculator().logorhythm(a),0.000001);
    }

    @Test
    void logorhythmNegativeTest() {
        double a = -1;
        assertThrows(LogorhythmException.class,() -> new Calculator().logorhythm(a));
    }
}
