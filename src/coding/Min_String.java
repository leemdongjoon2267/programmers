package coding;

public class Min_String {
    public int solution(String t, String p){

        int cnt = t.length() - p.length() + 1;

        String arr[] = new String[cnt];

        int passCnt = 0;

        for (int i = 0; i < cnt; i++) {

            arr[i] = t.substring(i, p.length()+i);

            if(Long.parseLong(arr[i]) <= Long.parseLong(p)) {
                passCnt++;
            }
        }
        return passCnt;
        }

}
