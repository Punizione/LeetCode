import java.util.*;
public class Test{
	public static void main(String[] args){
		isPalindrome();
	}
	public void rotate(int[] nums, int k) {
		int tail,temp;
		for(int i=0;i<k;i++){
			tail = nums[nums.length-1];
			for(int j=0;j<nums.length;j++){
				temp = nums[j];
				nums[j] = tail;
				tail = temp;
			}
		}
	}
}