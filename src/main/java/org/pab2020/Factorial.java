package org.pab2020;

/**
 *
 *
 */
public class Factorial {
    public int compute(int value) {
        int result;
        if (value < 0) {
            throw new RuntimeException("Error.NegativeNumber:" + value);
        }else if ((value == 0) || (value == 1)) {
            result = 1;
        } else {
            result = 1;
            for (int i = 1; i <= value; i++) {
                result *= i;
            }
        }
        return result;
    }
}
