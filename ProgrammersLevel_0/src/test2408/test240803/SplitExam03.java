package test2408.test240803;/*
-문제 설명
문자열 myString이 주어집니다. myString을 문자 "x"를 기준으로 나눴을 때
나눠진 문자열 각각의 길이를 순서대로 저장한 배열을 return 하는 solution 함수를 완성해 주세요.
-제한사항
1 ≤ myString의 길이 ≤ 100,000
myString은 알파벳 소문자로 이루어진 문자열입니다.
*/
/*
split(String regex, int limit) 메서드의 limit 인자에 대한 설명은 다음과 같습니다:

1. 양수 (limit > 0):
주어진 수 만큼만 문자열을 나누며, 결과 배열의 길이가 limit를 초과하지 않게 됩니다.
마지막 배열 요소에는 나머지 문자열이 포함됩니다.

2. 0 (limit == 0):
문자열을 가능한 한 많이 나누지만, 맨 끝의 빈 문자열을 제거합니다.
즉, 결과 배열의 마지막에 빈 문자열이 포함되지 않도록 합니다.
3. 음수 (limit < 0):\
문자열을 가능한 한 많이 나눕니다. 빈 문자열도 포함됩니다.
즉, 구분자가 연속으로 나올 때 빈 문자열도 배열에 포함됩니다.
 */

public class SplitExam03 {
    public static void main(String[] args) {
        String str1 = "oxooxoxxox";
        String str2 = "xabcxdefxghi";

        String [] aStr1 = str1.split("x", -1);
        String [] aStr2 = str2.split("x", -1);

        int [] answer1 = new int [str1.length()];
        int [] answer2 = new int [str2.length()];

        for (int i = 0 ; i < aStr1.length ; i++) {
            answer1[i] = aStr1[i].length();
            System.out.print(answer1[i] + ",");
        }
        System.out.print("\n");

        //향상된 for문은 String만 가능
        for (int i = 0 ; i < aStr2.length ; i++) {
            answer2[i] = aStr2[i].length();
            System.out.print(answer2[i] + ",");
        }
        System.out.print("\n");

    }
}
