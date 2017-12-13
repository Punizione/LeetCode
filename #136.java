import java.util.*;
public class Test{
	public static void main(String[] args){
		isSubsequence("abc","ahbgdc");
	}
	public int singleNumber(int[] nums) {
		int res = 0;
		for(int i=0;i<nums.length;i++){
			res ^= nums[i];
		}
		return res;
	}
}