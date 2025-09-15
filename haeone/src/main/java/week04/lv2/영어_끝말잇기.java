package main.java.week04.lv2;
import java.util.*;
public class 영어_끝말잇기 {
    /*
     * 이름: 최혜원
     * 날짜: 2025.08.25
     * 문제: https://school.programmers.co.kr/learn/courses/30/lessons/12981
     * */
    public int[] solution(int n, String[] words) {
        Set<String> setWords = new HashSet<>();
        setWords.add(words[0]); // 첫 단어 등록

        for (int i = 1; i < words.length; i++) {
            String prev = words[i - 1];
            String curr = words[i];

            // 1. 말이 이어지지 않는 경우
            if (prev.charAt(prev.length() - 1) != curr.charAt(0)) {
                int person = (i % n) + 1;   // 몇 번째 사람
                int order = (i / n) + 1;    // 몇 번째 차례
                return new int[] {person, order};
            }

            // 2. 중복 단어인 경우
            if (!setWords.add(curr)) {
                int person = (i % n) + 1;
                int order = (i / n) + 1;
                return new int[] {person, order};
            }
        }

        // 문제 없이 끝까지 통과하면 [0, 0]
        return new int[] {0, 0};
    }
}
