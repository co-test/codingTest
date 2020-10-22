package programmers.bbbnam.k번째수;

import java.util.Arrays;

public class KCheck {
    //프로그래머스-level1_k번째수
    //https://programmers.co.kr/learn/courses/30/lessons/42748
    public int[] solution(int[] array, int[][] commands) {
        int commandsLength = commands.length;
        int[] answer = new int[commandsLength];
        for (int i = 0; i < commandsLength; i++) {
            int [] command = commands[i];
            int start = command[0] - 1;
            int end = command[1];
            int target = command[2] - 1;
            int [] sliceArr = Arrays.copyOfRange(array, start, end);
            Arrays.sort(sliceArr);
            answer[i] = sliceArr[target];
        }
        return answer;
    }
}
