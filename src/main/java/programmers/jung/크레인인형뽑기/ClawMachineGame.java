package 크레인인형뽑기;

import java.util.*;

public class ClawMachineGame {
	
    int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack stack = new Stack<>();
       
        for(Integer move : moves) {
        	for(int i = 0; i < board.length; i++) {
        		int k = board[i][move-1];
        		
        		// 집은 곳이 0일 경우 더 내려가야함.
        		if(k == 0) {
        			continue;
        		}else {
        			// k를 벡터에 넣기 전에 k가 이미 전차례에 들어갔을 경우 넣지않고 들어가있는 k 삭제        			
        			if(!stack.empty() && (int)stack.peek()==k) {
        				stack.pop();
        				answer = answer+2;
        			}else {
        				stack.push(k);
        			}
        			
        			// 참고 : https://sas-study.tistory.com/340
            		board[i][move-1] = 0;
                    break;
        		}
        	}
        }
        return answer;
    }
	
}
