import java.util.*;
public class Test{
	public static void main(String[] args){
		isSubsequence("abc","ahbgdc");
	}
	public static boolean isSubsequence(String s, String t) {
		char[] arr = t.toCharArray();
		char[] arr1 = s.toCharArray();

		int indexNow = 0;
		int index = indexNow;
		while(index<arr.length&&indexNow<arr1.length){
			System.out.println(arr[index]+" "+arr1[indexNow]);
			if(arr[index]!=arr1[indexNow]){
				index++;
			}else{
				index++;
				indexNow++;
			}
		}
		if(indexNow==arr1.length){
			return true;
		}
		return false;

	}
}