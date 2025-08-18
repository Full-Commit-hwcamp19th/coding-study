package week03.lv0;

import java.io.*;

public class SafeZone {

    private static int solution(int[][] board) {
        int answer = 0;

        int[] dx = {-1, 1, 0, 0, -1, -1, 1, 1};
        int[] dy = {0, 0, -1, 1, -1, 1, -1, 1};

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                for (int k = 0; k < 8; k++) {
                    if(board[i][j] != 0) continue;
                    int nx = j + dx[k];
                    int ny = i + dy[k];
                    if(nx >= 0 && ny >= 0 && ny < board.length && nx < board[0].length) {
                        if(board[ny][nx] == 1) board[i][j] = 2;
                    }
                }
            }
        }

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
//                System.out.print(board[i][j]);
                if(board[i][j] == 0) answer++;
            }
//            System.out.println();
        }

        return answer;
    }

    public static void main(String[] args) {
        String str;
        int[][] board;
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            str = br.readLine();
            int n = str.length();
            board = new int[n][n];

            for(int i = 0; i < n; i++) {
                board[0][i] = str.charAt(i) - '0';
            }

            for(int i = 1; i < n; i++) {
                str = br.readLine();
                for(int j = 0; j < n; j++) {
                    board[i][j] = str.charAt(j) - '0';
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        int answer = solution(board);

        try(BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))){
            bw.write("정답: ");
            bw.write(Integer.valueOf(answer).toString());
            bw.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
