package 두개뽑아서더하기;

import java.util.*;

public class PickAndAdd {

	class Solution {
	    public int[] solution(int[] numbers) {
	        int[] answer = {};

	        Arrays.sort(numbers);
	        
	        ArrayList<Integer> arrayList = new ArrayList<>();
	        
	        for(int i = 0;i < numbers.length; i++) {
	            for(int j = i; j < numbers.length; j++) {
	            	if(i==j) continue;
	            	if(!arrayList.contains(numbers[i] + numbers[j])) {
	            		arrayList.add(numbers[i] + numbers[j]);
	            	}
	            }
	        }
	        
	        Collections.sort(arrayList);
	        
	        answer = new int[arrayList.size()];
	        int order = 0;
	        
	        for(int i : arrayList) {
	        	answer[order] = i;
	        	order++;
	        }
	        
	        return answer;
	    }
	}
	
	
}
