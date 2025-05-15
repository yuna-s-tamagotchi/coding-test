import level0.*;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Solved_01 solved1 = new Solved_01();
//        System.out.println("1. 두 수의 차: " + solved1.solution(2, 3));
//        System.out.println();
//
//        Solved_02 solved2 = new Solved_02();
//        System.out.println("2. 숫자 비교하기: " + solved2.solution(2, 2));
//        System.out.println();
//
//        Solved_03 solved3 = new Solved_03();
//        System.out.println("3. 나이 출력: " + solved3.solution(40));
//        System.out.println();
//
//        Solved_04 solved4 = new Solved_04();
//        System.out.println("4. 나머지 구하기: " + solved4.solution(10, 5));
//        System.out.println();
//
//        Solved_05 solved5 = new Solved_05();
//        System.out.println("5. 몫 구하기: " + solved5.solution(7, 2));
//        System.out.println();
//
//        Solved_06 solved6 = new Solved_06();
//        System.out.println("6. 두 수의 곱: " + solved6.solution(27, 19));
//        System.out.println();
//
//        Solved_07 solved7 = new Solved_07();
//        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        System.out.println("7. 배열의 평균값: " + solved7.solution(numbers));
//        System.out.println();
//
//        Solved_08 solved8 = new Solved_08();
//        System.out.println("8. 각도기: " + solved8.solution(70));
//        System.out.println();
//
//        Solved_09 solved9 = new Solved_09();
//        System.out.println("9. 양꼬치: " + solved9.solution(10, 3));
//        System.out.println();
//
//        Solved_10 solved10 = new Solved_10();
//        System.out.println("10. 짝수의 합: " + solved10.solution(4));
//        System.out.println();
//
//        Solved_11 solved11 = new Solved_11();
//        System.out.println("11. 피자 나눠 먹기 (3): " + solved11.solution(2, 100));
//        System.out.println();
//
//        Solved_12 solved12 = new Solved_12();
//        String[] strlist = {"We", "are", "the", "world!"};
//        System.out.println("12. 배열 원소의 길이: " + Arrays.toString(solved12.solution(strlist)));
//        System.out.println();
//
//        Solved_13 solved13 = new Solved_13();
//        System.out.println("13. 문자열안에 문자열: " + solved13.solution("ab6CDE443fgh22iJKlmn1o", "6CD"));
//        System.out.println();
//
//        Solved_14 solved14 = new Solved_14();
//        System.out.println("14. 제곱수 판별하기: " + solved14.solution(10000));
//        System.out.println();
//
//        Solved_15 solved15 = new Solved_15();
//        int[] num_list = {1, 2, 3, 4, 5};
//        System.out.println("15. 배열 뒤집기: " + Arrays.toString(solved15.solution(num_list)));
//        System.out.println();
//
//        Solved_16 solved16 = new Solved_16();
//        int[] numbers16 = {0, 31, 24, 10, 1, 9};
//        System.out.println("16. 최댓값 만들기(1): " + solved16.solution(numbers16));
//        System.out.println();
//
//        Solved_17 solved17 = new Solved_17();
//        System.out.println("17. 편지: " + solved17.solution("I love you~"));
//        System.out.println();
//
//        Solved_18 solved18 = new Solved_18();
//        System.out.println("18. 세균 증식: " + solved18.solution(7, 15));
//        System.out.println();
//
//        Solved_19 solved19 = new Solved_19();
//        System.out.println("19. 자릿수 더하기: " + solved19.solution(1234));
//        System.out.println();
//
//        Solved_20 solved20 = new Solved_20();
//        System.out.println("20. 모음 제거: " + solved20.solution("nice to meet you"));
//        System.out.println();
//
//        Solved_21 solved21 = new Solved_21();
//        System.out.println("21. 특정 문자 제거하기: " + solved21.solution("abcdef", "f"));
//        System.out.println();
//
//        Solved_22 solved22 = new Solved_22();
//        System.out.println("22. 순서쌍의 개수: " + solved22.solution(100));
//        System.out.println();
////
//        Solved_23 solved23 = new Solved_23();
//        System.out.println("23. 문자 반복 출력하기: " + solved23.solution("hello", 3));
//        System.out.println();
//
//        Solved_24 solved24 = new Solved_24();
//        int[] numbers24 = {1, 2, 3, 4, 5};
//        System.out.println("24. 배열 자르기: " + Arrays.toString(solved24.solution(numbers24, 1, 3)));
//        System.out.println();
//
//        Solved_25 solved25 = new Solved_25();
//        System.out.println("25. 피자 나눠 먹기 (1): " + solved25.solution(22));
//        System.out.println();
//
//        Solved_26 solved26 = new Solved_26();
//        int[] numbers26 = {1, 3, 5, 7};
//        System.out.println("26. 짝수 홀수 개수: " + Arrays.toString(solved26.solution(numbers26)));
//        System.out.println();
//
//        Solved_27 solved27 = new Solved_27();
//        System.out.println("27. 두 수의 합: " + solved27.solution(100, 2));
//        System.out.println();
//
//        Solved_28 solved28 = new Solved_28();
//        System.out.println("28. 문자열 뒤집기: " + solved28.solution("jaron"));
//        System.out.println();
//
//        Solved_29 solved29 = new Solved_29();
//        int[] numbers29 = {-7, 9};
//        System.out.println("29. 점의 위치 구하기: " + solved29.solution(numbers29));
//        System.out.println();
//
//        Solved_30 solved30 = new Solved_30();
//        System.out.println("30. 아이스 아메리카노: " + Arrays.toString(solved30.solution(15000)));
//        System.out.println();
//
//        Solved_31 solved31 = new Solved_31();
//        int[] numbers31 = {3, 6, 2};
//        System.out.println("31. 삼각형의 완성조건 (1): " + solved31.solution(numbers31));
//        System.out.println();
//
//        Solved_32 solved32 = new Solved_32();
//        int[] numbers32 = {4, 5, 6, 7, 8, 9, 10, 11, 12};
//        System.out.println("32. n의 배수 고르기: " + Arrays.toString(solved32.solution(3, numbers32)));
//        System.out.println();
//
//        Solved_33 solved33 = new Solved_33();
//        String[] s1 = {"a", "b", "c"};
//        String[] s2 = {"com", "b", "d", "p", "c"};
//        System.out.println("33. 배열의 유사도: " + (solved33.solution(s1, s2)));
//        System.out.println();
//
//        Solved_34 solved34 = new Solved_34();
//        int[] numbers34 = {149, 180, 192, 170};
//        System.out.println("34. 머쓱이보다 키 큰 사람: " + solved34.solution(numbers34, 167));
//        System.out.println();
//
//        Solved_35 solved35 = new Solved_35();
//        System.out.println("35. 두 수의 나눗셈: " + solved35.solution(7, 3));
//        System.out.println();
//
//        Solved_36 solved36 = new Solved_36();
//        int[] numbers36 = {1, 1, 2, 3, 4, 5};
//        System.out.println("36. 중복된 숫자 개수: " + solved36.solution(numbers36, 1));
//         System.out.println();
//
//         Solved_37 solved37 = new Solved_37();
//         int[] numbers37 = {1, 2, 100, -99, 1, 2, 3};
//         System.out.println("37. 배열 두 배 만들기: " + Arrays.toString(solved37.solution(numbers37)));
//         System.out.println();
//
//         Solved_38 solved38 = new Solved_38();
//         System.out.println("38. 문자열 붙여서 출력하기: Scanner 문제");
//         System.out.println();
//
//         Solved_39 solved39 = new Solved_39();
//         System.out.println("39. 홀짝 구분하기: Scanner 문제");
//         System.out.println();
//
//         Solved_40 solved40 = new Solved_40();
//         int[] numbers40 = {1, 2, 7, 10, 11};
//         System.out.println("40. 중앙값 구하기: " + solved40.solution(numbers40));
//         System.out.println();
//
//        Solved_41 solved41 = new Solved_41();
//        System.out.println("41. 짝수는 싫어요: " + Arrays.toString(solved41.solution(10)));
//        System.out.println();
//
//        Solved_42 solved42 = new Solved_42();
//        int[] numbers42 = {4, 5, 6, 7, 8, 9, 10, 11, 12};
//        System.out.println("42. n의 배수 고르기: " + Arrays.toString(solved42.solution(34, numbers42)));
//        System.out.println();
//
//        Solved_43 solved43 = new Solved_43();
//        System.out.println("43. 옷가게 할인 받기: " + solved43.solution(100010));
//        System.out.println();
//
//        Solved_44 solved44 = new Solved_44();
//        System.out.println("44. 직각삼각형 출력하기: 스캐너 문제");
//        System.out.println();
//
//        Solved_45 solved45 = new Solved_45();
//        System.out.println("45. 홀짝에 따라 다른 값 반환하기: " + solved45.solution(10));
//        System.out.println();
//
//        Solved_46 solved46 = new Solved_46();
//        System.out.println("46. 개미 군단: " + solved46.solution(23));
//        System.out.println();
//
//        Solved_47 solved47 = new Solved_47();
//        System.out.println("47. 가위 바위 보: " + solved47.solution("205"));
//        System.out.println();
//
//        Solved_48 solved48 = new Solved_48();
//        System.out.println("48. 숨어있는 숫자의 덧셈 (1): " + solved48.solution("aAb1B2cC34oOp"));
//        System.out.println();
//
//        Solved_49 solved49 = new Solved_49();
//        int[] numbers49 = {-1, 1};
//        System.out.println("49. 최댓값 만들기 (2): " + solved49.solution(numbers49));
//        System.out.println();
//
//        Solved_50 solved50 = new Solved_50();
//        System.out.println("50. 대문자와 소문자: " + solved50.solution("abCdEfghIJ"));
//        System.out.println();
//
//        Solved_51 solved51 = new Solved_51();
//        System.out.println("51. 인덱스 바꾸기: " + solved51.solution("hello", 1, 2));
//        System.out.println();
//
//        Solved_52 solved52 = new Solved_52();
//        System.out.println("52. 약수 구하기: " + solved52.solution(24));
//        System.out.println();
//
//        Solved_53 solved53 = new Solved_53();
//        int[] num53 = {9, 10, 11, 8};
//        System.out.println("53. 가장 큰 수 찾기: " + solved53.solution(num53));
//        System.out.println();
//
//        Solved_54 solved54 = new Solved_54();
//        int[] box = {10, 8, 6};
//        int n = 3;
//        System.out.println("54. 주사위의 개수: " + solved54.solution(box, n));
//        System.out.println();
//
//        Solved_55 solved55 = new Solved_55();
//        String my_string = "hi12392";
//        System.out.println("55. 문자열 정렬하기 (1): " + solved55.solution(my_string));
//        System.out.println();

//        Solved_56 solved56 = new Solved_56();
//        String cipher = "dfjardstddetckdaccccdegk";
//        int code = 4;
//        System.out.println("암호 해독: " + solved56.solution(cipher, code));
//        System.out.println();

//        Solved_57 solved57 = new Solved_57();
//        String my_string = "Bcad";
//        System.out.println("문자열 정렬하기 (2): " + solved57.solution(my_string));

//        Solved_58 solved58 = new Solved_58();
//        int num = 29183;
//        int k = 1;
//        System.out.println("숫자 찾기: " + solved58.solution(num, k));

        Solved_59 solved59 = new Solved_59();
        int n = 4;
        System.out.println("피자 나눠먹기 (2): " + solved59.solution(n));
    }
}