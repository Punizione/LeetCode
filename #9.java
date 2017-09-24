import java.util.*;
public class Test{
	public static void main(String[] args){
		System.out.println(isPalindrome(100101000));
	}
	public static boolean isPalindrome(int x) {
		char[] arr = new Integer(x).toString().toCharArray();
		for(int i=0;i<arr.length/2;i++){
			if(arr[i]!=arr[arr.length-1-i]){
				return false;
			}
		}
		return true;
	}
}