package Week02.LV0.coffee_errand;

/*
 * 이름: 변민철
 * 날짜: 25. 8. 9.
 * 문제: https://school.programmers.co.kr/learn/courses/30/lessons/181837
 * */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public static int solution(String[] order) {
        int answer = 0;
        String[] Latte = new String[] {"cafelatte", "icecafelatte","cafelatteice", "hotcafelatte", "cafelattehot"};
        List<String> LatteList = new ArrayList<>(Arrays.asList(Latte));

        for(int i = 0; i < order.length; i++){
            if (LatteList.contains(order[i])) {
                answer += 5000;
            } else {
                answer += 4500;
                }
        }
        return answer;
    }
}
