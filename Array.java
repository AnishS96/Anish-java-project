package aa;

import java.util.Arrays;

public class Array {
	public static void main(String[] args) {
		int[][] arr = {
        {2, 1, 3},
        {5, 4, 6},
        {8, 7, 9} 
        };

for (int k = 0; k<arr.length; k++) {
 for (int i= 0; i < arr[k].length; i++) {
 for (int j = 0; j < arr[k].length; j++) {
      if (arr[k][i] < arr[k][j]) {
              int temp = arr[k][i];
              arr[k][i] = arr[k][j];
              arr[k][j] = temp;
              System.out.println(Arrays.deepToString(arr));
            
            }
            }
	        }
	        }
            }


}
