package test2408.test240803;/*
- 문제 설명
단어가 공백 한 개 이상으로 구분되어 있는 문자열 my_string이 매개변수로 주어질 때,
my_string에 나온 단어를 앞에서부터 순서대로 담은 문자열 배열을 return 하는 solution 함수를 작성해 주세요.
- 제한 사항
1.my_string은 영소문자와 공백으로만 이루어져 있습니다.
2.1 ≤ my_string의 길이 ≤ 1,000
3.my_string의 맨 앞과 맨 뒤에도 공백이 있을 수 있습니다.
4.my_string에는 단어가 하나 이상 존재합니다.
*/
import java.util.Scanner;
public class SplitExam02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        if(str.contains(" ")) {
            String[] aStr = str.trim().split("\\s");
            for(String aStrs : aStr) {
                System.out.print(aStrs + ",");
            }
        } else {
            System.out.println(str);
        }
    }
}
