package aa;

public class Switch {

	public static void main(String args[]) {
		String s = "Spring is beautiful but so is winter,so it considered as is :";
		String s1 = "is";
		String temp[] = s.split(" ");
		int count = 0;
		for (int i = 0; i < temp.length; i++) {
		if (s1.equals(temp[i]))
		count++;
		}
		System.out.println("The string is: " + s);
		System.out.println("String Occurence " +" "+ count);
		}
		}