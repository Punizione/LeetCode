import java.util.*;
public class Test{
	public static void main(String[] args){
	//	System.out.println(isPalindrome("aacecaa"));
		System.out.println(reverseWords("I am happy"));
	}
	public int[] twoSum(int[] numbers, int target) {
		int left = 0,right = numbers.length-1;
		int[] ret = new int[2];
		while(left<right){
			if(numbers[left]+numbers[right] < target){
				left++;
			}else if(numbers[left]+numbers[right] > target){
				right--;
			}else{
				ret[0] = left+1;
				ret[1] = right+1;
				break;
			}
		}
		return ret;
	}
}