package test2408.test240803;
/*
- 문제 : 공백으로 구분하기 1
- 문제 설명
단어가 공백 한 개로 구분되어 있는 문자열 'my_string'이 매개변수로 주어질 때, 'my_string'에 나온 단어를 앞에서부터
순서대로 담은 문자열 배열을 'return' 하는 'solution' 함수를 작성해 주세요.
- 제한 사항
1. my_string은 영소문자와 공백으로만 이루어져 있습니다.
2. 1 ≤ my_string의 길이 ≤ 1,000
3. my_string의 맨 앞과 맨 뒤에 글자는 공백이 아닙니다.
*/
public class SplitExam01 {
    public String[] solution(String my_string) {
        String[] answer = {};
        //my_string을 공백으로 분리하여 문자열 배열에 저장
        answer = my_string.split(" ");
        return answer;
    }
}
