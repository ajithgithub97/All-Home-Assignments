package week3.day2.homeassignment;

import java.util.ArrayList;

import java.util.List;

public class FindIntersection {
public static void main(String[] args) {
	int[] nums1 = {3,2,11,4,6,7};
	int[] nums2 = {1,2,8,4,9,7};
	
	List<Integer> list1 = new ArrayList<>();
	List<Integer> list2 = new ArrayList<>();
	
	for (int i = 0; i < nums1.length; i++) {
		list1.add(nums1.length);
		for (int j = 0; j < nums2.length; j++) {
			list2.add(nums2.length);
			if (nums1[i]==nums2[j]) {
				System.out.println("Equal Value:" +nums1[i]);
			}
		}
	}
}
}
