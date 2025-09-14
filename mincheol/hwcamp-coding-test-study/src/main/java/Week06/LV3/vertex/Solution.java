package Week06.LV3.vertex;

import java.util.*;

/*
 * 이름: 변민철
 * 날짜: 25. 09. 08.
 * 문제: https://school.programmers.co.kr/learn/courses/30/lessons/49189
 * */
public class Solution {
    public static int solution(int n, int[][] edge) {
        List<Integer>[] graph = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) {
            graph[i] = new ArrayList<>();
        }
        for (int[] e : edge) {
            graph[e[0]].add(e[1]);
            graph[e[1]].add(e[0]);
        }

        int[] distance = new int[n + 1];
        Arrays.fill(distance, -1);
        Queue<Integer> queue = new LinkedList<>();

        distance[1] = 0;
        queue.add(1);

        while (!queue.isEmpty()) {
            int current = queue.poll();
            for (int neighbor : graph[current]) {
                if (distance[neighbor] == -1) {
                    distance[neighbor] = distance[current] + 1;
                    queue.add(neighbor);
                }
            }
        }

        int maxDistance = 0;
        for (int dist : distance) {
            if (dist > maxDistance) {
                maxDistance = dist;
            }
        }

        int count = 0;
        for (int dist : distance) {
            if (dist == maxDistance) {
                count++;
            }
        }

        return count;
    }
}
