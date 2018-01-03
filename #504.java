import java.util.*;
public class Test{
	public static void main(String[] args){
		System.out.println(canConstruct("aa","aab"));
	}
	public String convertToBase7(int num) {
		if (num < 0)
			return '-' + convertToBase7(-num);
		if (num < 7)
			return num + "";
		return convertToBase7(num / 7) + num % 7;   
	}
}