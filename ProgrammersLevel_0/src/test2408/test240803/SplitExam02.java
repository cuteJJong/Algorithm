package test2408.test240803;/*
- 문제 : 공백으로 구분하기 2
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
    class Solution {
        public String[] solution(String my_string) {
            String[] answer = {};
            //trim() 메서드를 사용하여 문자열의 앞뒤 공백을 제거
            //split() 메서드를 사용하여 하나 이상의 공백을 기준으로 문자열을 분리하여 문자열 배열에 저장
            answer = my_string.trim().split("\\s+");
            return answer;
        }
    }
}
