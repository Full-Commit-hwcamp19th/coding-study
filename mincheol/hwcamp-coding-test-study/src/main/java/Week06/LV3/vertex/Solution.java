package Week06.LV3.vertex;

import java.util.*;

/*
 * 이름: 변민철
 * 날짜: 25. 09. 08.
 * 문제: https://school.programmers.co.kr/learn/courses/30/lessons/49189
 * */
public class Solution {
//    public static int solution(int n, int[][] edge) {
//        List<Integer>[] graph = new ArrayList[n + 1];
//        for (int i = 1; i <= n; i++) {
//            graph[i] = new ArrayList<>();
//        }
//        for (int[] e : edge) {
//            graph[e[0]].add(e[1]);
//            graph[e[1]].add(e[0]);
//        }
//
//        int[] distance = new int[n + 1];
//        Arrays.fill(distance, -1);
//        Queue<Integer> queue = new LinkedList<>();
//
//        distance[1] = 0;
//        queue.add(1);
//
//        while (!queue.isEmpty()) {
//            int current = queue.poll();
//            for (int neighbor : graph[current]) {
//                if (distance[neighbor] == -1) {
//                    distance[neighbor] = distance[current] + 1;
//                    queue.add(neighbor);
//                }
//            }
//        }
//
//        int maxDistance = 0;
//        for (int dist : distance) {
//            if (dist > maxDistance) {
//                maxDistance = dist;
//            }
//        }
//
//        int count = 0;
//        for (int dist : distance) {
//            if (dist == maxDistance) {
//                count++;
//            }
//        }
//
//        return count;
//    }

    static List<Integer>[] graph;
    static int[] distance;

    public static int solution(int n, int[][] edge) {
        graph = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) {
            graph[i] = new ArrayList<>();
        }
        for (int[] e : edge) {
            graph[e[0]].add(e[1]);
            graph[e[1]].add(e[0]);
        }

        distance = new int[n + 1];
        Arrays.fill(distance, -1);

        // BFS와 달리 DFS는 모든 경로를 탐색하여 최단 거리를 찾아야 합니다.
        // 여기서는 비효율성을 감수하고 모든 노드를 시작점으로 DFS를 재귀적으로 호출하여 최단 거리를 갱신하는 방식을 사용합니다.
        // 현실적으로는 BFS가 훨씬 효율적입니다.
        for (int i = 1; i <= n; i++) {
            dfs(1, 0); // 1번 노드에서 시작
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

    public static void dfs(int node, int dist) {
        if (distance[node] != -1 && distance[node] < dist) {
            return; // 이미 더 짧은 경로로 방문한 경우
        }

        distance[node] = dist;

        for (int neighbor : graph[node]) {
            dfs(neighbor, dist + 1);
        }
    }

}
