package coding;

import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        // 선수의 현재 순위를 저장할 맵
        Map<String, Integer> rankMap = new HashMap<>();

        // 초기 순위 설정
        for (int i = 0; i < players.length; i++) {
            rankMap.put(players[i], i);
        }

        // 순위 배열
        List<String> rankList = new ArrayList<>(Arrays.asList(players));

        // callings 배열을 순회하며 순위 갱신
        for (String calling : callings) {
            int currentIndex = rankMap.get(calling);
            if (currentIndex > 0) {
                String previousPlayer = rankList.get(currentIndex - 1);

                // 두 선수의 순위를 교환
                Collections.swap(rankList, currentIndex, currentIndex - 1);

                // 맵에서 순위 갱신
                rankMap.put(calling, currentIndex - 1);
                rankMap.put(previousPlayer, currentIndex);
            }
        }

        // 최종 결과 배열로 변환하여 반환
        return rankList.toArray(new String[0]);
    }
}