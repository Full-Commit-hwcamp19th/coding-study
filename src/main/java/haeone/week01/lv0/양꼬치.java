package haeone.week01.lv0;

public class 양꼬치 {
    /*
     * 이름: 최혜원
     * 날짜: 2025.08.05
     * 문제: https://school.programmers.co.kr/learn/courses/30/lessons/120830
    * */
   int solution(int n, int k) {
        int answer = 0;
        int service = 0;
        if(n >= 10){
            service = n / 10 ;
        }
        k = k - service;
        answer = n * 12000 + k * 2000;

        return answer;
    }
}
