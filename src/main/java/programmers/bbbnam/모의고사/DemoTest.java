package programmers.bbbnam.모의고사;

import java.util.ArrayList;
import java.util.List;

public class DemoTest {

    //프로그래머스-level1_모의고사
    //https://programmers.co.kr/learn/courses/30/lessons/42840
    public int[] solution(int[] answers) {
        int[] answer = {};
        int [] human1 = {1, 2, 3, 4, 5};
        int [] human2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int [] human3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int size = answers.length;
        int [] score = new int[3];
        for (int i = 0; i < size; i++) {
            if (answers[i] == human1[i%5]) score[0]++;
            if (answers[i] == human2[i%8]) score[1]++;
            if (answers[i] == human3[i%10]) score[2]++;
        }
        List<Integer> list = new ArrayList();
        int maxScore = Math.max(Math.max(score[0], score[1]), score[2]);
        int scoreSize = score.length;

        if (score[0] == maxScore) list.add(1);
        if (score[1] == maxScore) list.add(2);
        if (score[2] == maxScore) list.add(3);

        return list.stream().mapToInt(i->i.intValue()).toArray();
    }
}
