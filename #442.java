import java.util.*;
public class Test{
	public static void main(String[] args){
		System.out.println(detectCapitalUse("GGGa"));
	}
	public List<Integer> findDuplicates(int[] nums) {
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		for(int i=0;i<nums.length;i++){
			if(map.get(nums[i])==null){
				map.put(nums[i],1);
			}else{
				map.replace(nums[i],map.get(nums[i])+1);
			}
		}
		List<Integer> li = new ArrayList<Integer>();
		Iterator iter = map.entrySet().iterator();
		while(iter.hasNext()){
			Map.Entry entry = (Map.Entry) iter.next();
			Integer k = (Integer)entry.getKey();
			Integer v = (Integer)entry.getValue();
			if(v==2){
				li.add(k);
			}
		}
		return li;
	}
		
}