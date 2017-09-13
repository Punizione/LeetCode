import java.util.*;
public class Test{
	public static void main(String[] args){
		System.out.println(missingNumber(new int[]{0,1,3}));
	}
	public static int missingNumber(int[] nums) {
		int sum = ((nums.length+1)*nums.length)/2;
		int rSum = 0;
		for(int i=0;i<nums.length;i++){
			rSum+=nums[i];
		}
		return sum-rSum;
	}
		
}