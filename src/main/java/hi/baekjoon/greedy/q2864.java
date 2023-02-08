package hi.baekjoon.greedy;

import java.io.*;
import java.util.Scanner;

public class q2864 {
    //https://www.acmicpc.net/problem/2864
    public static int min(char[] ch) {
        for(int i = 0 ; i<ch.length; i++) {
            if(ch[i]=='6') {
                ch[i] = '5';
            }
        }
        String change = String.valueOf(ch);
        return Integer.parseInt(change);
    }

    public static int max (char[] ch) {
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
        while(sc.hasNextInt()){
            A = sc.nextLine().toCharArray();
            B = sc.nextLine().toCharArray();
            break;
        }
        // 두 숫자가 한라인에서 입력이 주어진다는데
        // 뭐 ㅡㅡ 왜안되는데ㅡㅡ
        // 콘솔에 찍으려니까 지금 이러고 잇는거지 쓰지도 않는거ㅡㅡ

        int a = min(A);
        int b = min(B);
        int c = max(A);
        int d = max(B);

        System.out.println(a+b);
        System.out.println(c+d);
        sc.close();




//        bw.flush();
//        bw.close();
//        br.close();
    }
}

