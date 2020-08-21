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
                //체육복 없는 애들인데 자기보다 바로 뒷번호에 옷이 있다~? 그럼 빌려야쥐..
                // 그런데 맨 뒤에 있는애는 본인보다 뒤가 없으니.. 최대값이 되면 안된다.
                students[i]++;
                students[backNum]--;
                continue;
            }
            if (frontNum >= 0 && students[frontNum] == 2){
                //체육복 없는 애들인데 자기보다 앞번호에 옷이 있으면? 그럼 빌려야지~!
                // 그런데 가장 앞에 있는 애는 더 앞이 없으니.. 최소값 보다 작으면 안된다.
                students[i]++;
                students[frontNum]--;
                continue;
            }
            //위 조건 어디에도 안걸리고 온 학생이면.. 체육복이 없네
            answer--;
        }
        return answer;
    }
}
