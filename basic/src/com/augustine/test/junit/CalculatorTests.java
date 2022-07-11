package com.augustine.test.junit;
import static org.junit.jupiter.api.Assertions.*;
import com.augustine.junit.Calculator;
import org.junit.jupiter.api.Test;

public class CalculatorTests {
    @Test
    void test() {
        var calculator = new Calculator();
        int actual = calculator.add(2,3);
        assertEquals(5, actual);
    }
}
