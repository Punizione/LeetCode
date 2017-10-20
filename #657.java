import java.util.*;
public class Test{
	public static void main(String[] args){
		isSubsequence("abc","ahbgdc");
	}
	public boolean judgeCircle(String moves) {
		int x=0,y=0;
		char[] arr = moves.toCharArray();
		for(int i=0;i<arr.length;i++){
			if(arr[i]=='U'){
				y++;
			}else if(arr[i]=='D'){
				y--;
			}else if(arr[i]=='R'){
				x++;
			}else if(arr[i]=='L'){
				x--;
			}
		}
		return ((x==0)&&(y==0));
	}
}