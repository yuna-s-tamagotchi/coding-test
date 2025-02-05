import level0.*;

public class Main {
    public static void main(String[] args) {
        Solved_01 solved1 = new Solved_01();
        System.out.println("1. 두 수의 차: " + solved1.solution(2, 3));
        System.out.println();

        Solved_02 solved2 = new Solved_02();
        System.out.println("2. 숫자 비교하기: " + solved2.solution(2, 2));
        System.out.println();

        Solved_03 solved3 = new Solved_03();
        System.out.println("3. 나이 출력: " + solved3.solution(40));
        System.out.println();

        Solved_04 solved4 = new Solved_04();
        System.out.println("4. 몫 구하기: " + solved4.solution(7, 2));
        System.out.println();

        Solved_06 solved6 = new Solved_06();
        System.out.println("6. 두 수의 곱: " + solved6.solution(27, 19));
        System.out.println();

        Solved_07 solved7 = new Solved_07();
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("7. 배열의 평균값: " + solved7.solution(numbers));
        System.out.println();

        Solved_08 solved8 = new Solved_08();
        System.out.println("8. 각도기: " + solved8.solution(70));
        System.out.println();

        Solved_09 solved9 = new Solved_09();
        System.out.println("9. 양꼬치: " + solved9.solution(10, 3));
        System.out.println();

        Solved_10 solved10 = new Solved_10();
        System.out.println("10. 짝수의 합: " + solved10.solution(4));
        System.out.println();
    }
}