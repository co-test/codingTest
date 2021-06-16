package programmers.bbbnam.문자열기본;

public class NormalStr {
    public boolean solution(String s) {
        boolean answer = true;
        char [] charArray = s.toCharArray();
        if (!(charArray.length == 4 || charArray.length == 6)) {
            return false;
        }
        for (char a : charArray) {
            if (!Character.isDigit(a)) {
                return false;
            };
        }
        return answer;
    }

    public static void main(String[] args) {
        NormalStr normalStr = new NormalStr();
        boolean a = normalStr.solution("a234");
        System.out.println("a>>"+a);
    }
}
