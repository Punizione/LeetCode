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
	    int[] result = new int[2];
	    Map<Integer, Integer> map = new HashMap<Integer, Integer>();
	    for (int i = 0; i < nums.length; i++) {
	        if (map.containsKey(target - nums[i])) {
	            result[1] = i ;
	            result[0] = map.get(target - nums[i]);
	            return result;
	        }
	        map.put(nums[i], i );
	    }
	    return result;
	}
}