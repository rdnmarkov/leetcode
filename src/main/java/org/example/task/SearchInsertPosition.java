package org.example.task;

public class SearchInsertPosition {

    /*

    Given a sorted array of distinct integers and a target value, return the index if the target is found.
    If not, return the index where it would be if it were inserted in order.

    You must write an algorithm with O(log n) runtime complexity

    */

    public int searchInsert1(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= target) return i;
        }
        return nums.length;
    }

    public int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (nums[mid] == target) return mid;

            if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }

        }
        return start;
    }

   /*

   O(log n)


   public int binarySearch(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == key) {
                return mid;
            }

            if (arr[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1;

    }
        5 low = 0 high = 9
        1,3,6,7,8,9,11,13,14     (0+9)/2 = 4 low = 0 high = 3
        1,3,6,7,8,9,11,13,14     (0+3)/2 = 1 low = 2 high = 3
        1,3,6,7,8,9,11,13,14     (2+3)/2 = 2 low = 2 high = 2
        1,3,6,7,8,9,11,13,14     (2+2)/2 = 2 low = 2 high = 1



    Input: nums = [1,3,5,6], target = 2
    Output: 1
    Example 3:

    Input: nums = [1,3,5,6], target = 7
    Output: 4

    */

    public static void main(String[] args) {
        SearchInsertPosition searchInsertPosition = new SearchInsertPosition();

        System.out.println(searchInsertPosition.searchInsert(new int[]{1,3,5,6}, 2));
        System.out.println(searchInsertPosition.searchInsert(new int[]{1, 3, 5, 6}, 7));
    }

}
