package Week03.gap;

import java.util.Arrays;
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
