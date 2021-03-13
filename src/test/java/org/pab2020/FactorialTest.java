package org.pab2020;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/*
  factorial 0 -> 1
  factorial 1 -> 1
  factorial 2 -> 2
  factorial 3 -> 3 * 2 = 6
  factorial 4 -> 4 * 3 * 2 = 24
  factorial 8 -> 40320
  factorial 27 -> 10888869450418352160768000000
  factorial 50 -> 30414093201713378043612608166064768844377641568960512000000000000
*/
public class FactorialTest {

    private Factorial factorial;

    @BeforeEach
    public void setup(){
        factorial = new Factorial();
    }

    @Test
    public void shouldFactorialOfZeroReturn1() {
        BigInteger result = factorial.compute(BigInteger.ZERO);
        BigInteger expectedValue = BigInteger.ONE;

        assertEquals(expectedValue, result);
    }

    @Test
    public void shouldFactorialOf1Return1() {
        BigInteger result = factorial.compute(BigInteger.ONE);
        BigInteger expectedValue = BigInteger.ONE;

        assertEquals(expectedValue, result);
    }

    @Test
    public void shouldFactorialOf2Return2() {
        BigInteger result = factorial.compute(BigInteger.TWO);
        BigInteger expectedValue = BigInteger.TWO;

        assertEquals(expectedValue, result);
    }

    @Test
    public void shouldFactorialOf3Return6() {
        BigInteger result = factorial.compute(BigInteger.valueOf(3));
        BigInteger expectedValue = BigInteger.valueOf(6);

        assertEquals(expectedValue, result);
    }

    @Test
    public void shouldFactorialOf8Return40320() {
        BigInteger result = factorial.compute(BigInteger.valueOf(8));
        BigInteger expectedValue = BigInteger.valueOf(40320);

        assertEquals(expectedValue, result);
    }

    @Test
    public void shouldFactorialOf27Return10888869450418352160768000000() {
        BigInteger result = factorial.compute(BigInteger.valueOf(27));
        BigInteger expectedValue = new BigInteger("10888869450418352160768000000");

        assertEquals(expectedValue, result);
    }

    @Test
    public void shouldFactorialOf50Return30414093201713378043612608166064768844377641568960512000000000000() {
        BigInteger result = factorial.compute(BigInteger.valueOf(50));
        BigInteger expectedValue = new BigInteger("30414093201713378043612608166064768844377641568960512000000000000");

        assertEquals(expectedValue, result);
    }

    @Test
    public void shouldFactorialOfMinusOneRaisesAnException(){
        assertThrows(RuntimeException.class, () -> factorial.compute(BigInteger.valueOf(-1)));
    }
}
