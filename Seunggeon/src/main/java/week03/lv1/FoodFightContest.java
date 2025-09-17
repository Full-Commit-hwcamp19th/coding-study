package week03.lv1;
/*
 * 이름: 이승건
 * 날짜: 25. 8. 18.
 * 문제: https://school.programmers.co.kr/learn/courses/30/lessons/134240
* */

import java.io.*;
import java.util.StringTokenizer;

public class FoodFightContest {


    private static String solution(int[] food) {
        String answer = "";

        int foodCount = 1;
        // 음식 짝수로 맞춰주기(0번(물) 제외)
        for (int i = 1; i < food.length; i++) {
            if(food[i] % 2 == 1) food[i] -= 1;
            foodCount += food[i];
        }

        for(int i = 1; i < food.length; i++){
            for(int j = 0; j < food[i]/2; j++){
                answer += i;
            }
        }
        answer += 0;
        for(int i = food.length-1; i > 0; i--){
            for(int j = 0; j < food[i]/2; j++){
                answer += i;
            }
        }
        return answer;
    }

    // 다른 사람 풀이 - builder를 사용해 메모리 아끼기(String은 불변 객체이기 때문에 내 방식대로 하면 메모리 사용량이 높다.)
    private static String solution2(int[] food) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < food.length; i++) {
            sb.append(Integer.valueOf(i).toString().repeat(food[i]/2));
        }
        return sb.toString() + 0 + sb.reverse().toString();
    }

    public static void main(String[] args) {
        String str;

        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            str = br.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        StringTokenizer st = new StringTokenizer(str);
        int[] arr = new int[st.countTokens()];
        int count = 0;
        while(st.hasMoreTokens()){
            arr[count] = Integer.parseInt(st.nextToken());
            count++;
        }
        String answer = solution(arr);

        try(BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))){
            bw.write(answer);
            bw.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
