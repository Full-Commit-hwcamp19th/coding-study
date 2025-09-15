package main.java.week04.lv0;

public class 팩토리얼 {
    /*
     * 이름: 최혜원
     * 날짜: 2025.08.25
     * 문제: https://school.programmers.co.kr/learn/courses/30/lessons/120848
     * */
    public int solution(int n) {

        int total = 1;
        for(int result = 1 ; ; result++){
            total *= result;
            if(total == n){
                return result;
            }
            if(total > n){
                return result-1;
            }
        }// for문
    }
}
