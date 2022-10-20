package aa;

public class ArrayMaxAndMin {

	public static void main(String[] args) {
		
			int[][] array = {{1,4,5,7},{3,0,4,2}};
			int max= array[0][0];
			int min= array[0][0];
			for(int i=0;i<array.length;i++) {
				for(int j=0;j<array[i].length;j++) {
					if(array[i][j]<max) {
						max=array[i][j];
					}
					else if(array[i][j]>min) {
						min=array[i][j];
					}
				
					}
				}
			System.out.println("maximum number = "+max);
			System.out.println("maximum number = "+min);
			}
	}


