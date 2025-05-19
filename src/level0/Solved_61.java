package level0;

import java.util.ArrayList;

public class Solved_61 {
    public int[] solution(int[] numbers, String direction) {
        ArrayList<Integer> list = new ArrayList<>();
        int removed = 0;

        for (int number : numbers) {
            list.add(number);
        }


        if (direction.equals("left")) {
            removed = list.remove(0);
            list.add(list.size(), removed);

        } else if (direction.equals("right")) {
            removed = list.remove(list.size() - 1);
            list.add(0, removed);
        }


        int[] answer = new int[list.size()];


        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }


        return answer;
    }
}
