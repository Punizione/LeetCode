import java.util.*;
public class Test{
	public static void main(String[] args){
	//	System.out.println(isPalindrome("aacecaa"));
		System.out.println(arrangeCoins(8));
	}

	public boolean isPalindrome(String s) {
		int left = 0,right = s.length()-1;
		while(left < right){

			if(!isValid(s.charAt(left))){
				left++;
				
			}else if(!isValid(s.charAt(right))){
				right--;
				
			}else{
				if( s.charAt(left) == s.charAt(right)){
					left++;
					right--;
				}else if(isChar(s.charAt(left)) && isChar(s.charAt(right))){
					if((s.charAt(left)+32==s.charAt(right)) || (s.charAt(left)-32==s.charAt(right))){
						left++;
						right--;
					}else{
						return false;
					}
				}else{
					return false;
				}
			}
			
		}
		return true;
	}


	public boolean isValid(char c){
		return (c>=48 && c<=57) || (c>=65 && c<=90) || (c>=97 && c<=122);
	}

	public boolean isChar(char c){
		return (c>=65 && c<=90) || (c>=97 && c<=122);
	}
}