import java.util.*;
public class Test{
	public static void main(String[] args){
		System.out.println(rangeBitwiseAnd(5,7));
	}
	public static int rangeBitwiseAnd(int m, int n) {
		if(m==0){
			return 0;
		}
		int x = n;
		while(x>m){
			x = x&(x-1);
		}
		return x;
	}
		
}