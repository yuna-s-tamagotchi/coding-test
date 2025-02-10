package level0;

public class Solved_26 {
    public int[] solution(int[] num_list) {
        int odd = 0;
        int even = 0;

        for (int j : num_list) {
            if (j % 2 == 0) {
                even += 1;
            } else {
                odd += 1;
            }
        }
        return new int[]{even, odd};
    }
}
