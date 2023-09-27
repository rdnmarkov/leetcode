package org.example.task;

public class AddBinary {

    /*
    Given two binary strings a and b, return their sum as a binary string.
    */

    public String addBinary(String a, String b) {

        StringBuilder builder = new StringBuilder();
        int add = 0;
        int i = a.length() - 1;
        int j = b.length() - 1;

        while (i >= 0 || j >= 0 || add == 1) {
            if (i >= 0) {
                add += a.charAt(i--) == '1' ? 1 : 0;
            }
            if (j >= 0) {
                add += b.charAt(j--) == '1' ? 1 : 0;
            }
            builder.append(add % 2);
            add /= 2;
        }

        return builder.reverse().toString();
    }


    /*

    i = 2 1 0 -1
    j = 1 0 -1 -1

    a 1 1 1 0
    b 0 1 0 1 reverse 1 0 1 0
    111  1 1 1 -
     11  1 1 - -


    Example 1:

    Input: a = "11", b = "1"
    Output: "100"
    Example 2:

    Input: a = "1010", b = "1011"
    Output: "10101

    */

    public static void main(String[] args) {
        AddBinary addBinary = new AddBinary();

        System.out.println(addBinary.addBinary("111", "11"));
        System.out.println(addBinary.addBinary("11", "1"));
        System.out.println(addBinary.addBinary("1010", "1011"));

    }


}
