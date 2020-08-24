package programmers.bbbnam.큰수만들기;

public class BigNumber {

    public String solution(String number, int k) {
        //String answer = "";
        int cnt = number.length() - k;
        int right = number.length() - cnt;
        int left = 0;
        char [] charArray = number.toCharArray();
        char [] answerArray = new char[number.length() - k];
        int temp = 0;
        int index = 0;
        while (cnt > 0) {
            //TODO 재작성
            int max = 0;
            for (int i = left; i <= right; i++) {
               int num = Integer.parseInt(String.valueOf(charArray[i]));
               if (num > max) {
                   temp = i;
                   max = num;
               }
            }
            answerArray[index] = (char)(max + '0');
            cnt--;
            left = temp + 1;
            right = number.length() - cnt;
            index++;
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
