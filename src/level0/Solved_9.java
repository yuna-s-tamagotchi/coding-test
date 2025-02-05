package level0;

public class Solved_9 {
    public int solution(int n, int k) {
        int answer = 0;
        int meat = 12000;
        int drink = 2000;
        int service = 0;

        if (n / 10 > 0) {
            service += n / 10;
        }

        answer = n * meat + drink * k - drink * service;

        return answer;
    }
}
