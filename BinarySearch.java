package aa;

import java.util.Arrays;

public class BinarySearch {
public static void main(String[] args) {
	int arr[]= {1,2,3,4,5,6,7,8};
	int index=-1;
	System.out.println("array "+Arrays.toString(arr));
	int a=7;
	System.out.println("the element to be found "+" "+a);
	int first=0;
	int last=arr.length-1;
	int mid=(first+last)/2;
	while(first<=last) {
		if(arr[mid]==a) {
			index=mid;
			System.out.println("element is at index "+" "+index);
			break;
		}
		else if(arr[mid]<a) {
			first=mid+1;
		}
		else if(arr[mid]>a){
			last=mid-1;
		}
		mid=(first+last)/2;
	}
	if(first>last) {
		System.out.println("element not found");
	}
}
}
