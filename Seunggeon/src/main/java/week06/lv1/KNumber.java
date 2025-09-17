package week06.lv1;

/*
 * 이름: 이승건
 * 날짜: 25. 9. 7.
 * 문제: https://school.programmers.co.kr/learn/courses/30/lessons/42748
* */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class KNumber {
    private static int[] solution(int[] array, int[][] commands) {
        int cRow = commands.length;
        int[] answer = new int[cRow];

        int start = 0;
        int end = 0;
        int k = 0;

        for(int i = 0; i < cRow; i++) {
            start = commands[i][0] - 1; // 번째를 인덱스로 변경
            end = commands[i][1] - 1;   // 번째를 인덱스로 변경
            k = commands[i][2] - 1;     // 번째를 인덱스로 변경

            int[] cutArray = cut(array, start, end);
//            System.out.println(Arrays.toString(cutArray));
            int[] sortArray = sort(cutArray);
//            System.out.println(Arrays.toString(sortArray));
//            System.out.println();
            answer[i] = sortArray[k];
        }

        return answer;
    }

    private static int[] cut(int[] array, int start, int end) {
        int[] cutArray = new int[end - start + 1];

        for(int i = start; i <= end; i++) {
            cutArray[i - start] = array[i];
        }

        return cutArray;
    }

    private static int[] sort(int[] array) {
        // 길이가 1이면 더이상 분해 할 수 없으므로 반환
        if(array.length == 1) {
            return array;
        }
        int mid = array.length / 2;

        System.out.println(Arrays.toString(Arrays.copyOfRange(array, 0, mid)));
        System.out.println(Arrays.toString(Arrays.copyOfRange(array, mid, array.length)));

        int[] leftArray = sort(Arrays.copyOfRange(array, 0, mid));
        System.out.println("leftArray: " + Arrays.toString(leftArray));
        int[] rightArray = sort(Arrays.copyOfRange(array, mid, array.length));
        System.out.println("rightArray: " + Arrays.toString(rightArray));

        int[] sortArray = new int[array.length];
        int i = 0;
        int left = 0;
        int right = 0;
        for(; i < sortArray.length; i++) {
            if(leftArray[left] <= rightArray[right]) {
                sortArray[i] = leftArray[left];
                left++;
                if(left == leftArray.length) { i++; break; }
            } else {
                sortArray[i] = rightArray[right];
                right++;
                if(right == rightArray.length) { i++; break; }
            }
        }

        if(left < leftArray.length) { // leftArray가 덜 들어감
            for(; i < sortArray.length; i++) {
                sortArray[i] = leftArray[left];
                left++;
            }
        } else if (right < rightArray.length) {   // rightArray가 덜 들어감
            for(; i < sortArray.length; i++) {
                sortArray[i] = rightArray[right];
                right++;
            }
        }

        System.out.println(Arrays.toString(sortArray));
        return sortArray;
    }


    public static void main(String[] args) {
        int[] array;
        int[][] commands;

        try(BufferedReader br =  new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print("배열을 입력하시오: ");
            StringTokenizer st = new StringTokenizer(br.readLine());
            int count = st.countTokens();
            array = new int[count];
            for(int i = 0; i < count; i++) {
                array[i] = Integer.parseInt(st.nextToken());
            }
            System.out.print("command의 개수를 입력하시오: ");
            int cRow = Integer.parseInt(br.readLine());
            commands = new int[cRow][3];
            for(int i = 0; i< cRow; i++) {
                System.out.print("Command를 입력하세요: ");
                st = new StringTokenizer(br.readLine());
                for(int j = 0; j < 3; j++) {
                    commands[i][j] = Integer.parseInt(st.nextToken());
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        int[] answer = solution(array, commands);

        System.out.print("정답: " + Arrays.toString(answer));



    }
}
