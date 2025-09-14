package Week07.LV1.samenumber;

import java.util.*;

/*
 * 이름: 변민철
 * 날짜: 25. 09. 12.
 * 문제: https://school.programmers.co.kr/learn/courses/30/lessons/12906
 * */
public class Solution {
    public static int[] solution(int[] arr) {
        int[] answer = {};
        List<Integer> list = new LinkedList<>();
        Queue<Integer> q = new LinkedList<>();

        for (int num : arr) {                           // 배열의 모든 요소를 큐에 담기
            q.offer(num);
        }

        list.add(q.poll());                             // 리스트에 첫 번째 요소를 Deque해서 담기

        while (!q.isEmpty()) {                          // 큐가 빌 때까지 반복
            Integer temp = q.poll();                        // Deque와 동시에 Deque한 요소를 잠시 보관(이때, Auto-Unboxing)
            if (!(list.get(list.size() - 1) == temp)) { // Deque한 요소가 리스트의 마지막 요소와 다르면 리스트에 추가
                list.add(temp);
            }
        }
        answer = list.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}
