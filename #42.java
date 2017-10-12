import java.util.*;
public class Test{
	public static void main(String[] args){
		isPalindrome();
	}
	public int trap(int[] height) {
		if(height.length==0){
			return 0;
		}
		int maxi = 0;
		int max = height[0];
		for(int i=0;i<height.length;i++){
			if(height[i]>max){
				max = height[i];
				maxi = i;
			}
		}
		
		int sum = 0;
		max = height[0];
		for(int i=0;i<maxi;i++){
			if(height[i]>max){
				max = height[i];
			}else{
				sum = sum+(max-height[i]);
			}
		}
		max = height[height.length-1];
		for(int i=height.length-1;i>maxi;i--){
			if(height[i]>max){
				max = height[i];
			}else{
				sum = sum+(max-height[i]);
			}
		}
		return sum;
	}
}