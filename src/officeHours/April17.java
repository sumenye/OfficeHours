package officeHours;

public class April17 {

	public static void main(String[] args) {
		int[] nums = new int[] {-21, 2, 3, 4, 54, 65, 56};
		System.out.println(nums[6]);
		System.out.println(nums[nums.length-1]);	
		int max = nums[0];
		int min = nums[0];
		for(int i = 0; i < nums.length; i++) {
			if(max<nums[i]) {
				max = nums[i];
			}
			if(nums[i]<min) {
				min = nums[i];
			}
		}
		System.out.println("Max: "+max);
		System.out.println("Min: "+min);
		
		int[][] nums2 = new int[][] {{1, 2, 3, 4, 54, 65, 56, 897},
									{1324, 223, 32, 4},
									{89, 1324, 2232, 2, 254},
									{1324, -4223, 32, -34}};
		
		min = nums2[0][0];
		max = nums2[0][0];
		System.out.println("*********");						
//		outer loop						
		for(int i = 0; i < nums2.length; i++) {
//			inner loop
			for(int j =0; j < nums2[i].length;j++) {
				if(max<nums2[i][j]) {
					max = nums2[i][j];
				}
				if(nums2[i][j]<min) {
					min = nums2[i][j];
				}
			}
		}							
		System.out.println("Max: "+max);
		System.out.println("Min: "+min);
	}

}
