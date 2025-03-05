package com.leszko.calculator;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * The {@code Calculator} class provides basic arithmetic operations.
 * This class includes a method for summing two integers and utilizes caching 
 * to improve performance.
 */
public class CalculatorTest {
     private Calculator calculator = new Calculator();

     @Test
     public void testSum() {
          assertEquals(5, calculator.sum(2, 3));
     }

}
