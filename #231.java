import java.util.*;
public class Test{
	public static void main(String[] args){
		System.out.println(isPowerOfTwo(6));
	}
	public static boolean isPowerOfTwo(int n) {
		if(n==0){
			return false;
		}
		while(n%2==0){
			n/=2;
		}
		return n==1?true:false;
	}
		
}