package aa;

public class ExceptionHandling {

	public static void main(String[] args) {
		try {
			String st=null;
			System.out.println(st.length());
		}
catch(NullPointerException e) {
	System.out.println("occurence of exception "+e);
}
	}

}
