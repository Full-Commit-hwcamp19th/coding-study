package haeone.week01.lv0;

public class 세균증식 {
    /*
     * 이름: 최혜원
     * 날짜: 2025.08.06
     * 문제: https://school.programmers.co.kr/learn/courses/30/lessons/120910
     * */

        public int solution(int n, int t) {
            int answer = n;

            for (int i = 0; i < t; i++) {
                answer = answer * 2;

            }
            return answer;

        }
}
