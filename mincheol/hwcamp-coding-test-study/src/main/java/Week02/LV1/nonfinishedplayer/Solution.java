package Week02.LV1.nonfinishedplayer;

/*
 * 이름: 변민철
 * 날짜: 25. 8. 11.
 * 문제: https://school.programmers.co.kr/learn/courses/30/lessons/42576
 * */

import java.util.*;

public class Solution {
    public static String solution(String[] participant, String[] completion) {
        String answer = "";

        Map<String, Integer> pHashMap = new HashMap<>();

        // Map 내에 참가자 목록(participant)을 추가 참가자 이름(key), 완주여부 체크(value) - 0: 완주, 1: 미완주
        for (String participantItem : participant) {
            pHashMap.put(participantItem, pHashMap.getOrDefault(participantItem, 0) + 1);
        }

        // 완주 한 인원을 체크 Key 값에 따라 업데이트 수행, 완주여부에 따라 완주여부 체크(value)를 -1을 해서 완주여부확인을 수행
        for (String completionItem : completion) {
            pHashMap.put(completionItem, pHashMap.get(completionItem) - 1);
        }

        // Map을 순회하면서 0이 아닌 값을 찾아서 결과로 반환
        for (Map.Entry<String, Integer> entry : pHashMap.entrySet()) {
            if (entry.getValue() != 0) {
                answer = entry.getKey();
            }
        }
        return answer;
    }
}
