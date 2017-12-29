import java.util.*;
public class Test{
	public static void main(String[] args){
		isSubsequence("abc","ahbgdc");
	}
    public int lengthOfLastWord(String s) {
    	if(s.length()<1){
    		return 0;
    	}
    	String[] arr = s.split(" ");
    	if(arr.length<1){
    		return 0;
    	}
        return arr[arr.length-1].length();
    }
}