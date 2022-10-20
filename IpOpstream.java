package aa;


import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;

public class IpOpstream {
	public static void main(String[] args) {
try {
	File f=new File("E:\\New folder\\Sample.txt");
	FileInputStream fi=new 	FileInputStream(f);
	DataInputStream dt=new DataInputStream(fi);

	int count =fi.available();
	System.out.println(count);
	byte b[]=new byte[count];
	dt.read(b);  
	for(byte s:b) {
		char c=(char)s;
		System.out.print(c);
	}
	
		
}

catch(Exception e){
	System.out.println(e);
}
}
}