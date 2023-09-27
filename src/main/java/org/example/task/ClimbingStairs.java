package org.example.task;

import java.util.HashMap;

public class ClimbingStairs {

    /*

    You are climbing a staircase. It takes n steps to reach the top.

    Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

    1 <= n <= 45
    */

    HashMap<Integer, Integer> map = new HashMap<>();
    public int climbStair(int n) {
        if(n == 0 || n == 1) return 1;
        if(map.containsKey(n)) return map.get(n);

        int sum =  climbStair(n-1) + climbStair(n-2);
        map.put(n, sum);
        return  sum;

    }



    public int climbStair1(int n) {
        if(n == 0 || n == 1) return 1;
        return climbStair1(n-1) + climbStair1(n-2);
    }

    /*

    2 - 2 способа
    1 1
    2

    3 - 3 способа
    1 1 1
    1 2
    2 1

    4 - 5 способов
    1 1 1 1
    1 1 2
    2 1 1
    1 2 1
    2 2

    5  - 8 способов
    1 1 1 1 1
    1 1 1 2
    1 1 2 1
    1 2 1 1
    2 1 1 1
    2 1 2
    1 2 2
    2 2 1

    n=(n-1)+(n-2)

    Example 1:

    Input: n = 2
    Output: 2
    Explanation: There are two ways to climb to the top.
    1. 1 step + 1 step
    2. 2 steps
    Example 2:

    Input: n = 3
    Output: 3
    Explanation: There are three ways to climb to the top.
    1. 1 step + 1 step + 1 step
    2. 1 step + 2 steps
    3. 2 steps + 1 step

    */

    public static void main(String[] args) {
        ClimbingStairs climbingStairs = new ClimbingStairs();


        System.out.println(climbingStairs.climbStair(3));
        System.out.println(climbingStairs.climbStair(4));
        System.out.println(climbingStairs.climbStair(5));
        System.out.println(climbingStairs.climbStair(45));
    }
}
