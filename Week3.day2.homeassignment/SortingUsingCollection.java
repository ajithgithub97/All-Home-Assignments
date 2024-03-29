package week3.day2.homeassignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingUsingCollection {
public static void main(String[] args) {
	String[] names =  {"HCL","Wipro","Aspire Systems","CTS"};
	Arrays.sort(names);
	List<String> list = new ArrayList<>();
	Collections.addAll(list, names);
	for (int i = names.length-1; i >=0 ; i--) {
		
		System.out.print(names[i]+ ", ");
	}
 
}
}

