import java.util.*;
public class Test{
	public static void main(String[] args){
		isSubsequence("abc","ahbgdc");
	}
	public boolean isIsomorphic(String s, String t) {
		char[] arr1 = s.toCharArray();
		char[] arr2 = t.toCharArray();
		Map<Character,Character> map = new HashMap<Character,Character>();
		for(int i=0;i<arr1.length;i++){
			if(map.containsKey(arr1[i])){
				if(map.get(arr1[i])==arr2[i]){
					continue;
				}else{
					return false;
				}
			}else{
				if(!map.containsValue(arr2[i])){
					map.put(arr1[i],arr2[i]);
				}else{
					return false;
				}
			}
		}
		return true;
	}
}