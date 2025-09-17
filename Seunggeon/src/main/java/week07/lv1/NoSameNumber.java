package week07.lv1;

/*
 * 이름: 이승건
 * 날짜: 25. 9. 14.
 * 문제: https://school.programmers.co.kr/learn/courses/30/lessons/12906
 * */


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class NoSameNumber {

    private static int[] solution(int[] arr) {
        
        /* 설명.
         *  배열의 값을 순서대로 큐에 담는다.
         *  담을 때 담는 값을 temp 배열에 저장
         *  이 후, temp와 같은 값인 경우 무시
        * */
        Queue<Integer> que = new LinkedList<>();
        
        int temp = arr[0];
        que.offer(temp);

        for(int i = 1; i < arr.length; i++) {
            if(arr[i] == temp) {
                continue;
            } else {
                temp = arr[i];
                que.offer(temp);
            }
        }

        int[] answer = new int[que.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = que.poll();
        }

        return answer;
    }

    public static void main(String[] args) {

        int[] arr;

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print("배열 입력: ");
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr = new int[st.countTokens()];

            for(int i = 0; i < arr.length; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        int[] answer = solution(arr);

        System.out.println("정답: " + answer);
    }
}
