package aa;

public class SelectionSorting {

	public static void main(String[] args) {
		int A[]= {25,10,6,23,1,2};
		
		for(int i=0;i<A.length-1;i++) {
			int min=i;
			for(int j=i+1;j<A.length;j++) {
				if(A[j]<A[min]) {
					min=j;
				}
			}
				int temp=A[min];
				A[min]=A[i];
				A[i]=temp;
			}
		
		 for(int i=0;i<A.length;i++) {
		    	System.out.println(A[i]);
		    }
	}

}
