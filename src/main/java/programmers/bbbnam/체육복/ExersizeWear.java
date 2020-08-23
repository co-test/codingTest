package programmers.bbbnam.체육복;

public class ExersizeWear {

    public int solution(int n, int[] lost, int[] reserse) {
        int answer = n;
        int [] students = new int[n];

        for (int s = 0; s < n; s++){
            students[s] = 1; //기본 체육복 셋팅
        }

        for (int reserveValue : reserse){
            students[reserveValue - 1]++; //여분 추가
        }

        for (int lostValue : lost) {
            students[lostValue - 1]--; //일단 각 번호별 안가져온 애들것 마이너스
        }
        int studentCount = students.length;
        for (int i = 0; i < studentCount; i++) {
            int backNum = i+1;
            int frontNum = i-1;
            if (students[i] != 0) {
                continue;
            } //이미 체육복 있는 애들은 패스
            if (backNum != studentCount && students[backNum] == 2) {
                students[i]++;
                students[backNum]--;
                continue;
            }
            if (frontNum >= 0 && students[frontNum] == 2){
                students[i]++;
                students[frontNum]--;
                continue;
            }
            answer--;
        }
        return answer;
    }
}
