import java.util.*;
public class Test{
	public static void main(String[] args){
		isSubsequence("abc","ahbgdc");
	}
	public String[] findWords(String[] words) {
		return Stream.of(words).filter(s -> s.toLowerCase().matches("[qwertyuiop]*|[asdfghjkl]*|[zxcvbnm]*")).toArray(String[]::new);
	}
}