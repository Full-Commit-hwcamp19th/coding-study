package programmers.week01.lv2;

import java.util.Arrays;
import java.util.Scanner;

/*
 * 이름: 이승건
 * 날짜: 25. 8. 7.
 * 문제: https://school.programmers.co.kr/learn/courses/30/lessons/12941
* */
public class create_minimum {
    public static int solution(int[] A,int[] B){
        int minSum = 0;

        Arrays.sort(A);
        Arrays.sort(B);

        for(int i = 0; i < A.length; i++){
            minSum += A[i] * B[B.length - 1 - i];
        }

        return minSum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str1 = sc.nextLine().split(" ");
        String[] str2 = sc.nextLine().split(" ");
        int[] A = new  int[str1.length];
        int[] B = new  int[str2.length];
        if(str1.length != str2.length){
            System.out.println("ERROR: 두 배열의 길이는 동일해야 합니다.");
            System.exit(0);
        }

        for(int i = 0; i< str1.length; i++){
            A[i] = Integer.parseInt(str1[i]);
            B[i] = Integer.parseInt(str2[i]);
        }
        System.out.println("A = " + Arrays.toString(A));
        System.out.println("B = " + Arrays.toString(B));
        int answer = solution(A,B);
        System.out.println(answer);
    }
}


/*
제출 결과 실패: 모든 테스트케이스에 대해서 시간 초과
              알려준 입출력은 통과한걸 보니 탐색 시간을 줄여야 하는데
              ...
최소값을 알려면 완전 탐색이 맞는데... 탐색 범위를 줄일 방법이 있나?
A, B 각 배열에 동일한 숫자들이 들어갈 수 있잔아
    ex) A = {1, 4, 2}, B = {5, 4, 4}
그러면 여기서 B[1]을 선택하나 B[2]를 선택하나 동일한 결과 아니야
중복을 제거하면?

    public static int solution(int[] A,int[] B){
        int answer = 0;
        int sum = 0;
        int minSum = Integer.MAX_VALUE;
        boolean[] check = new boolean[A.length];

        for(int i = 0; i < A.length; i++){
            check[i] = true;
            sum += A[0] * B[i];
            minSum = dfs(sum, minSum, check,A, B, 1);
            sum -= A[0] * B[i];
            check[i] = false;
        }
        return minSum;
    }

    public static int dfs(int sum, int minSum, boolean[] check,int[] A, int[] B,int index){
        //min값보다 커지면 의미가 없음
        if(sum >= minSum){
            return minSum;
        }
        //마지막LV까지 갔다면? -> index가 N보다 커야됨
        if(index >= A.length){
            return Math.min(sum, minSum);
        }

        //false가 있음 -> 아직 모든 조합 안됨 -> 숫자 조합
        for(int i = 0; i < A.length; i++){
            //이미 조건을 채운 것은 패스
            if(check[i]){
                continue;
            }
            check[i] = true;
            sum += A[index] * B[i];
            System.out.println("sum = " + sum);
            System.out.println("check = " + Arrays.toString(check));
            minSum = dfs(sum, minSum, check, A, B, index + 1);
            System.out.println("minSum = " + minSum);
            sum -= A[index] * B[i];
            check[i] = false;
        }
        return minSum;
    }
* */