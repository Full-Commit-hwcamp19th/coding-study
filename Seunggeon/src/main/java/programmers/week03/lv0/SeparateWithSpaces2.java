package programmers.week03.lv0;

/*
 * 이름: 이승건
 * 날짜: 25. 8. 18.
 * 문제: https://school.programmers.co.kr/learn/courses/30/lessons/181868
* */

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class SeparateWithSpaces2 {

    private static String[] solution(String my_string) {
        StringTokenizer st = new StringTokenizer(my_string);
        String[] answer = new String[st.countTokens()];
        int count = 0;
        while(st.hasMoreTokens()){
            answer[count] = st.nextToken();
            count++;
        }

        return answer;
    }

    // 다른 사람 풀이 -> split에 정규 표현식 사용
    // \\s+ : 모든 종류의 정규표현식이 1번 이상 반복
    // [ ]+ : ' '이 한번 이상 반복
    private static String[] solution2(String my_string) {
        return my_string.trim().split("\\s+");
//        return my_string.trim().split("[ ]+");
    }

    public static void main(String[] args) {
        String str;
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            str = br.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        String[] answer = solution(str);

        try(BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))){
            bw.write(Arrays.toString(answer));
            bw.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
