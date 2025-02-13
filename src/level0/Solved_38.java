package level0;

import java.util.Scanner;

// Scanner는 Main에서 못가져오나? Main에서 하면 내가 입력하기 전 까지 다음 문제들이 안보이겠지?

public class Solved_38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("a 단어를 입력해 주세요: ");
        String a = sc.next();
        System.out.println("b 단어를 입력해 주세요: ");
        String b = sc.next();
        System.out.println(a + b);
    }
}
