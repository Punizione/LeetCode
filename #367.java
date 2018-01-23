import java.util.*;
public class Test{
	public static void main(String[] args){
	//	System.out.println(isPalindrome("aacecaa"));
		System.out.println(reverseWords("I am happy"));
	}
	public boolean isPerfectSquare(int num) {
		long r = num;
		while (r*r > num)
			r = (r + num/r) / 2;
		return r*r == num;
	}

}