import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
public class Test {
	public static void main(String[] args){
		int[] nums = new int[]{3,2,4};
		int target = 6;
		twoSum(nums,target);
	}
    public static int[] twoSum(int[] nums, int target) {
		for(int i=0;i<nums.length;i++){
			for(int j=0;j<nums.length;j++){
                if(i!=j){
                    if(nums[i]+nums[j]==target){
                        return new int[]{i,j};
                    }
                }
			}
		}
        return null;
    }
}