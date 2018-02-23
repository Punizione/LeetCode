import java.util.*;
public class Test{
	public static void main(String[] args){
	//	System.out.println(isPalindrome("aacecaa"));
		System.out.println(arrangeCoins(8));
	}

	public int[] constructRectangle(int area) {
		double s = Math.sqrt(area);
		int w = (int)s;
		if(w * w==area){
			return new int[]{w,w};
		}
		int l = (int)(s+1);
		while(l*w!=area){
			if(l*w>area){
				w--;
			}else{
				l++;
			}
		}
		return new int[]{l,w};
	}

}