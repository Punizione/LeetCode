import java.util.*;
public class Test{
	public static void main(String[] args){
	//	System.out.println(isPalindrome("aacecaa"));
		System.out.println(shortestPalindrome("abcd"));
	}
	public int maximumProduct(int[] nums) {
		Arrays.sort(nums);
		int s = nums[nums.length-1]*nums[nums.length-2]*nums[nums.length-3];
		int s1 = nums[0]*nums[1]*nums[num.length-1];
		return s>s1?s:s1;
	}
}