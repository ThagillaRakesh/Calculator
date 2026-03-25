package com.example.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class CalculatorApplicationTests {

    @Test
    public void testAdd() {
        CalculatorApplication c = new CalculatorApplication();
        assertEquals(5, c.add(2, 3));
    }

    @Test
    public void testSubtract() {
        CalculatorApplication c = new CalculatorApplication();
        assertEquals(-1, c.subtract(2, 3));
    }
}
