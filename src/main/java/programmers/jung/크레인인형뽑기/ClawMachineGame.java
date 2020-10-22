package 크레인인형뽑기;

import java.util.*;

/*
게임개발자인 죠르디는 크레인 인형뽑기 기계를 모바일 게임으로 만들려고 합니다.
죠르디는 게임의 재미를 높이기 위해 화면 구성과 규칙을 다음과 같이 게임 로직에 반영하려고 합니다.

게임 화면은 1 x 1 크기의 칸들로 이루어진 N x N 크기의 정사각 격자이며 위쪽에는 크레인이 있고 오른쪽에는 바구니가 있습니다. 
(위 그림은 5 x 5 크기의 예시입니다). 각 격자 칸에는 다양한 인형이 들어 있으며 인형이 없는 칸은 빈칸입니다. 
모든 인형은 1 x 1 크기의 격자 한 칸을 차지하며 격자의 가장 아래 칸부터 차곡차곡 쌓여 있습니다. 
게임 사용자는 크레인을 좌우로 움직여서 멈춘 위치에서 가장 위에 있는 인형을 집어 올릴 수 있습니다. 
집어 올린 인형은 바구니에 쌓이게 되는 데, 이때 바구니의 가장 아래 칸부터 인형이 순서대로 쌓이게 됩니다. 
다음 그림은 [1번, 5번, 3번] 위치에서 순서대로 인형을 집어 올려 바구니에 담은 모습입니다.

만약 같은 모양의 인형 두 개가 바구니에 연속해서 쌓이게 되면 두 인형은 터뜨려지면서 바구니에서 사라지게 됩니다. 
위 상태에서 이어서 [5번] 위치에서 인형을 집어 바구니에 쌓으면 같은 모양 인형 두 개가 없어집니다.

크레인 작동 시 인형이 집어지지 않는 경우는 없으나 만약 인형이 없는 곳에서 크레인을 작동시키는 경우에는 아무런 일도 일어나지 않습니다. 
또한 바구니는 모든 인형이 들어갈 수 있을 만큼 충분히 크다고 가정합니다. (그림에서는 화면표시 제약으로 5칸만으로 표현하였음)

게임 화면의 격자의 상태가 담긴 2차원 배열 board와 인형을 집기 위해 크레인을 작동시킨 위치가 담긴 배열 moves가 매개변수로 주어질 때, 
크레인을 모두 작동시킨 후 터트려져 사라진 인형의 개수를 return 하도록 solution 함수를 완성해주세요.

[제한사항]
board 배열은 2차원 배열로 크기는 5 x 5 이상 30 x 30 이하입니다.
board의 각 칸에는 0 이상 100 이하인 정수가 담겨있습니다.
0은 빈 칸을 나타냅니다.
1 ~ 100의 각 숫자는 각기 다른 인형의 모양을 의미하며 같은 숫자는 같은 모양의 인형을 나타냅니다.
moves 배열의 크기는 1 이상 1,000 이하입니다.
moves 배열 각 원소들의 값은 1 이상이며 board 배열의 가로 크기 이하인 자연수입니다.

입출력 예
board
[[0,0,0,0,0],[0,0,1,0,3],[0,2,5,0,1],[4,2,4,4,2],[3,5,1,3,1]]
moves
[1,5,3,5,1,2,1,4]
result
4
*/


// 주말에 마무리하자...
public class ClawMachineGame {

	public static void main(String[] args) {
		
		int[][] board = {
					{0, 0, 0, 0, 0},
					{0, 0, 0, 0, 0},
					{0, 0, 0, 0, 0},
					{1, 0, 0, 0, 2}//,
					//{1, 0, 0, 0, 2}
				};
		
		int[] moves = {1, 5, 1, 5};
		
		System.out.println("### result : " + solution(board, moves));
		
	}
	
	
    public static int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack stack = new Stack<>();
        
        int[][] board2 = new int[board[0].length][board.length];	//	[5], [5]
        
    	for(int j=0; j < board[0].length; j++) {
            for(int i=0; i < board.length; i++) {
            	board2[j][board[0].length-i-1] = board[i][j];
            }
    	}    
    	
    	
        for (int i = 0; i < board2.length; i++) {
        	for (int j = 0; j < board2[0].length; j++) {
        		System.out.print(board2[i][j]+ " ");
        	}
        	System.out.println();
        }
    	
        /*
        for(int i = 0; i < moves.length; i++) {
        	// System.out.println("moves : " + i);	// 0,1,2,3
        	
        	for(int j = 0; j < board2[0].length; j++) {
        		
        		board2[moves[i]][board2[0].length-i-1]
        				
        	}
        	
        	
        	for(int j = 0; j < board[0].length; j++) {
        		if(moves[i]==j) {
        			
        		}
        	}
        }       
    	*/
    	/* 배열출력
        for (int i = 0; i < board.length; i++) {
        	for (int j = 0; j < board[0].length; j++) {
        		System.out.print(board[i][j]+ " ");
        	}
        	System.out.println();
        }
        */
        
        // 백터 https://velog.io/@lshjh4848/Java-%EC%8A%A4%ED%83%9DStack-%ED%81%B4%EB%9E%98%EC%8A%A4-%EC%A0%95%EB%A6%AC
        // 2차원배열 https://hunit.tistory.com/164
        /*
			gugudan[ i ][ j ] = i * j ; 
			위의 예제에서 사용된 arr는 2차원 배열이며, arr[i]는 arr의 각 배열 요소로 1차원 배열이 됩니다.
			따라서 arr.length는 2차원 배열인 arr의 배열 요소의 총 개수를 반환하며, arr[i].length는 arr의 
			각 배열 요소인 1차원 배열이 가지고 있는 배열 요소의 총 개수를 반환하게 됩니다.

			00 01 02 03 04
			10 11 12 13 14
			20 21 22 23 24

        뽑기 당했을 경우 0으로 초기화해줘야함
        
        
        
	        Stack<Element> stack = new Stack<>();
			과 같이 생성 할 수 있다.
			Stack 클래스는 기본적으로
			
			public Element push(Element item); // 데이터 추가
			public Element pop(); // 최근에 추가된(Top) 데이터 삭제
			public Element peek(); // 최근에 추가된(Top) 데이터 조회
			public boolean empty(); // stack의 값이 비었는지 확인, 비었으면 true, 아니면 false
			public int seach(Object o); // 인자값으로 받은 데이터의 위치 반환, 그림으로 설명하겠음
        
        */
        
        return answer;
    }
	
	
	
}
