package main.java.week06.lv2;

import java.util.Arrays;

public class 구명보트 {
    /*
     * 이름: 최혜원
     * 날짜: 2025.09.09
     * 문제: https://school.programmers.co.kr/learn/courses/30/lessons/42885
     * */

      public int solution(int[] people, int limit) {
        int boats = 0;
        int lighter = 0;
        int heavier = people.length-1;

        Arrays.sort(people);
        while (lighter <= heavier){
            if(people[lighter] + people[heavier]  <= limit){
                lighter++;
            }
            heavier--;
            boats++;
        }
        return boats;
    }
    /*public int solution(int[] people, int limit) {
        int possibleTwo = 0;
        int returnResult = 0;
        int possibleLimit = limit/2;
        for(int i = 0; i < people.length; i++) {
            if(people[i]<= possibleLimit){
                possibleTwo++;
                if(possibleTwo ==2){
                    returnResult++;
                    possibleTwo=0;
                }
            }
            else {
                returnResult++;
            }
        }//for
        if(possibleTwo==1) {
            returnResult++;
        }
        return returnResult;
    }*/
}
