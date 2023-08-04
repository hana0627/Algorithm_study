package hi.inflearn.basic.section01_String.A04_ReverseWord;

import java.util.Scanner;

        /*
        설명

        N개의 단어가 주어지면 각 단어를 뒤집어 출력하는 프로그램을 작성하세요.


        입력
        첫 줄에 자연수 N(3<=N<=20)이 주어집니다.

        두 번째 줄부터 N개의 단어가 각 줄에 하나씩 주어집니다. 단어는 영어 알파벳으로만 구성되어 있습니다.


        출력
        N개의 단어를 입력된 순서대로 한 줄에 하나씩 뒤집어서 출력합니다.


        */

public class Main {

    public void solution(String[] strings) {

        char[] tempChar = new char[]{};
        // 들어온 String 수만큼 반복
        for(int i = 0 ; i< strings.length; i++) {
            tempChar = strings[i].toCharArray();
            char[] tempChar2 = new char[tempChar.length];
            //숫자 뒤집기
            for(int j = 0; j<tempChar.length; j++) {
                tempChar2[j] = tempChar[(tempChar.length-1-j)];
            }
            strings[i] = String.valueOf(tempChar2);
        }
        
        
        //출력
        for(String s : strings) {
            System.out.println(s);
        }

    }
    public static void main(String[] args) {

        Main T = new Main();

        Scanner sc = new Scanner(System.in);

        int iter = sc.nextInt();
        String[] strings = new String[iter];

        for(int i = 0 ; i< strings.length; i++) {
            strings[i] = sc.next();
        }

        T.solution(strings);
    }
}
