package coding;

import java.util.Scanner;

public class AToB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        sc.close();

        int cnt = 1; // 시작 시 연산 횟수 1

        // B 와 A 가 같아질때 까지 반복
        // 일단 B 와 A 가 같지 않다는 가정해서 같아질때까지 반복
        while (B != A) {
            if (B < A) {
                cnt = -1;
                break;
            }

            if (B % 2 == 0) {
                B /= 2;
            } else if (B % 10 == 1) {
                B /= 10;
            } else {
                cnt = -1;
                break;
            }

            cnt++;
        }

        System.out.println(cnt);
    }
}
