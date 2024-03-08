package firstweekassignment;

public class FibonacciSeries {
	public static void main(String[] args) {
		int num=8;
		int first=0;
		int second=1;
		int third=1;
		for (int i = 0; i <=num; i++) {
		if (first==21)break;
		System.out.println(first);
		third=first+second;
		first=second;
		second=third;
		
			

		}
	}
	

}
