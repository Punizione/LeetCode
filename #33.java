import java.util.*;
public class Test{
	public static void main(String[] args){
		System.out.println(isPalindrome(100101000));
	}
	public int search(int[] nums, int target) {
		int lo = 0,hi = nums.length;
		while(lo<hi){
			int mid = (lo+hi)/2;
			int num = (nums[mid]<nums[0])==(target<nums[0])?nums[mid]:(target<nums[0]?Integer.MIN_VALUE:Integer.MAX_VALUE);
			if(num <target){
				lo = mid+1;
			}else if(num>target){
				hi = mid;
			}else{
				return mid;
			}
		}
		return -1;
	}
}