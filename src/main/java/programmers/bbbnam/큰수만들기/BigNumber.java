package programmers.bbbnam.큰수만들기;

public class BigNumber {

    public String solution(String number, int k) {
        String answer = "";
        int right = number.length() - k;
        int left = 0;
        char [] charArray = number.toCharArray();
        char [] answerArray = new char[number.length()];
        int temp = 0;
        int max = 0;

        while () {
            //TODO 재작성
        }

        return String.valueOf(answerArray);
    }

    public static void main(String[] args) {
        BigNumber bigNumber = new BigNumber();
        System.out.println(bigNumber.solution("1924", 2));
        System.out.println(bigNumber.solution("1231234", 3));
        System.out.println(bigNumber.solution("4177252841", 4));
    }
}
