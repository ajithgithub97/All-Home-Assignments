package week3.day2.homeassignment;

import java.util.Arrays;

public class FindSecondLargestNumber {
public static void main(String[] args) {
	int[] nums = {3,2,11,4,6,7};
	Arrays.sort(nums);
	int len = nums.length;
	System.out.println("Second Lorgest Number:" +(nums[len-2]));
}
}
