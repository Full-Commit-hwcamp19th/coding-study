package session3.y26_m05.week03.swea_0020_d1_p2058;

import java.io.FileInputStream;
import java.util.Scanner;

/**
 * 문제: 2058. 자릿수 더하기
 * 난이도: D1
 * 작성자: 이승건
 * 작성일: 26. 5. 19.
 * 문제 주소: https://swexpertacademy.com/main/code/problem/problemDetail.do?contestProbId=AV5QPRjqA10DFAUq&categoryId=AV5QPRjqA10DFAUq&categoryType=CODE&problemTitle=&orderBy=FIRST_REG_DATETIME&selectCodeLang=ALL&select-1=&pageSize=10&pageIndex=1
 */

public class Solution {
    public static void main(String[] args) throws Exception {
        System.setIn(new FileInputStream("./src/main/java/session3/y26_m05/week03/swea_0020_d1_p2058/res/input.txt"));

		/*
		   표준입력 System.in 으로부터 스캐너를 만들어 데이터를 읽어옵니다.
		 */
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int sum = 0;
        while (num > 0) {
            sum += (num % 10);
            num /= 10;
        }
        System.out.println(sum);
    }
}
