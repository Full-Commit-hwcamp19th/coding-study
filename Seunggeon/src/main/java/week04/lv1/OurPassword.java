package week04.lv1;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class OurPassword {
    private static String solution(String s, String skip, int index) {

        char[] cArr = s.toCharArray();
        for(int i = 0; i < s.length(); i++) {
            for(int j = 0; j < index; j++) {
                cArr[i]++;

                if(cArr[i] > 'z') cArr[i] = (char) (cArr[i] - ('z' - 'a') - 1);

                if(skip.contains(cArr[i] + "")) {
                    j--;
                }
            }
        }
        s =  new String(cArr);
        return s;
    }

    public static void main(String[] args) {

        System.out.println((int)'a');
        System.out.println((int)'z');
        System.out.println((int) (('z' + 1) - ('z'-'a')));


        //        String str;
//        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
//            System.out.println("s skip index를 입력하세요(공백으로 구분): ");
//            str = br.readLine();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//
//        StringTokenizer st = new StringTokenizer(str);
//        String s = st.nextToken();
//        String skip = st.nextToken();
//        int index = Integer.parseInt(st.nextToken());
//
//
//        String answer = solution(s, skip, index);
//
//        try(BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))){
//            bw.write("정답: ");
//            bw.write(answer);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

    }
}
