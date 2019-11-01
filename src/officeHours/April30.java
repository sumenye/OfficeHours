package officeHours;

public class April30 {

	public static void main(String[] args) {
//		double[] nums2 = { 3.6, 6.2, 78.45 };
//		Arrays.sort(nums);
//		Arrays.sort(nums2);

		int[] nums = { 3, 5, 54, 65 };
		int[] numsToCompare = { 3, 5, 56, 65 };
		// we are calling our method to verify if arrays are equal
		boolean result = compareArrays(nums, numsToCompare);

		System.out.println("Are these arrays are equals? " + (result ? "Yes" : "No"));

		double[] numsDouble = { 3.0, 5.5, 54.54, 65.6 };
		double[] numsToCompareDouble = { 3.0, 5.5, 54.54, 65.6 };

		boolean resultForDouble = compareArrays(numsDouble, numsToCompareDouble);

		System.out.println("Are these arrays of double are the same? " + (resultForDouble ? "Yes" : "No"));

	}
	
	public static boolean compareArrays(int[] arr1, int[] arr2) {
		// we are filtering arrays if they have different amount of elements
		if (arr1.length != arr2.length) {
			return false;
		}
		// since we verified that 2 arrays have same ammount of elements
		// we can specify length of either array
		for (int i = 0; i < arr1.length; i++) {
			System.out.println("Comparing value # " + i + " : " + arr1[i] + " - " + arr2[i]);
			if (arr1[i] != arr2[i]) {
				return false;
			}
		}
		return true;
	}
	//custom method for array of doubles
	//overloaded method that works with doubles and does the same thing
	public static boolean compareArrays(double[] arr1, double[] arr2) {
		// we are filtering arrays if they have different amount of elements
		if (arr1.length != arr2.length) {
			return false;
		}
		// since we verified that 2 arrays have same ammount of elements
		// we can specify length of either array
		for (int i = 0; i < arr1.length; i++) {
			System.out.println("Comparing value # " + i + " : " + arr1[i] + " - " + arr2[i]);
			if (arr1[i] != arr2[i]) {
				return false;
			}
		}
		return true;
	}


}
