package normal;

//This logic is for finding sum of 8 by combining array elements.

public class Combination {

	public static int SIZE = 0;
	public static int[] input = { 1, 2, 3, 4, 5 };

	public static int sumToFind = 8;
	public static int ans1 = 0;
	public static int ans2 = 0;

	public static void main(String[] args) {
		SIZE = input.length;
		findCombinationIncludingOnlyOnce(0, 0);
		findCombinationIncludingRepeat(0, 0);
		System.out.println(ans1);
		System.out.println(ans2);

	}

	// Each item should be selected once.
	public static void findCombinationIncludingOnlyOnce(int index, int targetSum) {

		if (targetSum == sumToFind) {
			// it will return total number of counts for array elements whose
			// sum is equal to sumToFind.
			ans1++;
			return;
		}
		if (index >= SIZE) {
			return;
		}
		if (targetSum > sumToFind) {
			return;
		}

		// This recursion is needed without including next element.
		findCombinationIncludingOnlyOnce(index + 1, targetSum);

		// This recursion is for with including h next element.
		findCombinationIncludingOnlyOnce(index + 1, targetSum + input[index]);
	}

	// Array Elements will be included multiple times
	public static void findCombinationIncludingRepeat(int index, int targetSum) {

		if (targetSum == sumToFind) {
			// it will return total number of counts for array elements whose
			// sum is equal to sumToFind.
			ans2++;
			return;
		}
		if (index >= SIZE) {
			return;
		}
		if (targetSum > sumToFind) {
			return;
		}

		// Here i is needed to make sure that each element is included at least
		// i times.
		int i = 0;

		// Run Loop until targetSum is less than sumToFind
		while (input[index] * i + targetSum <= sumToFind) {
			findCombinationIncludingRepeat(index + 1, targetSum + input[index] * i);
			i++;
		}
	}

}
