import java.util.*;
public class Test{
	public static void main(String[] args){
		isSubsequence("abc","ahbgdc");
	}
	public int arrayPairSum(int[] nums) {
		nums = Arrays.sort(nums);
		int sum=0;
		for(int i=0;i<nums.length;i+=2){
			sum+=nums[i];
		}
		return sum;
	}
}