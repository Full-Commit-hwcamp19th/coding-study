package haeone.week01.lv1;

public class 두_정수_사이의_합 {
    /*
     * 이름: 최혜원
     * 날짜: 2025.08.06
     * 문제: https://school.programmers.co.kr/learn/courses/30/lessons/12919
     * */

    public long solution(int a, int b) {
        long answer = 0;
        long g = 0;

        if(a != b){
            g = Math.abs(a-b) + 1;
            answer = ((a + b) / 2) * g;
        }
        else{
            answer = a;
        }

        return answer;
    }
}