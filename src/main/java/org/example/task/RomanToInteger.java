package org.example.task;

import java.util.HashMap;

public class RomanToInteger {

//    Given a roman numeral, convert it to an integer.

    public int romanToInt(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int num = 0;
        for (int i = 0; i < s.length(); i++) {

            if(i<s.length()-1 && map.get(s.charAt(i))<map.get(s.charAt(i+1))){
                num-=map.get(s.charAt(i));
            }else {
                num+=map.get(s.charAt(i));
            }

        }
        return num;
    }


/*    Example 1:

    Input: s = "III"
    Output: 3
    Explanation: III = 3.
    Example 2:

    Input: s = "LVIII"
    Output: 58
    Explanation: L = 50, V= 5, III = 3.
    Example 3:

    Input: s = "MCMXCIV"
    Output: 1994
    Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.

*/

    public static void main(String[] args) {
        RomanToInteger romanToInteger = new RomanToInteger();

        System.out.println(romanToInteger.romanToInt("III"));
        System.out.println(romanToInteger.romanToInt("LVIII"));
        System.out.println(romanToInteger.romanToInt("MCMXCIV"));
    }

}
