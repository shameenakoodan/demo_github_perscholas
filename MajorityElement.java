package leetcode;

import java.util.LinkedHashMap;
import java.util.Map;

public class MajorityElement {
	public static void main(String args[]) {
		int arr[] = {2,2,1,1,1,2,2};
		System.out.println(majorityElement(arr));
	}
	public static int majorityElement(int[] nums) {
        int n = nums.length;
        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
        for(int i=0;i<n;i++)
        {
        	if(map.containsKey(nums[i]))
        		map.put(nums[i], map.get(nums[i])+1);
        	else
        		map.put(nums[i],1);
        }
        for (Map.Entry<Integer, Integer> mapElement :
            map.entrySet()) {
        	Integer key = mapElement.getKey();
        	  
            // Finding the value
            // using getValue() method
            Integer value = mapElement.getValue();
            if(value>n/2)
            	return key;
        }
        return 0;
    }
}
