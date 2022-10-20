package aa;

public class BUbbleSorting {
	public static void main(String[] args) {
		int A[] = { 10, 5, 3, 4, 1 };
		int b = A.length - 1;
		for (int i = 0; i < b; i++) {
			for (int j = 0; j < b - i; j++) {
				if (A[j] > A[j + 1]) {
					int temp = A[j];
					A[j] = A[j + 1];
					A[j + 1] = temp;
				}
			}
		}
		for (int i = 0; i < A.length; i++) {
			System.out.println(A[i]);
		}
	}

}
