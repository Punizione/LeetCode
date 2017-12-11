import java.util.*;
public class Test{
	public static void main(String[] args){
		isSubsequence("abc","ahbgdc");
	}
	public int findMaxConsecutiveOnes(int[] nums) {
		int sum = 0;
		int max = sum;
		for(int i=0;i<nums.length;i++){
			if(nums[i]==1){
				sum++;
				if(max<sum){
					max = sum;
				}
			}else{
				sum = 0;
			}
		}
		return max;
	}
}