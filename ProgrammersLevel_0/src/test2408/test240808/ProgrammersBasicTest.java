package test2408.test240808;

import java.util.Arrays;

public class ProgrammersBasicTest {
    // 짝수, 홀수 개수 구하기
    class Solution {
        public int[] solution(int[] num_list) {
            int[] answer = new int[2];
            for(int i = 0; i < num_list.length; i++) {
                if(num_list[i] % 2 == 0){
                    answer[0] += 1;
                } else {
                    answer[1] += 1;
                }
            }
            return answer;
        }
    }

    // 배열 요소값 2배 만들기
    class Solution2 {
        public int[] solution(int[] numbers) {
            int[] answer = new int[numbers.length];
             for(int i = 0; i < numbers.length ; i++) {
                 answer[i] = numbers[i] * 2;
             }
            return answer;
        }
    }

    //요소 개수가 홀수인 배열 중앙값 구하기
    class Solution3 {
        public int solution(int[] array) {
            int answer = 0;
            Arrays.sort(array);
            answer = array[array.length/2];

            return answer;
        }
    }
}
