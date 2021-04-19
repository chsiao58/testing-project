import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    public void 加法Test1(){
        int actual = Calculator.加法(2,3);
        assertEquals(5, actual);
    }

    @Test
    public void 加法Test2(){
        int actual = Calculator.加法(100,5);
        assertEquals(105, actual);
    }

    @Test
    public void 減法Test(){
        int actual = Calculator.減法(3,2);
        assertEquals(1, actual);
    }

    @Test
    public void 減法Test2(){
        int actual = Calculator.減法(20,5);
        assertEquals(15, actual);
    }

}