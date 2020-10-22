package programmers.bbbnam.년도2016;

public class Year2016 {
    //프로그래머스-level1_2016년
    // https://programmers.co.kr/learn/courses/30/lessons/12901
    public String solution(int a, int b) {
        String answer = "";
        int totalDay = 0;
        String [] day = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
        // 손등으로 월별 일자수 구한다
        // 윤년이라고 하니 28/29 중 윤년에는 29일을 택한다.
        int [] monthDay = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        for (int i = 0; i < a - 1; i++) {
            totalDay += monthDay[i];
        }
        totalDay += b - 1;
        answer = day[totalDay % 7];
        return answer;
    }
}
