import java.util.*;
public class Test{
	public static void main(String[] args){
		isSubsequence("abc","ahbgdc");
	}
	public int countSegments(String s) {
		if(s==null||s.equals("")){
			return 0;
		}
		String[] arr = s.split(" ");
		int sum = 0;
		for(String tmp:arr){
			if(!tmp.equals("")){
				sum++;
			}
		}
		return sum;
	}
}
