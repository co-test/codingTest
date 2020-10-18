package programmers.bbbnam.두개뽑아서더하기;

import java.util.*;

public class PeekAndAdd {
    //프로그래머스-level1_두개뽑아서더하기
    //https://programmers.co.kr/learn/courses/30/lessons/68644
    public int[] solution(int[] numbers) {
        int[] answer = {};
        Set<Integer> set = new TreeSet<>();
        Arrays.sort(numbers);
        for(int i = 0; i < numbers.length; i++) {
            for (int t = 0; t < numbers.length; t++) {
                if (i==t) continue;
                set.add(numbers[i] + numbers[t]);
            }
        }
        int i = 0;
        answer = new int[set.size()];
        for (int s : set) {
            answer[i] = s;
            i++;
        }
        return answer;
    }
}
