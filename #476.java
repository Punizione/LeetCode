import java.util.*;
public class Test{
	public static void main(String[] args){
		System.out.println(findComplement(5));
	}
	public static int findComplement(int num) {
		char[] sb = (Integer.toBinaryString(num)).toCharArray();

		for(int i=0;i<sb.length;i++){
			sb[i]=(sb[i]=='0'?'1':'0');
		}
		return Integer.valueOf(String.valueOf(sb),2);
	}
		
}