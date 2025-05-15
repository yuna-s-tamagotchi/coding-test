package level0;

public class Solved_58 {
    public int solution(int num, int k) {
        int answer = 0;

        char[] arr = Integer.toString(num).toCharArray();


        for (int i = 0; i < arr.length; i++){

            if(arr[i] - '0' == k){
                System.out.println(arr[i]);
                answer = i + 1;
                break;
            }
            else {
                answer = -1;
            }
        }
        return answer;
    }
}
