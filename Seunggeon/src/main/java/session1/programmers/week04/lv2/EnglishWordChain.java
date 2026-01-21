package programmers.week04.lv2;

/*
 * 이름: 이승건
 * 날짜: 25. 8. 23.
 * 문제: https://school.programmers.co.kr/learn/courses/30/lessons/12981
* */

import java.io.*;
import java.util.*;

public class EnglishWordChain {

    private static int[] solution(int n, String[] words) {
        int[] answer = {0, 0};

        /* 설명.
         *  종료 조건
         *  1. 끝말잇기가 안되는 경우
         *  2. 사용했던 단어의 재사용 -> map을 이용
        * */

        Map<String, Boolean> wordMap = new HashMap<String, Boolean>();  // 사용한 단어 기록

        char lastChar = '\u0000';


        for(int i = 0; i < words.length; i++) {
            // 처음이 아닌 경우
            if(lastChar != '\u0000') {
                // 이전 단어의 끝 문자로 시작하는 것이 아니라면
                if(!words[i].startsWith(lastChar + "")) {
                    answer[0] = (i % n) + 1;
                    answer[1] = (i / n) + 1;
                    break;
                }
            }
            //있으면 했던 단어를 다시 사용한거이므로 종료
            if(wordMap.getOrDefault(words[i], false)) {
                answer[0] = (i % n) + 1;
                answer[1] = (i / n) + 1;
                break;
            } else {
                wordMap.put(words[i], true);
            }
            lastChar = words[i].charAt(words[i].length() - 1);  // 단어의 마지막 문자 저장
        }

        return answer;
    }

    private static int[] solution2(int n, String[] words) {
        int[] answer = {0, 0};
        Set<String> wordSet = new HashSet<String>();    // 사용한 단어 기록
                                                        // Map<String, Boolean> -> Set<String>으로 변경: 저장할 데이터의 양을 줄임
        char lastChar = '\u0000';


        for(int i = 0; i < words.length; i++) {
            // 처음이 아닌 경우
            if(lastChar != '\u0000') {
                // 이전 단어의 끝 문자로 시작하는 것이 아니라면
                if(words[i].charAt(0) != lastChar) {    //startsWith을 charAt로 꺼내와 비교하는 것으로 변경
                    answer[0] = (i % n) + 1;
                    answer[1] = (i / n) + 1;
                    break;
                }
            }
            //있으면 했던 단어를 다시 사용한거이므로 종료
//            if(wordMap.getOrDefault(words[i], false)) {
            if(wordSet.contains(words[i])) {
                answer[0] = (i % n) + 1;
                answer[1] = (i / n) + 1;
                break;
            } else {
                wordSet.add(words[i]);
            }
            lastChar = words[i].charAt(words[i].length() - 1);  // 단어의 마지막 문자 저장
        }

        return answer;
    }
    public static void main(String[] args) {

        String str;
        int n;
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
            bw.write("인원을 입력하세요: ");
            bw.flush();

            str = br.readLine();
            n = Integer.parseInt(str);
            bw.write("끝말이기 단어를 입력하세요(공백으로 단어 구분): ");
            bw.flush();

            str = br.readLine();
            String[] words = str.split(" ");

            int[] answer = solution(n, words);

            bw.write("정답: " + Arrays.toString(answer));
            bw.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
