import java.util.*;
public class Test{
	public static void main(String[] args){
		isSubsequence("abc","ahbgdc");
	}
	public int majorityElement(int[] nums) {
		int marjor = nums[0];
		int count = 1;
		for(int i=1;i<nums.length;i++){
			if(count==0){
				count++;
				marjor = nums[i];
			}else if(marjor==nums[i]){
				count++;
			}else{
				count--;
			}
		}
		return marjor;
	}
}