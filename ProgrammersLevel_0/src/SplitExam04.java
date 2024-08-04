import java.util.Arrays;

/*
- 문제 설명
덧셈, 뺄셈 수식들이 'X [연산자] Y = Z' 형태로 들어있는 문자열 배열 quiz가 매개변수로 주어집니다.
수식이 옳다면 "O"를 틀리다면 "X"를 순서대로 담은 배열을 return하도록 solution 함수를 완성해주세요.
- 제한 사항
-연산 기호와 숫자 사이는 항상 하나의 공백이 존재합니다. 단 음수를 표시하는 마이너스 기호와 숫자 사이에는 공백이 존재하지 않습니다.
-1 ≤ quiz의 길이 ≤ 10
-X, Y, Z는 각각 0부터 9까지 숫자로 이루어진 정수를 의미하며, 각 숫자의 맨 앞에 마이너스 기호가 하나 있을 수 있고 이는 음수를 의미합니다.
-X, Y, Z는 0을 제외하고는 0으로 시작하지 않습니다.
--10,000 ≤ X, Y ≤ 10,000
--20,000 ≤ Z ≤ 20,000
-[연산자]는 + 와 - 중 하나입니다.

* 문자열에서 공백을 제거 후 각 숫자와 연산자를 정수로 바꾼 후 조건식 사용
*/
public class SplitExam04 {
    public static void main(String[] args) {
        String [] str1 = {"3 - 4 = -3", "5 + 6 = 11"};
        String [] str2 = {"19 - 6 = 13", "5 + 66 = 71", "5 - 15 = 63", "3 - 1 = 2"};

        String [] answer1 = new String[str1.length];
        String [] answer2 = new String[str2.length];

        for(int i = 0; i < str1.length; i++) {
            String [] unit = str1[i].split(" ");
            // 인덱스 위치의 문자를 정수 저장
            // 문자열을 정수로 변환 Integer.parseInt()
            int X = Integer.parseInt(unit[0]);
            String operator = unit[1];
            int Y = Integer.parseInt(unit[2]);
            int Z = Integer.parseInt(unit[4]);

            //if문 다음 코드가 1줄이면 {} 생략가능
            if(operator.equals("+")) {
                if(X + Y == Z) answer1[i] = "O";
                else answer1[i] = "X";
            } else {
                if (X - Y == Z) answer1[i] = "O";
                else answer1[i] = "X";
            }
        }

        for(int i = 0; i < str2.length; i++) {
            String [] unit = str2[i].split(" ");
            int X = Integer.parseInt(unit[0]);
            String operator = unit[1];
            int Y = Integer.parseInt(unit[2]);
            int Z = Integer.parseInt(unit[4]);

            if(operator.equals("+")) {
                if(X + Y == Z) answer2[i] = "O";
                else answer2[i] = "X";
            } else {
                if (X - Y == Z) answer2[i] = "O";
                else answer2[i] = "X";
            }
        }
        //배열을 출력하기위해 Arrays.toString()을 쓴다.
        System.out.println(Arrays.toString(answer1));
        System.out.println(Arrays.toString(answer2));
    }
}
