package coding;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Card2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.close();

        Queue<Integer> queue = new LinkedList<>();

        for (int i = 1; i <= N; i++) {
            queue.add(i);
        }

        while (queue.size() > 1) {
            queue.poll(); // 맨 위의 카드를 버림
            queue.add(queue.poll()); // 맨 위의 카드를 맨 아래로 이동
        }

        System.out.println(queue.peek()); // 마지막에 남는 카드 출력
    }
}
