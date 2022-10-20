package aa;

import java.util.LinkedHashSet;
import java.util.Set;

public class StringOccurence {
	static public void duplicate(String st) {
		Set<Character> s=new LinkedHashSet<Character>();
		for(int i=0;i<st.length();i++) {
			s.add(st.charAt(i));
					}
		for(Character c:s) {
			System.out.print( c.toString());
			}
			}
	public static void main(String[] args) {
	 String st="abccbdabbc";
	  duplicate(st);
				
	}
}
