package session2.y26_m04.week02.step13_04_p2751;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 문제: 수 정렬하기 2
 * 작성자: 이승건
 * 작성일: 26. 4. 6.
 * 문제 주소: https://www.acmicpc.net/problem/2751
 */

public class Main {
    public static void main(String[] args) {
        int n;
        int[] arr;

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            n = Integer.parseInt(br.readLine());

            arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(br.readLine());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // 임시 배열을 하나만 만들어서 재사용 (메모리 절약)
        int[] temp = new int[n];
        
        // 인덱스를 0부터 n-1까지로 호출 (마지막 인덱스)
        sort2pt(arr, temp, 0, n - 1);

        // 출력 형식 맞추기 (Arrays.toString은 []가 포함되므로 StringBuilder 사용)
        StringBuilder sb = new StringBuilder();
        for(int num : arr) {
            sb.append(num).append("\n");
        }
        System.out.println(sb.toString());
    }

    private static void sort2pt(int[] arr, int[] temp, int front, int back) {
        // 원소가 1개이거나 0개면 정렬할 필요 없음
        if (front >= back) {
            return;
        }

        int middle = (front + back) / 2;

        // 분할 (Divide)
        sort2pt(arr, temp, front, middle);      // 왼쪽 분할
        sort2pt(arr, temp, middle + 1, back); // 오른쪽 분할

        // 병합 (Merge)
        int cho1 = front;       // 왼쪽 배열의 시작 인덱스
        int cho2 = middle + 1;  // 오른쪽 배열의 시작 인덱스
        int idx = front;        // 임시 배열의 시작 인덱스

        // 두 배열을 비교하며 작은 값을 temp에 삽입
        while (cho1 <= middle && cho2 <= back) {
            if (arr[cho1] <= arr[cho2]) {
                temp[idx] = arr[cho1];
                cho1++;
            } else {
                temp[idx] = arr[cho2];
                cho2++;
            }
            idx++;
        }

        // 왼쪽 배열이 남은 경우
        while (cho1 <= middle) {
            temp[idx] = arr[cho1];
            idx++;
            cho1++;
        }

        // 오른쪽 배열이 남은 경우
        while (cho2 <= back) {
            temp[idx] = arr[cho2];
            idx++;
            cho2++;
        }

        // 정렬된 임시 배열(temp)의 결과를 원본 배열(arr)에 복사
        for (int i = front; i <= back; i++) {
            arr[i] = temp[i];
        }
    }
}
