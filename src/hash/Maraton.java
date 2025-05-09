package hash;

import java.util.HashMap;
import java.util.Map;

class Maraton {
    public static void main(String[] args) {
        Solution1 s = new Solution1();
        String[] participant = {"mislav", "stanko", "mislav", "ana"};
        String[] completion = {"stanko", "ana", "mislav"};

        s.solution(participant, completion);
    }
}


class Solution1 {
    public String solution(String[] participant, String[] completion) {
        String answer = "";

        Map<String, Integer> mapParticipant = new HashMap<>();
        Map<String, Integer> mapCompletion = new HashMap<>();


        for (String p : participant) {
            mapParticipant.put(p, mapParticipant.getOrDefault(p, 0) + 1);
        }

        for (String c : completion) {
            mapCompletion.put(c, mapCompletion.getOrDefault(c, 0) + 1);
        }

        for (String s : mapParticipant.keySet()) {
            if (mapParticipant.get(s) > mapCompletion.getOrDefault(s, 0) ){
                return s;
            }
        }
        return "";
    }
}
