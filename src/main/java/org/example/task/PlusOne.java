package org.example.task;

import java.util.Arrays;

public class PlusOne {

    /*

    You are given a large integer represented as an integer array digits,where each digits[i] is the ith digit of the integer.
    The digits are ordered from most significant to least significant in left-to-right order.
    The large integer does not contain any leading 0's.

    Increment the large integer by one and return the resulting array of digits.

    Constraints:

    1 <= digits.length <= 100
    0 <= digits[i] <= 9
    digits does not contain any leading 0's.

    */

    public int[] plusOne(int[] digits) {
        int add = 1;
        for (int i = digits.length-1; i >=0 ; i--) {
            if(digits[i]+add<10){
                digits[i] = digits[i]+add;
                return digits;
            }else{
                digits[i] = 0;
            }
        }

        int[] newDigits = new int[digits.length+1];
        newDigits[0] = 1;
        return  newDigits;

    }

    /*

    1,2,3 -> 1,2,4
    9,9 - > 1,0,0

    Example 1:

    Input: digits = [1,2,3]
    Output: [1,2,4]
    Explanation: The array represents the integer 123.
    Incrementing by one gives 123 + 1 = 124.
    Thus, the result should be [1,2,4].
    Example 2:

    Input: digits = [4,3,2,1]
    Output: [4,3,2,2]
    Explanation: The array represents the integer 4321.
    Incrementing by one gives 4321 + 1 = 4322.
    Thus, the result should be [4,3,2,2].
    Example 3:

    Input: digits = [9]
    Output: [1,0]
    Explanation: The array represents the integer 9.
    Incrementing by one gives 9 + 1 = 10.
    Thus, the result should be [1,0].
    */

    public static void main(String[] args) {
        PlusOne plusOne = new PlusOne();

        Arrays.stream(plusOne.plusOne(new int[]{1, 2, 3})).forEach(el -> System.out.print(el + " "));
        System.out.println();
        Arrays.stream(plusOne.plusOne(new int[]{4, 3, 2, 1})).forEach(el -> System.out.print(el + " "));
        System.out.println();
        Arrays.stream(plusOne.plusOne(new int[]{9})).forEach(el -> System.out.print(el + " "));
    }
}
