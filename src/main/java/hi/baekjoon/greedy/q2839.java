package hi.baekjoon.greedy;

import java.util.Scanner;

public class q2839 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int sugar = sc.nextInt();
        sc.close();

        int five = 0;
        int three = 0;
        int tmp = sugar;
        while (true) {
            if (tmp >= 5) {
                System.out.println("1번");
                tmp -= 5;
                five++;
                System.out.println("tmp = " + tmp);
            } else if (tmp >= 3) {
                System.out.println("2번");
                tmp -= 3;
                three++;
                System.out.println("tmp = " + tmp);
            } else if (tmp > 0 && tmp + 5 < sugar) {
                System.out.println("3번");
                tmp += 5;
                five--;
                tmp -= 3;
                three++;
                System.out.println("tmp = " + tmp);
            } else if (tmp == 0) {
                System.out.println("4번");
                System.out.println(five + three);
                break;
            } else if(tmp<3) {
                System.out.println("5번");
                System.out.println(five + three + 1);
                break;
            }
            else {
                System.out.println("6번");
                System.out.println(-1);
                break;
            }

        }

    }
}

