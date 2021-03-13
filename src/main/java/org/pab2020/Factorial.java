package org.pab2020;

import java.math.BigInteger;

/**
 *
 *
 */
public class Factorial {
    public BigInteger compute(BigInteger value) {
        BigInteger result;
        if (value.compareTo(BigInteger.ZERO) < 0) {
            throw new RuntimeException("Error.NegativeNumber:" + value);
        }else if ((value.compareTo(BigInteger.ZERO) == 0) || (value.compareTo(BigInteger.ONE) == 0)) {
            result = BigInteger.ONE;
        } else {
            result = value.multiply(compute(value.subtract(BigInteger.ONE)));
        }
        return result;
    }
}
