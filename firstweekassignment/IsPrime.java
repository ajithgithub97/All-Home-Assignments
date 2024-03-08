package firstweekassignment;

public class IsPrime {
	public static void main(String[] args) {
		int num = 19;
				boolean isprime = true;
				for (int i = 2; i <=num; i++) {
					if (num%i==0) 
						isprime = false;break;
					}
				if (isprime) {
				System.out.println("this number is prime");	
				}
				else {
					System.out.println("this number is not prime");
				}
	}
}

	
