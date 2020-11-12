package programmers.bbbnam.같은숫자는싫어;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class NoSameNum {

    public int[] solution(int []arr) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();
        int now = 10;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != now) {
                list.add(arr[i]);
                now = arr[i];
            }
        }
        return list.stream().mapToInt(x -> x).toArray();
    }

    public static void main(String[] args) {
        NoSameNum noSameNum = new NoSameNum();
        System.out.println(">>>"+noSameNum.solution(new int[] {1,1,3,3,0,1,1}));
    }
}
