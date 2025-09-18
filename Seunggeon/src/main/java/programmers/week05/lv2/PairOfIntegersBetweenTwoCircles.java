package programmers.week05.lv2;

/*
 * 이름: 이승건
 * 날짜: 25. 8. 30.
 * 문제: https://school.programmers.co.kr/learn/courses/30/lessons/181187
* */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PairOfIntegersBetweenTwoCircles {
    static int min;
    static int max;

    public static long solution(int r1, int r2) {

/* 설명. 1차 시도 */
/* 설명.
 *  
* */
//
//        int max = Math.max(r1, r2);
//        int min = Math.min(r1, r2);
//
//        long count = 0;
//        long powLength;
//        for (int i = -max; i <= max; i++) {
//             for (int j = -max; j <= max; j++) {
//                 powLength = (long)(Math.pow(i, 2) + Math.pow(j, 2));
//                 System.out.println("좌표: " + i + " " + j);
//                 System.out.println("길이 제곱: " + powLength);
//                 if(powLength <= Math.pow(max, 2)) {
//                    count += (2 * Math.abs(j) + 1);
//                     System.out.println(count);
//                     break;
//                 }
//             }
//
//             for(int j = -min; j <= min; j++) {
//                 powLength = (long)(Math.pow(i, 2) + Math.pow(j, 2));
//                 System.out.println("좌표: " + i + " " + j);
//                 System.out.println("길이 제곱: " + powLength);
//                 if(powLength < Math.pow(min, 2)) {
//                     count -= (2 * Math.abs(j) + 1);
//                     System.out.println(count);
//                     break;
//                 }
//             }
//        }
//        return count;

/* 설명. 2차 시도 */
//
//        min =  Math.min(r1, r2);
//        max =  Math.max(r1, r2);
//
//        /* 설명.
//         *  1. 좌표평면을 8분할
//         *  2. 한족의 개수만 체크하고 8배
//         *  3. 이 때 분할 되는 기준은 제외 하고 개수 세기 (x좌표 축, y 롸표 축, y=x, y=-x)
//         *  4. x 좌표축의 점개수 == y 좌표축의 점개수, y=x 선분의 점개수 = y=-x. 선분의 점개수
//         *  5. 1사분면에서 ((x 좌표축 점의 개수) + (y = x 선분의 점 개수)) 을 통해 나온 점의 개수 X4
//        * */
//
//        int count1 = 0;
//        int count2 = max-min+1; // x 축의 점 개수
//
//        for (int i = 1; i < max; i++) {
//            // y = x 선분 위의 점 개수
//            double length = calCulateLength(i, i);
//            if (isIndoors(length) == 3) {
//                count2++;
//            } else if(isIndoors(length) == 2) {
//                break;
//            }
//            for (int j = i + 1; j < max; j++) {     // y=x로 선 그어서 오른쪽만 체크
//                length = calCulateLength(j, i);
//                if (isIndoors(length) == 3) {
//                    count1++;
//                } else if(isIndoors(length) == 2) {
//                    break;  // 큰 원을 벗어나면 내부 반복문 종료
//                }
//            }
//        }
//
//        return (long)(count1 * 8 + count2 * 4);

/* 설명. 3차 시도 */
//
//        min = Math.min(r1, r2);
//        max = Math.max(r1, r2);
//
//        return countPoint(max, true) - countPoint(min, false);


        min = Math.min(r1, r2);
        max = Math.max(r1, r2);
        return countPoint(max, true) - countPoint(min, false);


    }


    //들어온 포인트를 0, 0으로부터의 길이를 계산
    private static double calCulateLength(int x, int y) {
        double length = (Math.pow(x, 2) + Math.pow(y, 2));
        return Math.sqrt(length);
    }

    // 길이를 기반으로 count해야 하는 지점인 지 확인
    private static int isIndoors(double length) {
        if (min > length) return 1;     // 작은 원 내부이면: 1
        if (max < length) return 2;     // 큰 원 외부이면: 2
        return 3;                       // 작은 원과 큰 원 사이: 3
    }



    // 반지름이 r인 원 내부의 정수 좌표의 개수 반환
    private static long countPoint(int r, boolean open) {
        long count = 0;
        int lastNum = -r;
        // 1 사부면 개수만 세서 4배
        for(int i = 0; i < r; i++) {
            for (; lastNum < 0; lastNum++) {
                if(open == true) {  // 열린 구간
                    if (calCulateLength(i, lastNum) <= r) {
                        count += Math.abs(lastNum);
                        break;
                    }
                } else {    //닫힌 구간
                    if (calCulateLength(i, lastNum) < r) {
                        count += Math.abs(lastNum);
                        break;
                    }
                }
            }
        }
        count *= 4; // 1, 2, 3, 4분면 동일하므로 한번만 구해서 곱셈으로 처리
        count += 1; // 가운데 원점

        return count;
    }


    public static void main(String[] args) {
        int r1, r2;

        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print("r1: ");
            r1 = Integer.parseInt(br.readLine());
            System.out.print("r2: ");
            r2 = Integer.parseInt(br.readLine());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        long answer = solution(r1, r2);

        System.out.println("정답: " + answer);
    }

}
