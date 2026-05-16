package session3.y26_m05.week02.swea_0015_d2_p1928;

import java.io.FileInputStream;
import java.util.Scanner;

/**
 * 문제: 1928. Base64 Decoder
 * 난이도: D2
 * 작성자: 이승건
 * 작성일: 26. 5. 14.
 * 문제 주소: https://swexpertacademy.com/main/code/problem/problemDetail.do?contestProbId=AV5PR4DKAG0DFAUq&categoryId=AV5PR4DKAG0DFAUq&categoryType=CODE&problemTitle=&orderBy=FIRST_REG_DATETIME&selectCodeLang=ALL&select-1=&pageSize=10&pageIndex=1
 */

public class Solution {
    public static void main(String[] args) throws Exception {
        System.setIn(new FileInputStream(".\\src\\main\\java\\session3\\y26_m05\\week02\\swea_0015_d2_p1928\\res\\input.txt"));

		/*
		   표준입력 System.in 으로부터 스캐너를 만들어 데이터를 읽어옵니다.
		 */
        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();
		/*
		   여러 개의 테스트 케이스가 주어지므로, 각각을 처리합니다.
		*/

        String base64 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/";

        for(int test_case = 1; test_case <= T; test_case++)
        {
            StringBuilder sb = new StringBuilder("#" + test_case + " ");

            String str = sc.next();
            int sum = 0;
            for (int i = 0; i < str.length(); i++) {
                int temp = base64.indexOf(str.charAt(i));
                sum = sum << 6;
                sum = sum | temp;

                if (i % 4 == 3) {
                    char c1 = (char) ((sum>>16) & 0xff);
                    char c2 = (char) ((sum>>8) & 0xff);
                    char c3 = (char) (sum & 0xff);
                    sb.append(c1).append(c2).append(c3);
                    sum = 0;
                }
            }
            System.out.println(sb.toString());
        }
    }
}
