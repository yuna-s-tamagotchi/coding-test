package level0;

import java.util.Scanner;

// Scanner는 Main에서 못가져오나? Main에서 하면 내가 입력하기 전 까지 다음 문제들이 안보이겠지?

public class Solved_39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("자연수 n을 입력하세요: ");
        int n = sc.nextInt();
        if (n % 2 == 0) {
            System.out.println(n + " is even");
        } else {
            System.out.println(n + " is odd");
        }
    }
}
