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
		for (int i = 0; i < numbers.length; i++) {
			if (map.containsKey(target - numbers[i])) {
				result[1] = i + 1;
				result[0] = map.get(target - numbers[i]);
				return result;
			}
			map.put(numbers[i], i + 1);
		}
		return result;
	}
}