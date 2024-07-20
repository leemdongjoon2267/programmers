package coding;

import java.util.*;

public class DFS_BFS {

    private static List<Integer>[] gr;
    private static boolean[] visited;
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 입력 받기
        int A = sc.nextInt();  // 정점의 개수
        int B = sc.nextInt();  // 간선의 개수
        int C = sc.nextInt();  // 탐색을 시작할 정점의 번호

        // 그래프 초기화
        gr = new ArrayList[A + 1];
        for (int i = 1; i <= A; i++) {
            gr[i] = new ArrayList<>();
        }

        // 간선 입력 받기
        for (int i = 0; i < B; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            gr[u].add(v);
            gr[v].add(u);
        }

        // 각 리스트 정렬 (정점 번호가 작은 것을 먼저 방문하기 위해)
        for (int i = 1; i <= A; i++) {
            Collections.sort(gr[i]);
        }
        // DFS 실행
        visited = new boolean[A + 1];
        dfs(C);
        System.out.println();

        // BFS 실행
        visited = new boolean[A + 1];
        bfs(C);
        System.out.println();
    }

    private static void dfs(int v) {
        visited[v] = true;
        System.out.print(v + " ");

        for (int neighbor : gr[v]) {
            if (!visited[neighbor]) {
                dfs(neighbor);
            }
        }
    }

    private static void bfs(int start) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        visited[start] = true;

        while (!queue.isEmpty()) {
            int v = queue.poll();
            System.out.print(v + " ");

            for (int neighbor : gr[v]) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }
    }
}
