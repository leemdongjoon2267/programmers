package coding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Password_Find {
    public static void main(String[] args) throws IOException {

        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken()); // 웹사이트
        int m = Integer.parseInt(st.nextToken()); // 웹사이트마다 찾아야하는 비밀번호

        // Map 을써서 key : 웹사이트, value : 비밀번호 로 매칭 도전
        Map<String, String> map = new HashMap<>();

        for(int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine());
            String web = st.nextToken();
            String pwd = st.nextToken();

            // 웹사이트에 맞는 비밀번호면 Map 에 넣기
            map.put(web, pwd);
        }

        // 사이트 주소는 알파벳 소문자, 대문자, '-', ',' 로 이루어져 있고 중복 x
        // 비밀번호는 알파벳 대문자로만 이루어져 있고 최대 20자

        // append 를 사용하기 위해서 StringBuilder 사용
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < m; i++) {
            String web = br.readLine();
            sb.append(map.get(web) + "\n");
        }
        System.out.println(sb);



    }
}
