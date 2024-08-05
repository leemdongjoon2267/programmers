package coding;

public class Fraction_plus {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {

        int numer = (numer1 * denom2) + (numer2 * denom1);
        int denom = denom1 * denom2;

        int n = 1;

        for (int i = 1; i <= numer && i<= denom; i++){
            if (numer % i == 0 && denom % i == 0){
                n = i;
            }
        }

        numer = numer / n;
        denom = denom / n;


        int[] answer = {numer, denom};
        return answer;
    }
}
