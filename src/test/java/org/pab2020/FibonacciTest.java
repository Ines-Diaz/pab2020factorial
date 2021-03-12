package org.pab2020;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/*
  fibonacci (0, k) -> 0
  fibonacci (1, k) -> 1
  fibonacci (2, k) -> 1
  fibonacci (3, 2) -> 1 + 1*2 = 3
  fibonacci (4, 2) -> 3 + 1*2 = 5
  fibonacci (4, 4) -> [fib(3,4)=1+1*4=5] -> 5 + 1*4 = 9
  fibonacci (5, 3) -> 19
  fibonacci (13, 3) -> 14209
*/
public class FibonacciTest {

    private Fibonacci fibonacci;

    @BeforeEach
    public void setup(){
        fibonacci = new Fibonacci();
    }

    @Test
    public void shouldFibonacciOfN0K2Return0() {
        int result = fibonacci.compute(0, 2);
        int expectedValue = 0;

        assertEquals(expectedValue, result);
    }

    @Test
    public void shouldFibonacciOfN1K2Return1() {
        int result = fibonacci.compute(1, 2);
        int expectedValue = 1;

        assertEquals(expectedValue, result);
    }

    @Test
    public void shouldFibonacciOfN2K2Return1() {
        int result = fibonacci.compute(2, 2);
        int expectedValue = 1;

        assertEquals(expectedValue, result);
    }

    @Test
    public void shouldFibonacciOfN3K2Return3() {
        int result = fibonacci.compute(3, 2);
        int expectedValue = 3;

        assertEquals(expectedValue, result);
    }

    @Test
    public void shouldFibonacciOfN4K2Return5() {
        int result = fibonacci.compute(4, 2);
        int expectedValue = 5;

        assertEquals(expectedValue, result);
    }

    @Test
    public void shouldFibonacciOfN4K4Return9() {
        int result = fibonacci.compute(4, 4);
        int expectedValue = 9;

        assertEquals(expectedValue, result);
    }

    @Test
    public void shouldFibonacciOfN5K3Return19() {
        int result = fibonacci.compute(5, 3);
        int expectedValue = 19;

        assertEquals(expectedValue, result);
    }
    @Test
    public void shouldFibonacciOfN13K3Return14209() {
        int result = fibonacci.compute(13, 3);
        int expectedValue = 14209;

        assertEquals(expectedValue, result);
    }

    @Test
    public void shouldFibonacciOfNMinusOneRaisesAnException(){
        assertThrows(RuntimeException.class, () -> fibonacci.compute(-1,2));
    }

    @Test
    public void shouldFibonacciOfKMinusOneRaisesAnException(){
        assertThrows(RuntimeException.class, () -> fibonacci.compute(10,-1));
    }

    @Test
    public void shouldFibonacciOfNOutOfRangeRaisesAnException(){
        assertThrows(RuntimeException.class, () -> fibonacci.compute(50,2));
    }

    @Test
    public void shouldFibonacciOfKOutOfRangeRaisesAnException(){
        assertThrows(RuntimeException.class, () -> fibonacci.compute(10,8));
    }
}

