package programmers.week02.lv2;

/*
 * 이름: 이승건
 * 날짜: 25. 8. 12.
 * 문제: https://school.programmers.co.kr/learn/courses/30/lessons/159993
* */

import java.util.Scanner;

/*
S : 시작 지점
E : 출구
L : 레버
O : 통로
X : 벽
* */

// 위치를 나타내는 클래스 x, y
class Point{
    int x;
    int y;

    public Point() {}
    public Point(int x,int y){
        this.x = x;
        this.y = y;
    }
}

// 리스트를 만들기 위한 클래스
class Node{
    Point p;
    Node next;

    public Node() {}
    public Node(Point p, Node next){
        this.p = p;
        this.next = next;
    }
}

// FIFO: First In First Out
class myLinkedList{
    Node head;
    Node last;

    public myLinkedList(){}
    public myLinkedList(Node head){
        this.head = head;
    }

    // 리스트에 원소 삽입
    public void push(Point p) {
        if(head == null) {
            head = new Node(p, null);
            last = head;
        } else {
            last.next = new Node(p, null);
            last = last.next;

            /*
            gpt한테 질문 결과
            멤버 변수로 last를 추가해서 마지막 위치를 저장하고 있으면
            last node를 찾기 위한 반복을 할 필요가 없음
            Node last = head;
            while(last.next != null) {
                last = last.next;
            }
            last.next = new Node(p, null);
            */
        }
    }
    // 가장 먼저 삽입한 원소 보기
    public Point peek() {
        if(head != null){
            return head.p;
        }
        return null;
    }
    // 가장 먼저 삽입한 원소 삭제
    public void pop() {
        if(head != null) {
            head = head.next;
        }
    }
    // list가 비었는지 확인
    public boolean isEmpty() {
        return head == null;
    }
}

public class maze_escape {
    static int h;
    static int w;
    static char[][] map;

    static Point start = null;
    static Point lever = null;
    static Point end = null;


    public static int solution(String[] maps) {
        h = maps.length;
        w = maps[0].length();
        int[][] visited = new int[h][w];
        map = new char[h][w];

        // maps을 char로 변경 - 매번 charAt로 접근하는 것은 비효율적이라 생각함(계속해서 접근해서 확인하기 때문)
        for(int i = 0; i < h; i++){
            map[i] = maps[i].toCharArray();
        }
//        for(int i = 0; i < h; i++){
//            for(int j = 0; j < w; j++){
//                System.out.print(map[i][j]);
//            }
//            System.out.println();
//        }

        // 시작, 레버, 출구 위치 찾기
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                // 어차피 시작이면서 레버이거나 레버이면서 출구 일수는 없으므로 if-else로 엮음
                if     (start == null && map[i][j] == 'S') start = new Point(j, i);
                else if(lever == null && map[i][j] == 'L') lever = new Point(j, i);
                else if(end   == null && map[i][j] == 'E') end   = new Point(j, i);

                if(start != null && lever != null && end != null) break;
            }
        }
        int sTol = bfs(start, lever, visited);
//        System.out.println(start.x + " " + start.y);
//        System.out.println(lever.x + " " + lever.y);
//        System.out.println(sTol);
        if(sTol == 0) return -1;

        visited = new int[h][w];
        int lToe = bfs(lever, end, visited);
//        System.out.println(lToe);
        if(lToe == 0) return -1;

        return sTol + lToe;
    }


    static int bfs(Point start, Point end, int[][] visited) {
        myLinkedList list = new myLinkedList();

        // 0: 아래, 1: 위, 2: 왼, 3: 오
        int[] dx = {0, 0, -1, 1};
        int[] dy = {1, -1, 0, 0};

        Point p = start;
        list.push(p);

        while(!list.isEmpty()){
            p = list.peek();
//            System.out.println(p.x + " " + p.y);
            if(p.x == end.x && p.y == end.y){
                break;
            }
            list.pop();

            for(int i = 0; i < 4; i++){
                int nx = p.x + dx[i];
                int ny = p.y + dy[i];
                Point np = new Point(nx, ny);

                if(isRoad(np)){
                    if(visited[ny][nx] == 0)
                    {
                        visited[np.y][np.x] = visited[p.y][p.x] + 1;
                        list.push(np);
                        for (int j = 0; j < h; j++) {
                            for (int k = 0; k < w; k++) {
                                System.out.print(visited[j][k]);
                            }
                            System.out.println();
                        }
                        System.out.println();
                    }
                }
            }
        }

        return visited[end.y][end.x];
    }

    static boolean isRoad(Point p){
        // 범위를 벗어나면 false
        if(p.y < 0 || p.y >= h || p.x < 0 || p.x >= w) return false;
        // 벽이면 false
        if(map[p.y][p.x] == 'X') return false;
        // 그 외의 경우는 true
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //String[] maps = sc.nextLine().split(" ");
        String[] maps = {"SOOOL","XXXXO","OOOOO","OXXXX","OOOOE"};
        String[] maps2 = {"LOOXS","OOOOX","OOOOO","OOOOO","EOOOO"};
        //int answer = solution(maps);
        int answer2 = solution(maps2);
        //System.out.println(answer);
        System.out.println(answer2);

    }
}
