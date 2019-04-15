package leetcode;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;


//Given an array of integers, return indices of the two numbers such that they add up to a specific target.
//
//You may assume that each input would have exactly one solution, and you may not use the same element twice.

class TwoSumSolution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],i);
        }
        int [] result = new int[2];
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(target - nums[i]) && i!=map.get(target - nums[i])){
                result[0] = i;
                result[1] = map.get(target - nums[i]);
                break;
            }
        }
        return result;
    }
}

public class TwoSum {

    public static String integerArrayToString(int[] nums, int length) {
        if (length == 0) {
            return "[]";
        }

        String result = "";
        for(int index = 0; index < length; index++) {
            int number = nums[index];
            result += Integer.toString(number) + ", ";
        }
        return "[" + result.substring(0, result.length() - 2) + "]";
    }

    public static String integerArrayToString(int[] nums) {
        return integerArrayToString(nums, nums.length);
    }

    public static void main(String[] args) throws IOException {
        TwoSumSolution solution = new TwoSumSolution();
        int [] result = solution.twoSum(new int[]{2,7,11,15}, 9);
        String out = integerArrayToString(result);

        System.out.print(out);
    }
}
