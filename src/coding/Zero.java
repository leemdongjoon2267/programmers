package coding;

import java.util.Scanner;
import java.util.Stack;

public class Zero {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < n; i++) {
            int k = sc.nextInt();

            if(k == 0){
                st.pop();
            }
            else{
                st.push(k); // 수를 스택에 추가
            }
        }
        int sum = 0;

        for (int num : st) {
            sum += num;
        }

        System.out.println(sum);

    }
}
