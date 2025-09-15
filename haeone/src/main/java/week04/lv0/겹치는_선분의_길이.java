package main.java.week04.lv0;
import java.util.*;
public class 겹치는_선분의_길이 {
    /*
     * 이름: 최혜원
     * 날짜: 2025.08.25
     * 문제: https://school.programmers.co.kr/learn/courses/30/lessons/120876
     * */
    public int solution(int[][] lines) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        Set<Integer> set3 = new HashSet<>();

        for (int count = 0; count < lines.length; count++) {
            int[] line = lines[count];
            int start = line[0];
            int end = line[1];

            for (int i = start; i < end; i++) { // 끝점 미포함
                if (count == 0) set1.add(i);
                else if (count == 1) set2.add(i);
                else if (count == 2) set3.add(i);
            }
        }

        // 겹치는 길이 세기
        int overlap = 0;
        for (int i = -100; i <= 100; i++) {
            int cover = 0;
            if (set1.contains(i)) cover++;
            if (set2.contains(i)) cover++;
            if (set3.contains(i)) cover++;
            if (cover >= 2) overlap++;
        }
        return overlap;
    }
}
