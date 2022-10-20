package aa;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class DemoList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<String> s=new LinkedList<>(); 
   s.add(null);
   s.add("List");
   s.add("Stack");
  
   s.forEach(System.out::println);
	   s.add(3,"none");
	   s.remove(1);
	   System.out.println(s);
  Iterator<String> it=s.iterator();
   while(it.hasNext()) {
	   System.out.println(it.next());
   }
	   
   }
	}


