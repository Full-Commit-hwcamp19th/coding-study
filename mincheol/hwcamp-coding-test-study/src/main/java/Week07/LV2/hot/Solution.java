package Week07.LV2.hot;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

/*
 * 이름: 변민철
 * 날짜: 25. 09. 12.
 * 문제: https://school.programmers.co.kr/learn/courses/30/lessons/42626
 * */
//{1, 2, 3, 9, 10, 12}, 7
public class Solution {
    public static int solution(int[] scoville, int K) {
        int answer = 0;

        // 우선순위 큐에 배열의 모든 요소 담기
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int n : scoville) {
            pq.offer(n);
        }

        // 큐의 가장 앞 요소가 최소값
        int min = pq.peek();

        // 최소값이 K보다 커질 때까지 반복
        while (min < K) {

            // 더 맵게 만들 수 있기 위해서는 요소의 수가 최소 2개는 있어야 함.
            if (pq.size() >= 2) {
                pq.add(pq.poll() + (pq.poll() * 2));
                min = pq.peek();
                answer++;
            } else {

                // 더 맵게 못 만들면 -1을 반환
                return -1;
            }
        }
        return answer;
    }
}
