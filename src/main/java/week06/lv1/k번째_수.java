package main.java.week06.lv1;

import java.util.ArrayList;
import java.util.Collections;

public class k번째_수 {
    /*
     * 이름: 최혜원
     * 날짜: 2025.09.09
     * 문제: https://school.programmers.co.kr/learn/courses/30/lessons/42748
     * */
    public int[] solution(int[] array, int[][] commands) {
        ArrayList<Integer> list = new ArrayList<>();
        int[] resultArray = new int[commands.length];
        for (int i = 0; i < 3 ; i++) {
            int start = commands[i][0];
            int end = commands[i][1];
            int resultIndex = commands[i][2];
            for (int j = start-1; j < end-start+1; j++) {
                list.add(array[j]);
            }
            Collections.sort(list);
            resultArray[i]=list.get(resultIndex-1);
        }

        return resultArray;
    }
}
