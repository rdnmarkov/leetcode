package org.example.task;

public class LengthOfLastWord {

    /*

    Given a string s consisting of words and spaces, return the length of the last word in the string.

    A word is a maximal substring consisting of non-space characters only.

    */

    public int lengthOfLastWord(String s) {
        if(!s.contains(" ")) return  s.length();
        int counter = 0;
        for (int i = s.length()-1; i >=0 ; i--) {
            if(s.charAt(i) == ' ' && counter!=0) return counter;
            if(s.charAt(i) != ' ') counter++;
        }

        return counter;
    }

    public int lengthOfLastWord1(String s) {
        String[] masString = s.split(" ");
        return masString.length != 0 ? masString[masString.length-1].length() : 0;
    }


    /*

    Example 1:

    Input: s = "Hello World"
    Output: 5
    Explanation: The last word is "World" with length 5.
    Example 2:

    Input: s = "   fly me   to   the moon  "
    Output: 4
    Explanation: The last word is "moon" with length 4.
    Example 3:

    Input: s = "luffy is still joyboy"
    Output: 6
    Explanation: The last word is "joyboy" with length 6.

    */

    public static void main(String[] args) {
        LengthOfLastWord lengthOfLastWord = new LengthOfLastWord();

        System.out.println(lengthOfLastWord.lengthOfLastWord1("Hello World"));
        System.out.println(lengthOfLastWord.lengthOfLastWord1("   fly me   to   the moon  "));
        System.out.println(lengthOfLastWord.lengthOfLastWord1("luffy is still joyboy"));
        System.out.println(lengthOfLastWord.lengthOfLastWord("Hello World"));
        System.out.println(lengthOfLastWord.lengthOfLastWord("   fly me   to   the moon  "));
        System.out.println(lengthOfLastWord.lengthOfLastWord("luffy is still joyboy"));
    }

}
