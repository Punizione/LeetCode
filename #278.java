import java.util.*;
public class Test{
	public static void main(String[] args){
	//	System.out.println(isPalindrome("aacecaa"));
		System.out.println(reverseWords("I am happy"));
	}
	public int firstBadVersion(int n) {
		if(n<3){
			return isBadVersion(1)?1:2;
		}
		int head = 1;
		int tail = n;
		int res = 0;
		while(true){
			res = head+(tail-head)/2;
			if(isBadVersion(res)){
				if(isBadVersion(res-1)){
					tail = res-1;
				}else{
					break;
				}		
			}else{
				head = res+1;
			}
		}
		return res;
	}
}