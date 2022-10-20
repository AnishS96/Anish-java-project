package aa;

import java.util.Arrays;

public class InsertionSort {
	public static void main(String[] args) {
		int A[]= {20,10,7,1,4,5};
		for(int i=0;i<A.length;i++) {
			for(int j=i+1;j>0;j--) {
				if(A[i]<A[j]){
					int temp=A[i];
					A[i]=A[j];
					A[j]=temp;
					}
				}
			System.out.println(Arrays.toString(A));
		}
		 
	}

}
