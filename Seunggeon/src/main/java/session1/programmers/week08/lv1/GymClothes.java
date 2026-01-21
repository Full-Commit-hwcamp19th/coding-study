package programmers.week08.lv1;

/*
 * 이름: 이승건
 * 날짜: 25. 10. 13.
 * 문제: https://school.programmers.co.kr/learn/courses/30/lessons/42862
* */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class GymClothes {
    private static int solution(int n, int[] lost, int[] reserve) {
        Set<Integer> lostSet = new HashSet<>();
        Set<Integer> reserveSet = new HashSet<>();

        Arrays.stream(lost).forEach(lostSet::add);
        Arrays.stream(reserve).forEach(reserveSet::add);

        Set<Integer> lostSetClone = new HashSet<>(lostSet);

        lostSet.removeAll(reserveSet);
        reserveSet.removeAll(lostSetClone);

        int answer = n - lostSet.size();

        int pointer = 0;
        int temp = 0;
        for(int l : lostSet) {
            for(int r : reserveSet) {
                if(Math.abs(r - l) == 1) {
                    answer++;
                    temp = r;
                    break;
                }
            }
            reserveSet.remove(temp);
        }
        return answer;
    }

    public static void main(String[] args) {
        int n;
        int[] lost;
        int[] reserve;

        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print("enter n: ");
            n = Integer.parseInt(br.readLine());

            System.out.print("enter lost: ");
            StringTokenizer st = new StringTokenizer(br.readLine());
            lost = new int[st.countTokens()];
            for (int i = 0; i < lost.length; i++) {
                lost[i] = Integer.parseInt(st.nextToken());
            }

            System.out.print("enter reserve: ");
            st = new StringTokenizer(br.readLine());
            reserve = new int[st.countTokens()];
            for(int i = 0; i < reserve.length; i++){
                reserve[i] = Integer.parseInt(st.nextToken());
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        int answer = solution(n, lost, reserve);
        System.out.println("정답: " + answer);
    }
}
