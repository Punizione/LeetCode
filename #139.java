import java.util.*;
public class Test{
	public static void main(String[] args){
		System.out.println(divide(1,-1));
	}
	public boolean wordBreak(String s, List<String> wordDict) {
		if (null == s || "".equals(s)){
			return true;
		}  
		boolean[] canBreak = new boolean[s.length()];  
		canBreak[0] = wordDict.contains(s.substring(0,1));  
		for(int i=1; i<s.length(); i++) {  
			if (wordDict.contains(s.substring(0, i+1))) {  
				canBreak[i] = true;  
			} else {  
				for(int j=0; j<i; j++) {  
					if (canBreak[j] && wordDict.contains(s.substring(j+1, i+1))) {  
						canBreak[i] = true;  
						break;  
					}  
				}  
			}  
		}  
		return canBreak[canBreak.length-1];  
	}		
}