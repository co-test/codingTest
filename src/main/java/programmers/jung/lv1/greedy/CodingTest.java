package main.java.programmers.jung.lv1.greedy;

public class CodingTest {
	
	private int solution(int n, int[] lost, int[] reserve) {
		
		int answer = 0;
		int[] student = new int [n];			
		int students = student.length;
		 
		// 1. 학생들에게 체육복을 한벌씩 준다.
		for(int i= 0; i < n; i++){
			student[i] = 1;
		}
		
		// 2. 여벌옷을 가진 학생 체육복 +1
		for(int reserveInt : reserve){
			student[reserveInt-1]++;
		}
		
		// 3. 도난당한 학생 체육복 -1
		for(int lostInt : lost){
			
			int clothes = student[lostInt-1];
			
			if(clothes == 1 || clothes == 2){
				student[lostInt-1]--;
			}
		}
		
		// 4. 체육복이 없는 학생 옷빌리기
		// 체육복이 2벌인 학생에게만 빌릴 수 있고 앞번호에게 먼저 빌린다.
		for(int num = 0; num < students; num++){
			
			if(student[num] == 0){
				
				if(num != 0 && student[num-1] == 2){
					student[num]++;
					student[num-1]--;
					answer++;
				}else if(num != students-1 && student[num+1] == 2){
					student[num]++;
					student[num+1]--;
					answer++;
				}
				
			}else{
				answer++;
			}
			
		}
		
		return answer;
		
	}	
	
}