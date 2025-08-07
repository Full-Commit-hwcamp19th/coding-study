package haeone.week01.lv0;

public class 문자열뒤집기 {
    /*
     * 이름: 최혜원
     * 날짜: 2025.08.06
     * 문제: https://school.programmers.co.kr/learn/courses/30/lessons/120830
     * */
        public String solution(String my_string, int s, int e) {
            String answer = "";

            answer = my_string.substring(0,s);

            for(int i= e ; i>= s ;i--){
                answer += my_string.charAt(i);
            }

            answer += my_string.substring(e+1);
            return answer;
        }
}
