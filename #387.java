import java.util.*;
public class Test{
	public static void main(String[] args){
		isSubsequence("abc","ahbgdc");
	}
	public int firstUniqChar(String s) {
		Map<Character,Integer> map = new HashMap<>();
		for(int i=0;i<s.length();i++){
			if(map.containsKey(s.charAt(i))){
				map.put(s.charAt(i),map.get(s.charAt(i))+1);
			}else{
				map.put(s.charAt(i),1);
			}
		}
		int res = -1;
		for(int i=0;i<s.length();i++){
			if(map.get(s.charAt(i))==1){
				res = i;
				break;
			}
		}
		return res;
	}
}