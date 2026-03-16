package session2.y26_m03.week02.step10_08_p14215;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 문제: 세 막대
 * 작성자: 이승건
 * 작성일: 26. 3. 11.
 * 문제 주소: https://www.acmicpc.net/problem/14215
 */


public class Main {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int[] nums = new int[3];

            StringTokenizer st = new StringTokenizer(br.readLine());

            int max = 0;
            int sum = 0;

            for (int i = 0; i < 3; i++) {
                nums[i] = Integer.parseInt(st.nextToken());
                sum += nums[i];
                if (max < nums[i]) {
                    max = nums[i];
                }
            }
            sum -= max;

            while (max >= sum) {
                max --;
            }

            System.out.println(sum + max);


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
