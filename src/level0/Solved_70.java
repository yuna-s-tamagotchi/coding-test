package level0;

import java.util.ArrayList;
import java.util.List;

public class Solved_70 {
    public int[][] solution(int[] num_list, int n) {
        int row = num_list.length / n;
        int[][] answer = new int[row][n];

        List<Integer> list = new ArrayList<>();
        for (int i : num_list) {
            list.add(i);
        }

        for(int i = 0; i < row; i++) {
            for (int k = 0; k < n; k++) {
                answer[i][k] = list.get(0);
                list.remove(0);
            }
        }
        return answer;

        // 1차원 배열을 2차원 배열로 바꾸는 공식이 훨씬 간편하다.
        // 내거는 배열 길이가 자꾸 변해서 성능에 좋지 않다.
    }
}
