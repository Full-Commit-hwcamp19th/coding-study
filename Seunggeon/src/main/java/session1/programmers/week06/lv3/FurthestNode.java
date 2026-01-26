package programmers.week06.lv3;

/*
 * 이름: 이승건
 * 날짜: 25. 9. 9.
 * 문제: https://school.programmers.co.kr/learn/courses/30/lessons/49189
 * */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class FurthestNode {
    private static int solution(int n, int[][] edge) {
        // [n][2]로 들어온 배열을 [n+1][n+1]로 펼치기
//        int[][] nodes = new int[n + 1][n + 1];
//        for(int i = 0; i < edge.length; i++) {
//            int a = edge[i][0];
//            int b = edge[i][1];
//
//            nodes[a][b] = 1;
//            nodes[b][a] = 1;
//        }
//    // 다익스트라 알고리즘
//
//        // 1번 노드로부터 최단 거리 저장용 리스트
//        int[] dist = new int[n + 1];
//        // 방문 배열
//        boolean[] visited = new boolean[n + 1];
//        // 현재 거리를 모르므로 Integer의 최대값으로 채움
//        Arrays.fill(dist, Integer.MAX_VALUE);
//        // 출발노드인 1번 노드와 사용하지 않는 0번 노드를 0으로 초기화
//        dist[0] = 0; dist[1] = 0;
//        visited[0] = true; visited[1] = true;
//
//
//        dijkstraDFS(nodes, dist, 1, visited);
//        dijkstraBFS(nodes, dist, 1, visited);
//        HashMap<Integer, Integer> countMap = new HashMap<>();
//        int max = 0;
//        // 1번 노드로부터 거리를 알아낸 노드들을 순서대로 Map에 담으면서 각 거리별로 몇개의 노드가 있는지 확인 + 최대 거리 확인
//        for(int i : dist) {
//            max = Math.max(i, max);
//            if(countMap.containsKey(i)) {
//                countMap.put(i, countMap.get(i) + 1);
//            } else {
//                countMap.put(i, 1);
//            }
//        }
//        return countMap.get(max);

        /* 설명.
         *  1. 구해야 하는 것: 1번 노드로 부터 가장 먼 노드의 개수
         *  2. 1을 구하기 위해 필요한 것: 1번 노드로 부터 각 노드로 가기 위한 최단 거리 (연결된 node 간의 거리는 1)
         *  3. BFS 사용 -> 최단 거리를 구해야한다.
         *  4. 어차피 간선에 대한 가중치가 없으므로 먼저 que에 담긴 경로가 더 가까움
         * */
        // edge를 배열로 펼치기
//        int[][] nodes = new int[n + 1][n + 1];
//        for(int i = 0; i < edge.length; i++) {
//            int node1 = edge[i][0];
//            int node2 = edge[i][1];
//
//            nodes[node1][node2] = 1;
//            nodes[node2][node1] = 1;
//        }
//
//
//        int[] dist = new int[n + 1]; // 1번 노드로 부터의 거리
//        boolean[] isVisit = new boolean[n + 1]; // 방문 확인 노드
//
//        // 존재하지 않는 0번 노드의 거리는 0으로 설정                -> 생성 기본값 사용
//        // 자기 자신과의 거리는 0이므로 1번 노드와의 거리는 0으로 설정  -> 생성 기본값 사용
//        // 나머지 노드와의 거리는 현재 모르므로 큰 값으로 설정         -> Integer.MAX_VALUE 사용
//        for(int i = 2; i <= n; i++) {
//            dist[i] = -1;
//        }
//
//        // 존재하지 않는 노드인 0번 노드 -> 방문할 일 없음 -> true로 설정
//        isVisit[0] = true;
//
//        Queue<Integer> q = new LinkedList<>();  // 거리를 확인할 노드를 담기 위함
//        int currNode = 1;                       // 현재 위치한 노드
//        q.offer(currNode);
//
//        isVisit[currNode] = true;
//        while(!q.isEmpty()) {
//            currNode = q.poll();
//            // 현재 방문한 Node를 방문 처리
//
//            for(int i = 1; i <= n; i++) {
//                // 아직 방문하지 않았고, 현재 노드로부터 경로가 있는 노드이면
//                if(!isVisit[i] && nodes[currNode][i] == 1) {
//                    // Queue에 담고, 거리 계산 실행
//                    q.offer(i);
//
//                    // 다음 위치와의 거리 = 현재 위치까지와의 거리 + 다음 위치까지와의 거리
//                    // 따로 가중치가 없으므로 '다음 위치까지와의 거리' 는 1
//                    dist[i] = dist[currNode] + 1;
//                    isVisit[i] = true;
//                }
//            }
//        }
//
//        int max = 0;
//        for (int i = 1; i <= n; i++) {
//            max = Math.max(dist[i], max);
//        }
//
//        int count = 0;
//        for(int d : dist) {
//            if(d == max) count++;
//        }
//
//        return count;

        /* 설명. 이전 단계 실패 원인 -> 메모리 초과 -> 연결되지 않는 간선은 표시 x -> 배열이 아닌 List로 필요한 요소만 남기기 */
        //
        List<Integer>[] graph = new ArrayList[n + 1];   // 그래프를 담을 변수
        for (int i = 1; i < n + 1; i++) {
            graph[i] = new ArrayList<>();
        }

        // edge를 graph로 옮기기
        for (int i = 0; i < edge.length; i++) {
            int node1 = edge[i][0];
            int node2 = edge[i][1];

            graph[node1].add(node2);
            graph[node2].add(node1);
        }

        int[] dist = new int[n + 1];            // 1번 좌표로 부터의 거리
        boolean[] isVisit = new boolean[n + 1]; // 방문 배열
        isVisit[0] = true;
        isVisit[1] = true;


        Queue<Integer> queue = new LinkedList<>();
        int currNode = 1;

        queue.add(1);
        while (!queue.isEmpty()) {
            int node = queue.poll();

            for (int i : graph[node]) {
                if (!isVisit[i]) {
                    queue.offer(i);
                    dist[i] = dist[node] + 1;
                    isVisit[i] = true;
                }
            }
        }

        int max = 0;
        for (int num : dist) {
            max = Math.max(max, num);
        }

        int count = 0;
        for (int num : dist) {
            if (num == max) count++;
        }
        return count;
    }

//    private static void dijkstraBFS(int[][] nodes, int[] dist, int currNode, boolean[] visited) {
//        Queue<Integer> queue = new LinkedList<>();
//        queue.offer(currNode);
//
//        while(!queue.isEmpty()) {
//            //하나 꺼내기
//            int node =queue.peek();
//            queue.poll();
//
//            for (int i = 2; i < dist.length; i++) {
//                if(!visited[i] && nodes[currNode][i] == 1) {
//                    queue.offer(i);
//                    visited[i] = true;
//                    dist[i] = Math.min(dist[i], dist[currNode] + 1);
//                }
//            }
//        }
//    }
//
//    // 다익스트라 알고리즘 구현
//    private static void dijkstraDFS(int[][] nodes, int[] dist, int currNode, boolean[] visited) {
//        for(int i = 2; i < dist.length; i++) {
//            if(!visited[i] && nodes[currNode][i] == 1) {
//                int temp = dist[currNode] + 1;
//                if(temp < dist[i]) {
//                    dist[i] = temp;
//                    visited[i] = true;
//                    dijkstraDFS(nodes, dist, i, visited);
//                    visited[i] = false;
//                }
//            }
//        }
//        System.out.println(Arrays.toString(dist));
//    }


    public static void main(String[] args) {
        int n;
        int[][] vertex;

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print("노드의 개수를 입력하시오: ");
            n = Integer.parseInt(br.readLine());

            System.out.print("간선의 개수를 입력하시오: ");
            int vRow = Integer.parseInt(br.readLine());
            vertex = new int[vRow][2];
            StringTokenizer st;
            for (int i = 0; i < vRow; i++) {
                st = new StringTokenizer(br.readLine());

                vertex[i][0] = Integer.parseInt(st.nextToken());
                vertex[i][1] = Integer.parseInt(st.nextToken());

            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        int answer = solution(n, vertex);
        System.out.println("정답: " + answer);

    }
}
