package aa;

public class OccurenceOfNumberinArray {
	static int max(int a[]) {
		int max=a[0];
	for (int i = 1; i < a.length; i++) {
		int k=a[i];
		if(k>max) {
			max=k;
		}
	}
	return max;
		
	}
	static int min(int a[]) {
		int min=a[0];
	for (int i = 1; i < a.length; i++) {
		int k=a[i];
		if(k<min) {
			min=k;
		}
	}
	return min;
		
	}
	static void Occurance(int b[],int a[]) {
		for(int i=0;i<b.length;i++) {
			b[i]=0;
			
		}
		for(int j=0;j<a.length;j++) {
			int k=a[j];
			b[k]++;
		}
		for(int z=0;z<b.length;z++) {
			int y=b[z];
			if(y!=0) {
				System.out.println(z+" "+"is occuring "+y+" "+"times");
			}
		}
	}
	
	public static void main(String[] args) {
		int count=0;
		int sum=0;
		int a[]= {8,4,7,9,4,8,7,1,10};
		int cb=max(a);
		int b[]=new int[cb+1];
		Occurance(b,a);
		int vc=min(a);
		for (int i = 0; i < a.length; i++) {
			 sum= sum+a[i];
			count++;
			
		}
	 int avg=sum/count;
		System.out.println("minimum = "+vc);
		System.out.println("maximum = "+cb);
		System.out.println("average = "+avg);
		//System.out.println("Sum = "+sum);
	}

}
