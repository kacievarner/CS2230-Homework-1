//fa19
import java.util.Arrays;

class ZeroLast {

	public static void main(String[] args) {
		int[] a1 = {-1, -2, -2, 4}; // input
		int[] a1_exp = {-1, -2, -2, 4}; // expected contents of a1 after calling zero_last
		zero_last(a1);
		if (!Arrays.equals(a1, a1_exp)) {
			System.out.println("FAILED TEST 1");
			System.exit(1);
		}

		int[] a2 = {0, 4, 3, 2, 1};
		int[] a2_exp = {4, 3, 2, 1, 0};
		zero_last(a2);
		if (!Arrays.equals(a2, a2_exp)) {
			System.out.println("FAILED TEST 2");
			System.exit(1);
		}

		int[] a3 = {5, -1, 10, 0, 11, 0};
		int[] a3_exp = {5, -1, 10, 11, 0, 0};
		zero_last(a3);
		if (!Arrays.equals(a3, a3_exp)) {
			System.out.println("FAILED TEST 3");
			System.exit(1);
		}

		int[] a4 = {0, 0, -4, 5, -6, 7, 0, 4, 3};
		int[] a4_exp = {-4, 5, -6, 7, 4, 3, 0, 0, 0};
		zero_last(a4);
		if (!Arrays.equals(a4, a4_exp)) {
			System.out.println("FAILED TEST 4");
			System.exit(1);
		}

		int[] a5 = {1, 0, 0};
		int[] a5_exp = {1, 0, 0};
		zero_last(a5);
		if (!Arrays.equals(a5, a5_exp)) {
			System.out.println("FAILED TEST 5");
			System.exit(1);
		}

		int[] a6 = {0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0};
		int[] a6_exp = {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		zero_last(a6);
		if (!Arrays.equals(a6, a6_exp)) {
			System.out.println("FAILED TEST 6");
			System.exit(1);
		}
		int[] a7 = {};
		int[] a7_exp = {};
		zero_last(a7);
		if (!Arrays.equals(a7, a7_exp)) {
			System.out.println("FAILED TEST 7");
			System.exit(1);
		}
				
				/* We will test your code on additional test
				cases, so make sure it really works. (e.g., you can
				add more of your own test cases, just copy one of the
				above ones and modify it).
				*/

		System.out.println("Tests pass for zero_last");
	}

	public static void zero_last(int[] arr) {
		int count = 0;
		int arrLength = arr.length;
		for (int i = 0; i < arrLength; i++) {
			if (arr[i] != 0)
				arr[count++] = arr[i];
		}
		for (int i = count; i < arrLength; i++){
			arr[i] = 0;
		}
	}
}

