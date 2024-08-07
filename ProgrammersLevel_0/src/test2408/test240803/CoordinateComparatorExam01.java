package test2408.test240803;

import java.util.ArrayList;
import java.util.List;

/*
- 문제 설명
정수 배열 arr과 delete_list가 있습니다. arr의 원소 중 delete_list의 원소를 모두 삭제하고
남은 원소들은 기존의 arr에 있던 순서를 유지한 배열을 return 하는 solution 함수를 작성해 주세요.
- 제한 사항
-1 ≤ arr의 길이 ≤ 100
-1 ≤ arr의 원소 ≤ 1,000
-arr의 원소는 모두 서로 다릅니다.
-1 ≤ delete_list의 길이 ≤ 100
-1 ≤ delete_list의 원소 ≤ 1,000
-delete_list의 원소는 모두 서로 다릅니다.
* 문자열에서 공백을 제거 후 각 숫자와 연산자를 정수로 바꾼 후 조건식 사용
*/
public class CoordinateComparatorExam01 {
    class Solution {
        public List solution(int[] arr, int[] delete_list) {
            List<Integer> answer = new ArrayList<>();
            //arr 배열의 모든 요소를 answer 리스트에 추가
            for(int i = 0; i < arr.length; i++) {
                answer.add(arr[i]);
            }
            //arr 배열의 요소와 delete_list의 요소를 비교 같으면 삭제
            //remove() 메소드는 객체가 필요하기에
            // Integer.valueOf()를 사용하여 기본형 int를 Integer 객체로 변환한 후 제거합니다.
            for(int i = 0; i < arr.length ; i++) {
                for(int j = 0; j < delete_list.length; j++) {
                    if(arr[i] == delete_list[j]) {
                        answer.remove(Integer.valueOf(arr[i]));
                    }
                }
            }
            return answer;
        }
    }

    //다른 풀이
    public List solution2(int[] arr, int[] delete_list) {
        List<Integer> answer = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            answer.add(arr[i]);
        }
        for (int i = 0; i < delete_list.length; i++) {
            if(answer.contains(delete_list[i])) {
                answer.remove((Integer)delete_list[i]);
            }
        }
        return answer;
    }


        //자동 박싱 방법
//        for (int value : arr) {
//            answer.add(value);
//        }
//
//        for (int value : delete_list) {
//            answer.remove(value); // 자동 박싱: int를 Integer로 자동 변환
//        }
}
