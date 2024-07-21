package coding;

import java.util.Scanner;

public class War {

    static int N, M, nowX, nowY;
    static char[][] arr;

    static boolean[][] visit;
    static int[] dirX = {0, 0, -1, 1}; // 상 하 좌 우
    static int[] dirY = {-1, 1, 0, 0}; // 상 하 좌 우
    static int sum_B, sum_W;
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();

        sc.nextLine();

        // 전쟁터의 각 줄을 입력받아 2차원 배열 arr에 저장
        arr = new char[M][N];
        visit = new boolean[M][N];

    }
}
