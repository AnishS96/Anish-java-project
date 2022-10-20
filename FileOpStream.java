package aa;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;

public class FileOpStream {
	public static void main(String[] args) {
		try {
		String s="arunanish1234";
		File f=new File("E:\\New folder\\Sample.txt");
		FileOutputStream fo=new FileOutputStream(f);
		DataOutputStream fr=new DataOutputStream(fo);
		fr.write(s.getBytes());
		fr.close();
		System.out.println("sucess..");
		
	}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
