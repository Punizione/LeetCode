import java.math.*;
public class Test{
	public static void main(String[] args){
		isPalindrome();
	}
	public int divide(int dividend, int divisor) {
		if(divisor==0){
			return Integer.MAX_VALUE;
		}
		BigDecimal num = new BigDecimal(dividend);
		int a;
		try{
			a = num.divide(new BigDecimal(divisor),BigDecimal.ROUND_DOWN).intValueExact();
		}catch(Exception e){
			a = Integer.MAX_VALUE;
		}
		return a;
	}
}