package programmers.week07.lv3;

/*
 * 이름: 이승건
 * 날짜: 25. 9. 16.
 * 문제: https://school.programmers.co.kr/learn/courses/30/lessons/42861
* */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class IslandConnector {
    private static int solution(int n, int[][] costs) {

        // 가중치 선을 우선순위 큐에 담기
        // 우선순위를 담은 배열의 3번째 인자(다리 길이)로 설정
        PriorityQueue<int[]> pQ = new PriorityQueue<>((a, b) -> a[2] - b[2]);
        for (int i = 0; i < costs.length; i++) {
            pQ.offer(costs[i]);
        }

        // 연결된 노드는 동일 값을 부여해서 연결 여부를 확인
        int[] isLand = new int[n];
        for (int i = 0; i < n; i++) {
            isLand[i] = -1;
        }
        int length = 0;

        int[] cost = new int[3];    // 우선순위 큐에서 뽑아서 담을 공간
        int firstLand;  // 섬1
        int secondLand; // 섬2

        int count = 0;  // isLand에 부여할 번호
        while (!pQ.isEmpty()) {
            cost = pQ.poll();
//            System.out.println("cost[0]: " + cost[0] + " cost[1]: " + cost[1] + " cost[2]: " + cost[2]);

            firstLand = cost[0];
            secondLand = cost[1];

            // 둘 중 하나라도 아무 연결이 없으면
            if (isLand[firstLand] == -1 || isLand[secondLand] == -1) {
                if (isLand[firstLand] != -1) {
                    isLand[secondLand] = isLand[firstLand];
                } else if (isLand[secondLand] != -1) {
                    isLand[firstLand] = isLand[secondLand];
                } else {
                    isLand[firstLand] = count;
                    isLand[secondLand] = count;
                    count++;
                }
                length += cost[2];
            } else if (isLand[firstLand] != isLand[secondLand]) {
                int temp = isLand[secondLand];
                for (int i = 0; i < n; i++) {
                    if (isLand[i] == temp) {
                        isLand[i] = isLand[firstLand];
                    }
                }
                length += cost[2];
            }
//            System.out.println("isLand: " + Arrays.toString(isLand));
            System.out.println();

            int temp = isLand[0];
            boolean flag = false;
            for(int i = 1; i < n; i++){
                if(isLand[i] != temp) {
                    flag = true;
                    break;
                }
            }
            if(!flag) {
                break;
            }

        }

        return length;
    }

    private static int solution2(int n, int[][] costs) {
        // 가중치 선을 우선순위 큐에 담기
        // 우선순위를 담은 배열의 3번째 인자(다리 건설 비용)로 설정
        PriorityQueue<int[]> pQ = new PriorityQueue<>((a, b) -> a[2] - b[2]);
        for (int i = 0; i < costs.length; i++) {
            pQ.offer(costs[i]);
        }

        // 연결된 노드는 동일 값을 부여해서 연결 여부를 확인
        int[] isLand = new int[n];
        for (int i = 0; i < n; i++) {
            isLand[i] = i;
        }
        int length = 0;

        int[] cost = new int[3];    // 우선순위 큐에서 뽑아서 담을 공간
        int firstLand;  // 섬1
        int secondLand; // 섬2

        while (!pQ.isEmpty()) {
            cost = pQ.poll();
//            System.out.println("cost[0]: " + cost[0] + " cost[1]: " + cost[1] + " cost[2]: " + cost[2]);

            firstLand = cost[0];
            secondLand = cost[1];

            // 두개의 연결 번호가 다르면
            if (isLand[firstLand] != isLand[secondLand]) {
                int temp = isLand[secondLand];
                for (int i = 0; i < n; i++) {
                    // 한쪽의 번호로 통일 - 이때 secondLand와 동일한 연결 번호를 가지고 있는 다른 섬들도 변경
                    if (isLand[i] == temp) {
                        isLand[i] = isLand[firstLand];
                    }
                }
                // 연결을 했으므로 length에 비용을 더함
                length += cost[2];
            }
//            System.out.println("isLand: " + Arrays.toString(isLand));
            System.out.println();

            int temp = isLand[0];
            boolean flag = false;
            for(int i = 1; i < n; i++){
                if(isLand[i] != temp) {
                    flag = true;
                    break;
                }
            }
            if(!flag) {
                break;
            }
        }
        return length;
    }

    // 기존의 풀이는 탐색에 시간이 너무 오래 걸림 -> 비효율적
    // chatGPT 풀이
    static int[] parent;
    private static int solution3(int n, int[][] costs) {
        PriorityQueue<int[]> pQ = new PriorityQueue<>((a, b) -> a[2] - b[2]);
        for (int i = 0; i < costs.length; i++) {
            pQ.offer(costs[i]);
        }

        parent = new int[n];
        for(int i = 0; i < n; i++) {
            parent[i] = i;
        }
        int totalCost = 0;

        while(!pQ.isEmpty()) {
            int[] cost =  pQ.poll();
            if(find(cost[0]) !=  find(cost[1])) {
                union(cost[0],cost[1]);
                totalCost += cost[2];
            }
        }
        return totalCost;
    }

    // find: x가 속한 집합의 루트 찾기 + 경로 압축
    // 상위의 부모가 있으면 해당 부모 가져오기
    static int find(int x) {
        if(parent[x] == x) return x;
        return parent[x] = find(parent[x]);
    }
    // 집합 합치기
    static void union(int a, int b) {
        int rootA = find(a);
        int rootB = find(b);
        if(rootA != rootB) {
            parent[rootB] = rootA;
        }
    }

    public static void main(String[] args) {

        int n;
        int[][] costs;

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print("섬의 개수를 입력하세요: ");
            n = Integer.parseInt(br.readLine());

            System.out.print("섬 연결의 비용을 입력하세요: ");
            StringTokenizer st = new StringTokenizer(br.readLine());

            costs = new int[st.countTokens() / 3][3];
            for (int i = 0; i < costs.length; i++) {
                costs[i][0] = Integer.parseInt(st.nextToken());
                costs[i][1] = Integer.parseInt(st.nextToken());
                costs[i][2] = Integer.parseInt(st.nextToken());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        int answer = solution(n, costs);
        System.out.println("정답: " + answer);
    }
}
