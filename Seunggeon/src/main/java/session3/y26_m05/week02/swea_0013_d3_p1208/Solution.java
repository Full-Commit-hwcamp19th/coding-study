package session3.y26_m05.week02.swea_0013_d3_p1208;

import java.io.FileInputStream;
import java.util.Scanner;
import java.util.Arrays;

/**
 * 문제: 1208. [S/W 문제해결 기본] 1일차 - Flatten
 * 난이도: D3
 * 작성자: 이승건
 * 작성일: 26. 5. 12.
 * 문제 주소: https://swexpertacademy.com/main/code/problem/problemDetail.do?contestProbId=AV139KOaABgCFAYh&categoryId=AV139KOaABgCFAYh&categoryType=CODE&problemTitle=&orderBy=FIRST_REG_DATETIME&selectCodeLang=ALL&select-1=&pageSize=10&pageIndex=1
 */

public class Solution {
    public static void main(String[] args) throws Exception {
        System.setIn(new FileInputStream(".\\src\\main\\java\\session3\\y26_m05\\week02\\swea_0013_d3_p1208\\res\\input.txt"));

        Scanner sc = new Scanner(System.in);

        for(int test_case = 1; test_case <= 10; test_case++)
        {
            int dump = sc.nextInt();
            int[] arr = new int[100];

            for (int i = 0; i < 100; i++) {
                arr[i] = sc.nextInt();
            }

            for (int i = 0; i < dump; i++) {
                // 매 덤프마다 정렬을 하면 가장 낮은 곳은 arr[0], 가장 높은 곳은 arr[99]가 됩니다.
                Arrays.sort(arr);
                
                // 최고점과 최저점의 차이가 1 이하라면 더 이상 평탄화할 필요가 없음
                if (arr[99] - arr[0] <= 1) {
                    break;
                }

                // 덤프: 최고점에서 1을 빼고 최저점에 1을 더함
                arr[99]--;
                arr[0]++;
            }

            // 모든 덤프가 끝난 후, 최종적인 최고점과 최저점의 차이를 구하기 위해 한 번 더 정렬
            Arrays.sort(arr);

            System.out.println("#" + test_case + " " + (arr[99] - arr[0]));
        }
    }
}
