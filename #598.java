import java.util.*;
public class Test{
	public static void main(String[] args){
		isSubsequence("abc","ahbgdc");
	}
	public int maxCount(int m, int n, int[][] ops) {
		if(ops.length<1){
			return m*n;
		}
		int minX = ops[0][0];
		int minY = ops[0][1];
		for(int[] pos:ops){
			if(pos[0]!=0&&pos[1]!=0){
				if(minX > pos[0]){
					minX = pos[0];
				}
				if(minY > pos[1]){
					minY = pos[1];
				}
			}
		}
		if(minX > m){
			minX = m;
		}
		if(minY > n){
			minY = n;
		}
		return minX*minY;
	}
}