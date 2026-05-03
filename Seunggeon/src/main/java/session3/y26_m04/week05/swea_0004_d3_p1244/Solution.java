package session3.y26_m04.week05.swea_0004_d3_p1244;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * 문제: 1244. [S/W 문제해결 응용] 2일차 - 최대 상금
 * 난이도: D3
 * 작성자: 이승건
 * 작성일: 26. 5. 3.
 * 문제 주소: https://swexpertacademy.com/main/code/problem/problemDetail.do?contestProbId=AV15Khn6AN0CFAYD&categoryId=AV15Khn6AN0CFAYD&categoryType=CODE&problemTitle=&orderBy=FIRST_REG_DATETIME&selectCodeLang=ALL&select-1=&pageSize=10&pageIndex=1
 */

public class Solution {
    static int resultMax;

    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("C:\\github\\full-commit\\coding-study\\Seunggeon\\src\\main\\java\\session3\\y26_m04\\week05\\swea_0004_d3_p1244\\res\\input.txt"));

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {
            String numStr = sc.next();
            int count = sc.nextInt();

            // 숫자의 자릿수가 최대 6자리이므로, 자리를 바꾸는 횟수가 문자열 길이를 넘어가면 시간 초과가 날 수 있습니다.
            // 자릿수만큼만 바꿔도 만들 수 있는 가장 큰 수를 충분히 만들 수 있습니다.
            if (count > numStr.length()) {
                count = numStr.length();
            }

            resultMax = 0;
            // 배열, 남은 교환 횟수, 그리고 중복 탐색을 줄이기 위해 현재 탐색할 시작 인덱스를 넘깁니다.
            findMaxNum(numStr.toCharArray(), count, 0);

            System.out.println("#" + test_case + " " + resultMax);
        }
    }

    private static void findMaxNum(char[] chars, int remainCount, int start) {
        if (remainCount == 0) {
            int currentNum = Integer.parseInt(String.valueOf(chars));
            resultMax = Math.max(resultMax, currentNum);
            return;
        }

        // i를 start부터 시작하여 불필요하게 이전 자리들끼리 다시 교환하는 것을 방지합니다.
        for (int i = start; i < chars.length - 1; i++) {
            for (int j = i + 1; j < chars.length; j++) {
                swap(chars, i, j);
                // i 위치의 숫자와 j 위치의 숫자를 바꿨으므로, 
                // 다음 재귀에서는 적어도 i 위치부터 다시 탐색하도록 start에 i를 넘겨줍니다.
                findMaxNum(chars, remainCount - 1, i);
                swap(chars, i, j);
            }
        }
    }

    private static void swap(char[] chars, int i, int j) {
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }
}
