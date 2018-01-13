import java.util.*;
public class Test{
	public static void main(String[] args){
		System.out.println(canConstruct("aa","aab"));
	}
	public String convertToTitle(int n) {
		StringBuilder result = new StringBuilder();
		while(n>0){
			n--;
			result.insert(0, (char)('A' + n % 26));
			n /= 26;
		}
		return result.toString();
	}
}