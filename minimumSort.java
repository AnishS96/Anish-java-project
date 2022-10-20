package aa;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Properties;

public class minimumSort {
	public static void main(String[] args) throws IOException {
		
			Properties p=new Properties();
			p.setProperty("name", "kalees");
			p.store(new FileWriter("welcome.txt"), "ATM");

		}
	}

