package week05.lv0;

/*
 * 이름: 이승건
 * 날짜: 25. 8. 27.
 * 문제: https://school.programmers.co.kr/learn/courses/30/lessons/120585
* */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.stream.IntStream;

public class APersonTallerThanMusk {
    public static int solution(int[] array, int height) {
        return (int)Arrays.stream(array).filter(x -> x > height).count();
    }

    public static int solution2(int[] array, int height) {
        int count = 0;
        for(int p : array) {
            if(p > height) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String str;
        int[] array;
        int height;
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print("반 친구들의 키를 입력하세요(공백을 통해 구분): ");
            StringTokenizer st = new StringTokenizer(br.readLine());
            array = new int[st.countTokens()];
            for(int i =0; i < array.length; i++) {
                array[i] = Integer.parseInt(st.nextToken());
            }
            System.out.print("머쓱이의 키를 입력하세요: ");
            height = Integer.parseInt(br.readLine());

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        int answer = solution(array, height);       // stream을 이용한 풀이
        int answer2 = solution2(array, height);     // for문을 통한 풀이
        System.out.println(answer); 
        System.out.println(answer2);


    }
}
