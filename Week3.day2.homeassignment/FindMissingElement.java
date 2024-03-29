package week3.day2.homeassignment;


import java.util.Arrays;



public class FindMissingElement {
public static void main(String[] args) {
	int[] num = {1,2,3,4,10,6,8};
	Arrays.sort(num);
	for (int i = 0; i < num.length-1; i++) {
		for (int j = num[i]+1; j < num[i+1]; j++) {
			if (num[i]+1 != num[i+1]) {
				System.out.println(j);
			}
			}
			
		
	}
}
}
