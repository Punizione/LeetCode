import java.util.*;
public class Test{
	public static void main(String[] args){
		System.out.println(reverse(-123));
	}
	public static int reverse(int x) {
		Integer i;
		boolean flag = false;
		if(x>=0){
			i = new Integer(x);
		}else{
			flag = true;
			i = new Integer(-x);
		}
		StringBuilder sb = new StringBuilder(i.toString());
		String a = sb.reverse().toString();
		if(flag){
			a = "-"+a;
		}
		int j =0;
		try{
			j = Integer.parseInt(a);
		}catch(Exception e){
			return j;
		}
		return j;
		
	}


}