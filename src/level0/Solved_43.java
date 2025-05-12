package level0;

public class Solved_43 {
    public int solution(int price) {
        int answer = 0;

        if (price >= 500000) {
            answer = (int) Math.floor(price - ((double) (price * 20) / 100));
        }
        else if (price >= 300000) {
            answer = (int) Math.floor(price - ((double) (price * 10) / 100));
        }
        else if (price >= 100000) {
            answer = (int) Math.floor(price - ((double) (price * 5) / 100));
        }
        else {
            answer = price;
        }

        return answer;
    }

}
