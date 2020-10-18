package programmers.bbbnam.완주하지못한선수;

import java.util.Arrays;

public class NoGoalUser {
    //완주하지 못한 선수
    // https://programmers.co.kr/learn/courses/30/lessons/42576
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Arrays.sort(participant);
        Arrays.sort(completion);
        int i = 0;
        while (i < completion.length) {
            if (!participant[i].equals(completion[i])) {
                return participant[i];
            }
            i++;
        }
        return participant[i];
    }
}
