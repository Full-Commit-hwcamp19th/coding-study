package Week05.LV2.maxandmin;

/*
 * 이름: 변민철
 * 날짜: 25. 08. 27.
 * 문제: https://school.programmers.co.kr/learn/courses/30/lessons/12939
 * */
import java.util.*;
public class Solution {
    public static String solution(String s) {
        String answer = "";
        StringTokenizer st = new StringTokenizer(s);

        List<Integer> list = new ArrayList<>();

        while (st.hasMoreTokens()) {
            String token = st.nextToken();
            list.add(Integer.parseInt(token));
        }

        Collections.sort(list);

        String min = list.get(0).toString();
        String max = list.get(list.size() - 1).toString();
        answer = "\"" + min + " " + max + "\"";

        return  answer;
    }
}
