package week3.day1.homeassignment;

import java.util.Arrays;




public class FindMissingElement {
public static void main(String[] args) {
	int[] input = {1,4,3,2,8,6,7};
	Arrays.sort(input);
	int sum1= 0;
	int sum2=0;
	for (int i = 0; i < input.length; i++) { //0-1 1-2 2-3 3-4 4-6 5-7 6-8 // 
		sum1=sum1+input[i];}
		for (int j = 0; j <=8; j++) {
			sum2=sum2+j;
		}
	System.out.println("Missing Number:" +(sum2-sum1));
	
}
}
