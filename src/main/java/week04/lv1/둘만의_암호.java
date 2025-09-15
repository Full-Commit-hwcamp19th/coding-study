package main.java.week04.lv1;

public class 둘만의_암호 {
    /*
     * 이름: 최혜원
     * 날짜: 2025.08.25
     * 문제: https://school.programmers.co.kr/learn/courses/30/lessons/155652
     * */
    public String solution(String s, String skip, int index) {
        int[] sArr = new int[s.length()];
        int[] skipArr = new int[skip.length()];

        // s → int 배열로
        for (int i = 0; i < s.length(); i++) {
            sArr[i] = s.charAt(i);
        }
        // skip → int 배열로
        for (int i = 0; i < skip.length(); i++) {
            skipArr[i] = skip.charAt(i);
        }

        // 변환 시작
        for (int v = 0; v < sArr.length; v++) {
            int count = 0;
            while (count < index) {
                sArr[v]++;
                if (sArr[v] > 'z') sArr[v] = 'a';  // z 넘어가면 a로

                boolean isSkip = false;
                for (int j = 0; j < skipArr.length; j++) {
                    if (sArr[v] == skipArr[j]) {
                        isSkip = true;
                        break;
                    }
                }
                if (!isSkip) count++;  // skip 문자 아니면 count 증가
            }
        }

        // 다시 문자열로 변환
        StringBuilder answer = new StringBuilder();
        for (int v : sArr) answer.append((char) v);

        return answer.toString();

    }
}
