package aa;

import aa.Multipl;
import aa.Subtract;
import aa.Att;
import aa.Threading;

public class Aot {

	public static void main(String[] args) {

		Subtract s1 = new Subtract();
		Multipl s2 = new Multipl();
		Threading s3 = new Threading();
		Att s = new Att();
		s.setPriority(1);
		s1.setPriority(3);
		s2.setPriority(4);
		s3.setPriority(2);

		System.out.println(
				"get priority of add :" + s.getPriority() + "\n" + "get priority of multipl :" + s2.getPriority());
		System.out.println(
				"get priority of subtract :" + s1.getPriority() + "\n" + "get priority of Div :" + s3.getPriority());
		s.start();
		s1.start();
		s2.start();
		s3.start();

		System.out.println(
				"get priority of add :" + s.getPriority() + "\n" + "get priority of multipl :" + s2.getPriority());
		System.out.println(
				"get priority of subtract :" + s1.getPriority() + "\n" + "get priority of Div :" + s3.getPriority());
	}
}
