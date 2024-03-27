package week3.day1.homeassignment;

public class ReverseOddWords {
	public static void main(String[] args) {
		String test = "I am a software tester"; //
		String[] word = test.split(" ");
		
		for (int i = 0; i < word.length; i++) {  //0=I,1=am,2=a,3=software,4=tester// 1&3 is odd num
			if (i%2==1) {
				char[] cha = word[i].toCharArray();
				for (int j = cha.length-1; j>= 0 ; j--) {
					System.out.print(cha[j]);
				}
			}else {
				System.out.print(word[i]);
			}
			System.out.print(" ");
		}
	}
}
