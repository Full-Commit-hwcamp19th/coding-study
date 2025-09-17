package main.java.week05.lv0;

public class 머쓱이보다_키_큰_사람 {
    /*
     * 이름: 최혜원
     * 날짜: 2025.09.03
     * 문제: https://school.programmers.co.kr/learn/courses/30/lessons/120585
     * */
    public int solution(int[] array, int height) {
        // array 키가 담긴 배열
        // height 머쓱이 키(기준값)
        // result 나보다 큰 사람--
        int result = 0;
        for(int a : array){
            if(a > height){
                result++;
            }
        }
        return result;
    }
}
