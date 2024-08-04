package coding;

import java.util.*;

public class Word_Change {
    public int solution(String begin, String target, String[] words) {
        int answer = 0;

        Queue<String> q = new LinkedList<>(); // 변환 가능한 단어들을 저장할 queue
        Set<String> s = new HashSet<>(Arrays.asList(words)); // 단어들의 집합 set

        if(!s.contains(target)){
            return 0; // 변환할 수 없는 경우 0 리턴
        }

        q.offer(begin); // queue(q) 에 begin 단어 추가
        s.remove(begin); // set(s) 에서 begin 단어 제거

        while (!q.isEmpty()){

            for (int i = 0; i< q.size(); i++){
                // queue(q) 에서 단어를 하나씩 꺼내어 cur (현재단어)에 저장
                String cur = q.poll();

                if (cur.equals(target)){
                    return answer; // 타겟 단어에 도달
                }

                // HashSet 타입은 for 루프를 사용할 수 없으므로 to.Array()를 사용해 배열로 변환
                for (String word : s.toArray(new String[s.size()])){
                    // 변환 가능하면 queue(q) 에 해당 단어를 추가하고 set(s) 에서 제거
                    if(canConvert(cur,word)){
                        q.offer(word);
                        s.remove(word);
                    }
                }
            }

            answer++;
        }

        return 0; // 변환할 수 없는 경우
    }

    private boolean canConvert(String word1, String word2){
        int diffCnt = 0;
        for (int i = 0; i < word1.length(); i++){
            if (word1.charAt(i) != word2.charAt(i)){
                diffCnt++;
            }
        }
        return diffCnt == 1;
    }
}
