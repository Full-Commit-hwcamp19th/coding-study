package Week05.LV0.tallerperson;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * 이름: 변민철
 * 날짜: 25. 08. 27.
 * 문제: https://school.programmers.co.kr/learn/courses/30/lessons/120585
 * */
public class Solution {
    public static int solution(int[] array, int height) {
        int answer = 0;
        List<int[]> list = new ArrayList<>();
        for(int a : array){
            if(a > height){
                list.add(new int[]{a});
            }
        }
        answer = list.size();
        return answer;
    }
}
