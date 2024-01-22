package org.example.task;

public class SqrtX {

    /*
    Given a non-negative integer x, return the square root of x rounded down to the nearest integer.
     The returned integer should be non-negative as well.

    You must not use any built-in exponent function or operator.

    For example, do not use pow(x, 0.5) in c++ or x ** 0.5 in python.
    */

    public int mySqrt(int x) {
        int l = 0;
        int r = x;
        while (l <= r) {
            int mid = l + (r - l) / 2;

            if (mid * mid == x) return mid;

            if ((long)mid * mid > x) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }

        }

        return r;
    }

    /*

    91 = 9,5393 ... mid = l+(r-l)/2     mid*mid?x
    1. l = 0 r = 91 mid = 45  (2025) r = mid - 1 = 44
    2. l = 0 r = 44 mid = 22  (484) r = mid - 1 = 21
    3. l = 0 r = 21 mid = 10  (100) r = mid - 1 = 9
    4. l = 0 r = 9 mid = 4  (16) l = mid + 1 = 5
    5. l = 5 r = 9 mid = 7  (49) l = mid + 1 = 8
    6. l = 8 r = 9 mid = 8  (64) l = mid + 1 = 9
    7. l = 9 r = 9 mid = 9  (81) l = mid + 1 = 10 l<=r return r




    Example 1:

    Input: x = 4
    Output: 2
    Explanation: The square root of 4 is 2, so we return 2.
    Example 2:

    Input: x = 8
    Output: 2
    Explanation: The square root of 8 is 2.82842..., and since we round it down to the nearest integer, 2 is returned.

    */

    public static void main(String[] args) {
        SqrtX sqrtX = new SqrtX();

        System.out.println(sqrtX.mySqrt(4));
        System.out.println(sqrtX.mySqrt(8));
        System.out.println(sqrtX.mySqrt(91));
        System.out.println(sqrtX.mySqrt(2147395599));

    }
}
