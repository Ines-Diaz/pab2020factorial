package org.pab2020;

public class Fibonacci {

    public int compute (int n, int k) {
        int result;
        if ((n < 0) || (n > 40) || (k < 0) || (k > 5)) {
            throw new RuntimeException("Error.ValueOutOfRange");
        } else if (n == 0) {
            result = 0;
        } else if ((n == 1)||(n == 2)) {
            result = 1;
        } else {
            result = compute(n-1, k) + compute(n-2, k) * k;
        }
        return result;
    }
}
