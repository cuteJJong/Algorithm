package test2408.test240806;

public class IntroductoryAlgorithm {
    public int solution(int angle) {
        /*
        각도기
        */
        int answer = 0;

        if (angle > 0 && angle < 90) {
            answer = 1;
        }
        else if (angle == 90) {
            answer = 2;
        }
        else if(angle > 90 && angle < 180) {
            answer = 3;
        }
        else {
            answer = 4;
        }
        return answer;

//        지옥의 삼항연산자
//        return angle == 180 ? 4 : angle < 90 ? 1 : angle == 90 ? 2 : angle > 90 ? 3 : 0;

//        if문 간단하게
//        if (angle > 0 && angle < 90) return 1;
//        else if (angle == 90) return 2;
//        else if (angle > 90 && angle < 180) return 3;
//        else return 4;
    }

    public int solution2(int n) {
        //각도기
        int answer = 0;

        for(int i=2; i<=n; i+=2){
            answer+=i;
        }

        //짝수 활용
//        for(int i=2; i<=n; i+=2){
//            answer+=i;
//        }

        return answer;


    }
}
