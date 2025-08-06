package Week01.LV1;
/*
 * 이름: 이승건
 * 날짜: 25. 8. 5.
 * 문제: https://school.programmers.co.kr/learn/courses/30/lessons/389478
* */
import java.util.Scanner;

public class TakeOutTheDeliveryBox {
    public static int solution(int n, int w, int num) {
        int answer = 0;

        int count = 1;
        int upBox = num;
        while(true){
            int temp = upBox % w;
            System.out.println("temp = " + temp);
            System.out.println("upBox = " + upBox);
            if(temp == 0){
                upBox = upBox + 1;
            }
            else {
                upBox = upBox + 2 * (w-temp) + 1;
            }

            //System.out.println("upBox = " + upBox);
            if(upBox<= n){
                count++;
            }
            else{
                break;
            }
        }
        answer = count;
        return answer;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int w = sc.nextInt();
        int num = sc.nextInt();
        int answer = solution(n, w, num);

        System.out.println("answer = " + answer);
    }
}
