package leetcode;

public class containsDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {1,2,3,1,2,3};
		int  k = 2;
		System.out.println(containsNearbyDuplicate(nums,k));
	}

	public static boolean containsNearbyDuplicate(int[] nums, int k) {
		boolean result = false;
		for(int i=0;i<nums.length;i++) {
			for(int j=i+1;j<nums.length;j++) {
				if(nums[i]==nums[j] && (Math.abs(i-j)) <= k) {
					return true;
				}
			}
		}
		return result;
    }
}
