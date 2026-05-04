package session3.y26_m05.week01.swea_0005_d2_p1954;

import java.io.FileInputStream;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 문제: 1954. 달팽이 숫자
 * 난이도: D2
 * 작성자: 이승건
 * 작성일: 26. 5. 4.
 * 문제 주소: https://swexpertacademy.com/main/code/problem/problemDetail.do?contestProbId=AV5PobmqAPoDFAUq&categoryId=AV5PobmqAPoDFAUq&categoryType=CODE&problemTitle=&orderBy=FIRST_REG_DATETIME&selectCodeLang=ALL&select-1=&pageSize=10&pageIndex=1
 */

public class Solution {
    public static void main(String args[]) throws Exception {
		/*
		   아래의 메소드 호출은 앞으로 표준 입력(키보드) 대신 input.txt 파일로부터 읽어오겠다는 의미의 코드입니다.
		   여러분이 작성한 코드를 테스트 할 때, 편의를 위해서 input.txt에 입력을 저장한 후,
		   이 코드를 프로그램의 처음 부분에 추가하면 이후 입력을 수행할 때 표준 입력 대신 파일로부터 입력을 받아올 수 있습니다.
		   따라서 테스트를 수행할 때에는 아래 주석을 지우고 이 메소드를 사용하셔도 좋습니다.
		   단, 채점을 위해 코드를 제출하실 때에는 반드시 이 메소드를 지우거나 주석 처리 하셔야 합니다.
		 */
        System.setIn(new FileInputStream(".\\src\\main\\java\\session3\\y26_m05\\week01\\swea_0005_d2_p1954\\res\\input.txt"));

		/*
		   표준입력 System.in 으로부터 스캐너를 만들어 데이터를 읽어옵니다.
		 */
        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();
		/*
		   여러 개의 테스트 케이스가 주어지므로, 각각을 처리합니다.
		*/

        for(int test_case = 1; test_case <= T; test_case++)
        {
            int n = sc.nextInt();
            int[][] arr = new int[n][n];

            int x = 0;
            int y = 0;

            int dx = 1;
            int dy = 0;

            for (int i = 1; i <= Math.pow(n, 2); i++) {
                arr[y][x] = i;

                int nx = x + dx;
                int ny = y + dy;

                if (nx < 0 || nx >= n || ny < 0 || ny >= n || arr[ny][nx] != 0) {
                    if (dx == 1) {
                        dx = 0;
                        dy = 1;
                    } else if (dy == 1) {
                        dx = -1;
                        dy = 0;
                    } else if (dx == -1) {
                        dx = 0;
                        dy = -1;
                    } else if (dy == -1) {
                        dx = 1;
                        dy = 0;
                    }
                }

                x += dx;
                y += dy;
            }
            
            System.out.println("#" + test_case);
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }



        }
    }
}
