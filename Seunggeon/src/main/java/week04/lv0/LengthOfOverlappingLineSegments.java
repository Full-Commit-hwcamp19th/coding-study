package week04.lv0;

/*
 * 이름: 이승건
 * 날짜: 25. 8. 26.
 * 문제: https://school.programmers.co.kr/learn/courses/30/lessons/120876
 * */

import java.io.*;
import java.util.*;

public class LengthOfOverlappingLineSegments {
    private static int solution(int[][] lines) {
        int answer = 0;
        int n = lines.length;

        /* 설명.
         *  겹치는 구간(여러번 겹치는 구간은 한번만 취급) 길이 구하기
         *  1. 오름차순 정렬 -> 선분의 시작 위치가 작은 것이 먼저오도록 만듬
         *  2. i 번째의 endPoint와 j 번째의 startPoint를 비교(lines[i].end > lines[j].start (i < j) -> 겹친다.)
         *  3. i 번재의 endPoint와 j 번째의 endPoint를 비교 (lines[i]. end > lines[j].end (i < j) -> true: 겹치는 구간: [lines[j].start, lines[j].end]
         *                                                                                    -> false: 겹치는 구간: [lines[j].start, lines[i].end]
         *  4. 겹치는 구간을 boolean Map 표시(ex: Key 0: [0,1], Key 1: [1,2], Key n: [n, n+1], ...) (그런데 이러면 음수인 경우는 어쩌지?)
         *  5. 4에서 표시한 배열에서 true의 개수를 세서 반환
        * */
        HashMap<Integer, Boolean> sections = new HashMap<Integer, Boolean>();
        Arrays.sort(lines, (a, b) -> a[0] - b[0]);
        List<int[]> list = new ArrayList<int[]>();
        for(int i = 0; i < n - 1; i++) {
            for(int j = i + 1; j < n; j++) {
                if(lines[i][1] > lines[j][0]) {
                    int[] iArr =  new int[2];
//                    System.out.println(Arrays.toString(lines[i]));
//                    System.out.println(Arrays.toString(lines[j]));
                    if(lines[i][1] > lines[j][1]) {
//                        System.out.println("1");
                        iArr[0] = lines[j][0];
                        iArr[1] = lines[j][1];
                    } else {
//                        System.out.println("2");
                        iArr[0] = lines[j][0];
                        iArr[1] = lines[i][1];
                    }
//                    System.out.println("넣는 값: " + Arrays.toString(iArr));
                    list.add(iArr);
                }
            }
        }
//        System.out.println(list.get(0));
//        System.out.println(list.get(1));
//        System.out.println(list.get(2));
//        System.out.println(Arrays.toString(list.get(0)));
//        System.out.println(Arrays.toString(list.get(1)));
//        System.out.println(Arrays.toString(list.get(2)));

        for(int[] section : list) {
            for (int i = section[0]; i < section[1] ; i++) {
                sections.put(i, true);
            }
        }
        answer = (int) sections.entrySet().stream()
                .filter(key -> key.getValue() == true)
                .count();


        return answer;
    }

    private static int solution2(int[][] lines) {
        int answer = 0;

        Map<Integer, Integer> sections = new HashMap<>();
        int min;
        int max;
        for(int[] line : lines) {
            min = Math.min(line[0], line[1]);
            max = Math.max(line[0], line[1]);

            for(int i = min; i < max; i++) {
                sections.put(i, sections.getOrDefault(i, 0) + 1);
            }
        }
        System.out.println(sections);
        answer = (int) sections.entrySet().stream()
                .filter(key -> key.getValue() >= 2)
                .count();

        return answer;
    }

    public static void main(String[] args) {
        String str;
        int[][] line;
        int n;
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print("Enter number of lines: " );
            str = br.readLine();
            n = Integer.parseInt(str);

            line = new int[n][2];
            for(int i = 0; i < n; i++) {
                System.out.print("Enter line[" + (i + 1) + "]: ");
                str = br.readLine();
                StringTokenizer st = new StringTokenizer(str);
                line[i][0] =  Integer.parseInt(st.nextToken());
                line[i][1] =  Integer.parseInt(st.nextToken());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        int answer = solution2(line);

        try(BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
            bw.write(Integer.valueOf(answer).toString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
