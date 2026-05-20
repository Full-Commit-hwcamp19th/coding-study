package session3.y26_m05.week03.swea_0021_d5_p1247;

import java.io.FileInputStream;
import java.util.Scanner;

/**
 * 문제: 1247. [S/W 문제해결 응용] 3일차 - 최적 경로
 * 난이도: D5
 * 작성자: 이승건
 * 작성일: 26. 5. 20.
 * 문제 주소: https://swexpertacademy.com/main/code/problem/problemDetail.do?contestProbId=AV15OZ4qAPICFAYD&categoryId=AV15OZ4qAPICFAYD&categoryType=CODE&problemTitle=&orderBy=FIRST_REG_DATETIME&selectCodeLang=ALL&select-1=&pageSize=10&pageIndex=1
 */

public class Solution {
    static int N;
    static Point company, home;
    static Point[] customers;
    static boolean[] visited;
    static int minDistance;

    public static void main(String[] args) throws Exception{
        System.setIn(new FileInputStream("./src/main/java/session3/y26_m05/week03/swea_0021_d5_p1247/res/input.txt"));

		/*
		   표준입력 System.in 으로부터 스캐너를 만들어 데이터를 읽어옵니다.
		 */
        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();
		/*
		   여러 개의 테스트 케이스가 주어지므로, 각각을 처리합니다.
		*/

        for(int test_case = 1; test_case <= T; test_case++) {
            N = sc.nextInt();

            company = new Point(sc.nextInt(), sc.nextInt());
            home = new Point(sc.nextInt(), sc.nextInt());
            customers = new Point[N];
            for (int i = 0; i < N; i++) {
                customers[i] = new Point(sc.nextInt(), sc.nextInt());
            }

            visited = new boolean[N];
            minDistance = Integer.MAX_VALUE;

            dfs(company, 0, 0);

            System.out.println("#" + test_case + " " + minDistance);

        }
    }

    static class Point {
        int x, y;
        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    private static void dfs(Point currentPos, int count, int distance) {
        // 가지치기: 현재 거리가 min을 넘어서면 더이상 할필요 X
        if (distance >= minDistance) {
            return;
        }

        // 종료: 모든 고객을 방문한 경우
        if (count == N) {
            // 현재 위치(마지막 고객)에서 집까지의 거리를 더해서 최종 거리 계산
            int finalDistance = distance + calculateDistance(currentPos, home);
            minDistance = Math.min(minDistance, finalDistance);
            return;
        }

        // 다음 고객 찾기
        for (int i = 0; i < N; i++) {
            if(!visited[i]) {
                visited[i] = true;
                int newDistance = distance + calculateDistance(currentPos, customers[i]);
                dfs(customers[i], count + 1, newDistance);
                visited[i] = false;
            }
        }
    }

    private static int calculateDistance (Point p1, Point p2) {
        return Math.abs(p1.x - p2.x) + Math.abs(p1.y - p2.y);
    }

}
