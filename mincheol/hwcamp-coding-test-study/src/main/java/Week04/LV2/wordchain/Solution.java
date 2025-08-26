package Week04.LV2.wordchain;

/*
 * 이름: 변민철
 * 날짜: 25. 08. 24.
 * 문제: https://school.programmers.co.kr/learn/courses/30/lessons/12981
 * */
import java.util.*;
public class Solution {
    public static int[] solution(int n, String[] words) {
        Set<String> used = new HashSet<>();
        used.add(words[0]);

        for (int i = 1; i < words.length; i++) {
            String prev = words[i - 1];
            String curr = words[i];

            boolean notChained = prev.charAt(prev.length() - 1) != curr.charAt(0);
            boolean duplicated = !used.add(curr); // add 실패면 중복

            if (notChained || duplicated) {
                int player = i % n + 1;
                int turn = i / n + 1;
                return new int[]{player, turn};
            }
        }

        return new int[]{0, 0};
    }
}
