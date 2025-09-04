package Week03.LV0.gap;

/*
 * 이름: 변민철
 * 날짜: 25. 08. 19.
 * 문제: https://school.programmers.co.kr/learn/courses/30/lessons/181868
 * */

import java.util.StringTokenizer;

public class Solution {
    public static String[] solution(String my_string) {
        String[] answer = {};
        StringTokenizer st = new StringTokenizer(my_string," ");
        answer = new String[st.countTokens()];
        int num = 0;
        while (st.hasMoreTokens()){
            answer[num] = st.nextToken();
            num++;
        }
        return answer;
    }
}
