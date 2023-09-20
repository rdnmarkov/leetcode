package org.example.task;

import java.util.Arrays;

public class LongestCommonPrefix {

    /*
        Write a function to find the longest common prefix string amongst an array of strings.

        If there is no common prefix, return an empty string "".
    */

    public String longestCommonPrefix(String[] strs) {
        StringBuilder builder = new StringBuilder();

        Arrays.sort(strs);

        String first = strs[0];
        String last = strs[strs.length-1];

        for (int i = 0; i < Math.min(first.length(),last.length()); i++) {
            if(first.charAt(i)==last.charAt(i)){
                builder.append(first.charAt(i));
            }else return builder.toString();
        }


        return builder.toString();
    }

    public String longestCommonPrefix1(String[] strs) {

        if(strs[0].isEmpty() && strs.length<=1) return  strs[0];

        int index = 1;
        int endIndex = 1;

        while (true){
            try{
                String prefix = strs[0].substring(0,endIndex);
                if(strs[index].substring(0,endIndex).contains(prefix)){
                    index++;
                } else throw new Exception();
            }catch (Exception e){
                return strs[0].substring(0,endIndex-1);
            }
            if(index==strs.length){
                index = 1;
                endIndex++;
            }
        }

    }

   /*

   Example 1:

    Input: strs = ["flower","flow","flight"]
    Output: "fl"
    Example 2:

    Input: strs = ["dog","racecar","car"]
    Output: ""
    Explanation: There is no common prefix among the input strings.

    */

    public static void main(String[] args) {
        LongestCommonPrefix commonPrefix = new LongestCommonPrefix();

        System.out.println(commonPrefix.longestCommonPrefix(new String[]{"flower", "flow", "flight"}));
        System.out.println(commonPrefix.longestCommonPrefix(new String[]{"dog","racecar","car"}));
        System.out.println(commonPrefix.longestCommonPrefix(new String[]{"flower","flower","flower","flower"}));
    }

}
