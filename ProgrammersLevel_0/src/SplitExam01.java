import java.util.Scanner;

/*
- 문제 설명
단어가 공백 한 개로 구분되어 있는 문자열 'my_string'이 매개변수로 주어질 때, 'my_string'에 나온 단어를 앞에서부터
순서대로 담은 문자열 배열을 'return' 하는 'solution' 함수를 작성해 주세요.
- 제한 사항
1. my_string은 영소문자와 공백으로만 이루어져 있습니다.
2. 1 ≤ my_string의 길이 ≤ 1,000
3. my_string의 맨 앞과 맨 뒤에 글자는 공백이 아닙니다.
*/
public class SplitExam01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();     // nextLine() next()는 공백이 있으면 공백 앞에 문자열만 받는다.
//        String str  = "i love you";

        if(str.contains(" ")) {
            String[] aStr = str.split("\\s+");
            for (int i = 0 ; i < aStr.length ; i++) {
                System.out.print(aStr[i] + ",");
            }

        } else {
            System.out.println(str);
        }
    }
}
