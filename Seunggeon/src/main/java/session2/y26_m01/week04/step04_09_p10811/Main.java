package session2.y26_m01.week04.step04_09_p10811;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * 문제: 바구니 뒤집기
 * 작성자: 이승건
 * 작성일: 26. 1. 26.
 * 문제 주소: https://www.acmicpc.net/problem/10811
 */

public class Main {
    
    
    
    public static void main(String[] args) {
        int[] arr;
        
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            arr = new int[n];

            for(int i = 0; i < n; i++) {
                arr[i] = i + 1;
            }

            for (int i = 0; i < m; i++) {
                st = new StringTokenizer(br.readLine());
                
                int start = Integer.parseInt(st.nextToken());
                int end = Integer.parseInt(st.nextToken());
                
                reverse(arr, start, end);            
            }

            System.out.println(Arrays.toString(arr).replace("[","").replace("]","").replace(",",""));
            
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    private static void reverse(int[] arr, int start, int end) {

        int[] temp = arr.clone();

        int j = end-1;

        for (int i = start-1; i < end; i++) {
            arr[i] = temp[j];
            j--;
        }
    }
}
