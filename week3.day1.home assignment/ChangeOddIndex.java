package week3.day1.homeassignment;



public class ChangeOddIndex {
public static void main(String[] args) {
	String test = "changeme";
	char[] cha = test.toCharArray();
	for (int i = 0; i < cha.length; i++) { //h,n,e,e
		if (i%2==1) {
		cha[i] = Character.toUpperCase(cha[i]);
		}
	}
	String result = new String(cha);
	System.out.print(result);
}
}
