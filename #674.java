import java.util.*;
public class Test{
	public static void main(String[] args){
		System.out.println(canConstruct("aa","aab"));
	}
	public int findLengthOfLCIS(int[] nums) {
		if(nums.length==0){
			return 0;
		}
		if(nums.length==1){
			return 1;
		}
		int max = 1;
		int nowmax = 1;
		int now = nums[0];
		for(int i=1;i<nums.length;i++){
			if(nums[i]>now){
				nowmax++;
				max = max < nowmax?nowmax:max;
			}else if(nums[i]==now){
				nowmax = 1;
			}else{
				nowmax = 1;
			}
			now = nums[i];
		}
		return max;
	}
}