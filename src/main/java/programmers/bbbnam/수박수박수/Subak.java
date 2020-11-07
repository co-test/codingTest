package programmers.bbbnam.수박수박수;

public class Subak {
    public String solution(int n) {
        String answer = "";
        String [] subaks = {"수", "박"};
        int index = 0;
        while (index < n) {
            answer += subaks[index%2];
            index++;
        }

        return answer;
    }

    public static void main(String[] args) {
        Subak subak = new Subak();
        String res = subak.solution(4);
        System.out.println("res>"+res);
    }
}
