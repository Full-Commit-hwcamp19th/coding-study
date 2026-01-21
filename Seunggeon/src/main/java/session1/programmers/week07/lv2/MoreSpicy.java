package programmers.week07.lv2;

/*
 * 이름: 이승건
 * 날짜: 25. 9. 16.
 * 문제: https://school.programmers.co.kr/learn/courses/30/lessons/42626
* */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class MoreSpicy {

    private static int solution(int[] scoville, int K) {
        int answer = 0;

        //섞은 음식의 스코빌 지수 =
        //  가장 맵지 않은 음식의 스코빌 지수
        //  + (두 번째로 맵지 않은 음식의 스코빌 지수 * 2)
        PriorityQueue<Integer> pQ = new PriorityQueue<>();
        for(int i = 0; i < scoville.length; i++){
            pQ.offer(scoville[i]);
        }

        int minScoville;
        int min2Scoville;
        int newScoville;
        while (pQ.size() > 1) {
            // 가장 작은 값 뽑아서
            minScoville = pQ.poll();
            // K보다 크다면 반복 종료 아니면 계속 반복
            if(minScoville >= K) {
                break;
            }
            min2Scoville = pQ.poll();
            newScoville = minScoville + (min2Scoville * 2);

            answer++;
            pQ.offer(newScoville);

        }

        if(pQ.peek() < K) {
            answer = -1;
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] scoville;
        int K;

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print("스코빌 배열 입력: ");
            StringTokenizer st = new StringTokenizer(br.readLine());
            scoville = new int[st.countTokens()];

            for (int i = 0; i < scoville.length; i++) {
                scoville[i] = Integer.parseInt(st.nextToken());
            }

            System.out.print("K 입력: ");
            K = Integer.parseInt(br.readLine());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        int answer =  solution(scoville, K);
        System.out.println("정답: " + answer);
    }
}
