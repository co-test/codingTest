package programmers.bbbnam.같은숫자는싫어;

import java.util.ArrayList;
import java.util.List;

public class NoSameNum_1 {
    public int[] solution(int []arr) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();
        int size = arr.length - 1;
        for (int i = 0; i < size; i++) {
            list.add(arr[i]);
            if (i == size - 1) {
                continue;
            }
            if (list.get(list.size() - 1) == arr[i+1]) {
                list.remove(list.size() - 1);
            }
        }
        answer = new int [list.size()];
        int index = 0;
        for (int a : list) {
            answer[index] = a;
            index++;
        }

        return answer;
    }
}
