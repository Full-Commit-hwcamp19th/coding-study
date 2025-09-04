package Week03.LV2.clothes;

/*
 * 이름: 변민철
 * 날짜: 25. 08. 20.
 * 문제: https://school.programmers.co.kr/learn/courses/30/lessons/42578
 * */

import java.util.*;
//{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}
//{"crow_mask", "face"}, {"blue_sunglasses", "face"}, {"smoky_makeup", "face"}

public class Solution {
    public static int solution(String[][] clothes) {
        int answer = 0;
        //name -> type 맵
        Map<String, String> map = new HashMap<>();
        for (int i = 0; i < clothes.length; i++) {
            map.put(clothes[i][0], clothes[i][1]);
        }

        //items: 각 의상의 "종류" 모으기
        List<String> items = new ArrayList<>();
        for (int i = 0; i < clothes.length; i++) {
            items.add(map.get(clothes[i][0]));
        }

        //'종류별 개수' 세기
        Map<String, Integer> typeCount = new HashMap<>();
        for (String type : items) {
            typeCount.put(type, typeCount.getOrDefault(type, 0) + 1);
        }

        //경우의 수: (각 종류 개수 + 1) 들의 곱 - 1
        int prod = 1;
        for (int cnt : typeCount.values()) {
            prod *= (cnt + 1);
        }
        answer = prod - 1;

        return answer;

    }
}

//public class Solution {
//    public static int solution(String[][] clothes) {
//        return Arrays.stream(clothes)
//                .collect(groupingBy(p -> p[1], mapping(p -> p[0], counting())))
//                .values()
//                .stream()
//                .collect(reducing(1L, (x, y) -> x * (y + 1))).intValue() - 1;
//    }
//}