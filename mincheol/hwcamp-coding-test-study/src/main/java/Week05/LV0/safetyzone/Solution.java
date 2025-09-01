package Week05.LV0.safetyzone;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/*
 * 이름: 변민철
 * 날짜: 25. 08. 28.
 * 문제: https://school.programmers.co.kr/learn/courses/30/lessons/120866
 * */
public class Solution {
    static int[][] map;

    static int N;

    static int eight_dir_x;
    static int eight_dir_y;

    static int[] dir_vec_X = {0, 1, 1, 0, -1, -1, -1, 0, 1};
    static int[] dir_vec_Y = {0, 0, 1, 1, 1, 0, -1, -1, -1};

    static int count;
    static int result;

    static Queue<CurPosition> q = new LinkedList<>();

    static class CurPosition{
        int x;
        int y;

        public CurPosition(int x, int y){
            this.x = x;
            this.y = y;
        }
    }

    public static int solution(int[][] board) {
        int answer = 0;
        N = board.length;
        map = board;
        result = 0;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                bfs(j, i);
            }
        }

        answer = result;
        return answer;
    }

    private static void bfs(int x, int y) {
        q.offer(new CurPosition(x, y));                 //처음 방문한 위치 enque

        while (!q.isEmpty()) {
            CurPosition curPosition = q.poll();         //방문한 위치는 다시 deque.

            count = 0;

            for (int i = 0; i <= 8; i++) {
                eight_dir_x = curPosition.x + dir_vec_X[i];
                eight_dir_y = curPosition.y + dir_vec_Y[i];
                if (rangeCheck() && map[eight_dir_x][eight_dir_y] == 1) {
                    count++;
                }
            }
            if(count < 1 ) {
                result++;
            }
        }


    }

    private static boolean rangeCheck() {
        return eight_dir_x >= 0 && eight_dir_y >= 0 && eight_dir_x < N && eight_dir_y < N;
    }

}
/* 필기.
 *  왼쪽에서 오른쪽으로
 *  위에서 아래로
 *  상하좌우대각 모두 살피기
 *  1개 이상이면 (2개 있다고 2개 세면 안됨)
 *
* */
