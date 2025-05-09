package hash;
import java.util.HashSet;
import java.util.Set;

public class Phoneketmon {
    public static void main(String[] args) {
        int[] nums = {3, 3, 3, 2, 2, 2};
        Solution2 s = new Solution2();
        s.solution(nums);
    }
}


class Solution2 {
    public int solution(int[] nums) {
        int answer = 0;
        int canGet = nums.length / 2;

        Set<Integer> hashset = new HashSet<>();

        for (int num : nums) {
            hashset.add(num);
        }

        if (hashset.toArray().length < canGet) return hashset.toArray().length;
        // 다른 사람의 풀이를 보니까 size()를 쓰면 된다! 맞다맞다

        return canGet;
    }
}