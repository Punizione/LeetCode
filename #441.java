import java.util.*;
public class Test{
	public static void main(String[] args){
	//	System.out.println(isPalindrome("aacecaa"));
		System.out.println(arrangeCoins(8));
	}

	public int arrangeCoins(int n) {
		return (int)((-1 + Math.sqrt(1 + 8 * (long)n)) / 2);
	}


}