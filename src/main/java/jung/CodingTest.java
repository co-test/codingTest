package main.java.jung;

import java.util.Arrays;

public class CodingTest {

	public static void main(String[] args) {
		
		int n = 10;
		int[] lost = {9,10};
		int[] reserve = {1,9};
		
		System.out.println("체육수업을 들을 수 있는 학생의 최댓값 : " + solution(n, lost, reserve));
		
	}

	/*
	 	[문제설명]
		전체 학생의 수 n, 체육복을 도난당한 학생들의 번호가 담긴 배열 lost, 
		여벌의 체육복을 가져온 학생들의 번호가 담긴 배열 reserve가 매개변수로 주어질 때, 
		체육수업을 들을 수 있는 학생의 최댓값을 return 하도록 solution 함수를 작성해주세요.
		
		[제한사항]
		전체 학생의 수는 2명 이상 30명 이하입니다.
		체육복을 도난당한 학생의 수는 1명 이상 n명 이하이고 중복되는 번호는 없습니다.
		여벌의 체육복을 가져온 학생의 수는 1명 이상 n명 이하이고 중복되는 번호는 없습니다.
		여벌 체육복이 있는 학생만 다른 학생에게 체육복을 빌려줄 수 있습니다.
		여벌 체육복을 가져온 학생이 체육복을 도난당했을 수 있습니다. 
		이때 이 학생은 체육복을 하나만 도난당했다고 가정하며, 남은 체육복이 하나이기에 다른 학생에게는 체육복을 빌려줄 수 없습니다.
	*/
	
	private static int solution(int n, int[] lost, int[] reserve) {
		
		int maxNum = 0;
		int[] student = new int [n];
		
		System.out.println(Arrays.toString(student));
		 
		// 학생들 +1
		for(int i= 0; i < n; i++){
			student[i] = 1;
		}
		
		System.out.println(Arrays.toString(student));
		
		// 여벌옷 가진 사람 +
		for(int reserveInt : reserve){
			student[reserveInt-1]++;
		}
		
		System.out.println(Arrays.toString(student));
		
		// 도난 당한 사람 -
		for(int lostInt : lost){
			if(student[lostInt-1] == 1 || student[lostInt-1] == 2){
				student[lostInt-1]--;
			}
		}
		
		System.out.println(Arrays.toString(student));
		
		// 옷이 없는 사람에게 옷 나눠주기
		for(int num = 0; num < student.length; num++){
			
			if(student[num] == 0){
				
				if(num != 0 && student[num-1] == 2){
					student[num]++;
					student[num-1]--;
					maxNum++;
				}else if(num != student.length-1 && student[num+1] == 2){
					student[num]++;
					student[num+1]--;
					maxNum++;
				}
				
			}else{
				maxNum++;
			}
			
		}
		
		System.out.println(Arrays.toString(student));
		
		return maxNum;
		
	}	
	
}
