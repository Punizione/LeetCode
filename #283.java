import java.util.*;
public class Test{
	public static void main(String[] args){
		isSubsequence("abc","ahbgdc");
	}
	public void moveZeroes(int[] nums) {
		int slow = 0;
		int fast = 0;
		int tmp;
		for(;fast<nums.length;fast++){
			if(nums[fast]!=0){
				tmp = nums[slow];
				nums[slow] = nums[fast];
				nums[fast] = tmp;
				slow++;
			}
		}
	}
}