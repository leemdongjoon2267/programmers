package coding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Election {
    public static void main(String[] args) throws IOException {

        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine()); // 국회의워 후보 인원
        int dasom = Integer.parseInt(br.readLine()); // 다솜이

        PriorityQueue<Integer> pq = new PriorityQueue<>(((o1, o2) -> o2.compareTo(o1)));

        for (int i = 0; i < N-1; i++) {
            pq.offer(Integer.parseInt(br.readLine()));
        }

        // 설득해야할 마을 주민 인원 수 초기화
        int M = 0;
        while (!pq.isEmpty() && dasom++ <= pq.peek()){
            pq.offer(pq.poll() -1);
            ++M;
        }
        System.out.println(M);

    }
}
