package coding;

public class Park {
    public int[] solution(String[] park, String[] routes) {
        int H = park.length;
        int W = park[0].length();

        int startX = 0, startY = 0;

        // 초기 위치 찾기
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                if (park[i].charAt(j) == 'S') {
                    startX = i;
                    startY = j;
                    break;
                }
            }
        }

        // 방향 설정
        int[][] direction = {
                {'N', -1, 0},
                {'S', 1, 0},
                {'W', 0, -1},
                {'E', 0, 1}
        };

        // 명령어 처리
        for (String route : routes) {
            String[] parts = route.split(" ");
            char dir = parts[0].charAt(0);
            int distance = Integer.parseInt(parts[1]);

            int newX = startX;
            int newY = startY;
            boolean canMove = true;

            for (int i = 0; i < direction.length; i++) {
                if (direction[i][0] == dir) {
                    for (int j = 1; j <= distance; j++) {
                        newX = startX + j * direction[i][1];
                        newY = startY + j * direction[i][2];

                        // 경계 체크
                        if (newX < 0 || newX >= H || newY < 0 || newY >= W) {
                            canMove = false;
                            break;
                        }

                        // 장애물 체크
                        if (park[newX].charAt(newY) == 'X') {
                            canMove = false;
                            break;
                        }
                    }
                    break;
                }
            }

            // 이동 가능한 경우 위치 업데이트
            if (canMove) {
                startX = newX;
                startY = newY;
            }
        }

        return new int[]{startX, startY};
    }
}
