import java.util.*;
public class Test{
	public static void main(String[] args){
	//	System.out.println(isPalindrome("aacecaa"));
		System.out.println(arrangeCoins(8));
	}

	public boolean checkValidString(String s) {
		int low = 0;
		int high = 0;
		char[] arr = s.toCharArray();
		for(char ch:arr){
			if(ch=='('){
				low++;
				high++;
			}else if(ch==')'){
				low--;
				high--;		
			}else{
				low--;
				high++;
			}
			if(high < 0){
				break;
			}
			low = Math.max(lo,0);
		}
		return low == 0;

	}
}