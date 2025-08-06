package Week01.LV2;
/*
 * 이름: 이승건
 * 날짜: 25. 8. 6.
 * 문제: https://school.programmers.co.kr/learn/courses/30/lessons/12909
* */
import java.util.Scanner;
import java.util.Stack;

public class correct_parentheses {
    public static boolean solution(String s) {
        boolean answer = false;

        /*
         * 1. 스택에 첫 번째 문자를 넣는다.
         * 2. 두 번째 문자와 스택에 넣은 문자를 비교한다.
         * 3. 두 문자로 하나의 완성된 괄호가 된다면 첫번째 문자를 뺀다.
         * 4. 두 문자로 완성된 괄호가 안된다면 두 번째 문자를 스택에 넣는다.
         * 5. 반복
        * */
        Stack<String> stack = new Stack<String>();
        for(int i = 0; i < s.length(); i++){
            if(stack.isEmpty()){
                stack.push(s.charAt(i) + "");
            }
            else{
                String temp = stack.peek();
                if(temp.equals("(") && s.charAt(i) == ')'){
                    stack.pop();
                } else{
                    stack.push(s.charAt(i) + "");
                }
            }
        }

        if(stack.isEmpty()){
            answer = true;
        }
        return answer;
    }

    public static boolean solution2(String s) {
        boolean answer = false;

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        boolean answer = solution(s);       // 스택을 이용한 풀이
        boolean answer2 = solution2(s);     // 스택을 쓰지 않은 풀이
        System.out.println(answer);
        System.out.println(answer2);
    }
}
