package Week03.LV1.dataanalysis;

/*
 * 이름: 변민철
 * 날짜: 25. 08. 19.
 * 문제: https://school.programmers.co.kr/learn/courses/30/lessons/250121
 * */

import java.util.*;

public class Solution {
    public static int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        int[][] answer = {};

        Map<String, Integer> map = new HashMap<>();
        map.put("code", 0);
        map.put("date", 1);
        map.put("maximum", 2);
        map.put("remain", 3);

        List<int[]> list = new ArrayList<>(Arrays.asList(data));

        list.removeIf(row -> row[map.get(ext)] >= val_ext);

        list.sort(Comparator.comparingInt(row -> row[map.get(sort_by)]));

        answer = list.toArray(new int[list.size()][]);

        return answer;
    }
}

