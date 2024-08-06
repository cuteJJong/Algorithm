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
    public static void main(String[] args) {
        int [] arr = {293, 1000, 395, 678, 94};
        int [] delete_list = {94, 777, 104, 1000, 1, 12};

        List<Integer> answer = new ArrayList<>();

        //arr 배열의 모든 요소 answerList에 추가 삭제하기 위해
        for(int i = 0; i < arr.length; i++) {
            answer.add(arr[i]);
        }

        for(int i = 0; i < arr.length ; i++) {
            for(int j = 0; j < delete_list.length; j++) {
                if(arr[i] == delete_list[j]) {
                    // remove 메소드는 객체를 요그하기 때문에 int[]를 integer 객체로 변환해서 써야한다.
                    answer.remove(Integer.valueOf(arr[i]));
                }
            }
        }

        //자동 박싱 방법
//        for (int value : arr) {
//            answer.add(value);
//        }
//
//        for (int value : delete_list) {
//            answer.remove(value); // 자동 박싱: int를 Integer로 자동 변환
//        }

        System.out.println(answer);
    }
}
