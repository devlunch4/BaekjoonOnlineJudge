package answer;

import java.util.Scanner;

/**
 * https://www.acmicpc.net/problem/1000
 * 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
 * input : 첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)
 * e.g. 1 2 >> A: 3
 */
public class No1000_Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        // System.out.println("A 값을 입력하세요");
        a = sc.nextInt();
        // System.out.println("B 값을 입력하세요");
        b = sc.nextInt();
        System.out.println(a + b);
    }
}