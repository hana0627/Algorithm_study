package hi.baekjoon.greedy;

import java.io.*;
import java.util.Scanner;

public class q02864 {
    //https://www.acmicpc.net/problem/2864
    private static int min(char[] ch) {
        for(int i = 0 ; i<ch.length; i++) {
            if(ch[i]=='6') {
                ch[i] = '5';
            }
        }
        String change = String.valueOf(ch);
        return Integer.parseInt(change);
    }

    private static int max (char[] ch) {
        for(int i = 0 ; i<ch.length; i++) {
            if(ch[i]=='5') {
                ch[i] = '6';
            }
        }
        String change = String.valueOf(ch);
        return Integer.parseInt(change);
    }
    public static void main(String[] args) throws IOException {


        Scanner sc = new Scanner(System.in);
        char[] A = new char[0];
        char[] B = new char[0];
        String a ="";
        String b ="";
        int c = 0;
        int d = 0;
        while(sc.hasNext()){
            c = sc.nextInt();
            d = sc.nextInt();
            a = String.valueOf(c);
            b = String.valueOf(d);
            A = a.toCharArray();
            B = b.toCharArray();


            int a1 = min(A);
            int b2 = min(B);
            int c3 = max(A);
            int d4 = max(B);

            System.out.println(a1+b2);
            System.out.println(c3+d4);
        }
        sc.close();



    }
}



