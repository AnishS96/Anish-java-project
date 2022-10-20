package aa;

import java.util.Arrays;

public class MergeSort {
	        void merge(int lb,int mid,int ub,int A[],int B[]) {
	        	int i=lb;
	        	int j=mid+1;
	        	int k=lb;
	        	while(i<=mid && j<=ub) {
	        		if(A[i]<A[j]) {
	        			B[k]=A[i];
	        			k++;
	        			i++;
	        			
	        		}
	        		else {
	        			B[k]=A[j];
	        			k++;
	        			j++;
	        		}
	        		
	        	}
	        	while(i<=mid) {
	        		B[k]=A[i];
	        		k++;
	        		i++;
	        		}
	        	while(j<=ub) {
	        			B[k]=A[j];
	        			k++;
	        			j++;
	        	}
	        	for(k=lb;k<=ub;k++) {
	        		A[k]=B[k];
	        		System.out.println(k);
	        	}
	        }
	        void mergeSort(int lb,int ub,int[]A) {
	        	if(lb<ub) {
	        		int mid=(lb+ub)/2;
	        		mergeSort(lb,mid,A);
	        		mergeSort(mid+1,ub,A);
	        		int len=A.length;
	        		int x=mid+1;
	        		int y=len-(mid+1);
	        		int z=x+y;
	        		int B[]=new int[z];
	        		merge(lb,mid,ub,A,B);
	        	}
	        }
	        public static void main(String[] args) {
				MergeSort m=new MergeSort();
				int A[]= {19,1,3,2,15,20};
				int a=0;
				int b=A.length-1;
				m.mergeSort(a, b, A);
				for (int i = 0; i < A.length; i++) {
					System.out.println(Arrays.toString(A));
					
				}
			}
	        

}
