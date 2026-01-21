package baekjoon.week07.p2588;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int num1 = Integer.parseInt(br.readLine());
            int num2 = Integer.parseInt(br.readLine());

            int num3 = num1 * (num2 % 10);
            num2 = num2 / 10;

            int num4 = num1 * (num2 % 10);
            num2 = num2 / 10;

            int num5 = num1 * (num2 % 10);
            num2 = num2 / 10;

            int num6 = num3 + num4 * 10 + num5 * 100;

            System.out.println(num3);
            System.out.println(num4);
            System.out.println(num5);
            System.out.println(num6);


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
