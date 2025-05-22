package level0;

public class Solved_67 {
    public int solution(int i, int j, int k) {
        int answer = 0;
        String test = "";

        for (int idx = i; idx <= j; idx++) {
            test += idx;
        }

        for(String s : test.split("")){
            if(s.equals(String.valueOf(k))) answer++;
        }
        return answer;
    }
}
