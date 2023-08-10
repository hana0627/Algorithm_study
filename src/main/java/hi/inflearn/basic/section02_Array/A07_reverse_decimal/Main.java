package hi.inflearn.basic.section02_Array.A07_reverse_decimal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    /*
    설명

    N개의 자연수가 입력되면 각 자연수를 뒤집은 후 그 뒤집은 수가 소수이면 그 소수를 출력하는 프로그램을 작성하세요.

    예를 들어 32를 뒤집으면 23이고, 23은 소수이다. 그러면 23을 출력한다. 단 910를 뒤집으면 19로 숫자화 해야 한다.

    첫 자리부터의 연속된 0은 무시한다.


    입력
    첫 줄에 자연수의 개수 N(3<=N<=100)이 주어지고, 그 다음 줄에 N개의 자연수가 주어진다.

    각 자연수의 크기는 100,000를 넘지 않는다.


    출력
    첫 줄에 뒤집은 소수를 출력합니다. 출력순서는 입력된 순서대로 출력합니다.

    예시입력 :
        9
        32 55 62 20 250 370 200 30 100

    예시출력 : 23 2 73 2 3
     */



    public boolean isPrime(int num) {
        if(num == 1) return false;
        for(int i = 2; i<num; i++) {
            if(num%i == 0) return false;
        }
        return true;
    }


    public List<Integer> solution(int n, int[] arr) {
        List<Integer> answer = new ArrayList<>();


        int number = 0;
        for(int i = 0; i<n; i++) {
            StringBuilder sb = new StringBuilder();

            // STEP1. 일단 각 숫자를 뒤집는다.
            number = arr[i];

            //StringBuilder의 append를 이용했는데 더 나은 방법이 있을까?
            while(number > 0) {
                sb.append(number%10); // 10으로 나눈 나머지는 첫째자리수
                number = number/10; // sb에 append 했으니 첫째자리수를 지워준다.
            }


            //STEP2. 소수인지 확인한다.
            int reverseInt = Integer.parseInt(sb.toString());



            if(isPrime(reverseInt)) {
                answer.add(reverseInt);
            }



//            if (reverseInt == 1) continue;
//
//            double root = Math.sqrt(reverseInt);
//
//            int tmp = 0;
////            for(int k = 2; k<root; k++) {
//            for(int k = 2; k<reverseInt; k++) {
//                if(reverseInt % reverseInt == 0) {
//                    tmp++;
//                }
//            }
//            if(tmp == 0 ) {
//                answer.add(reverseInt);
//            }
        }


        return answer;

    }
    public static void main(String[] args) {

        Main T = new Main();

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0; i<n ; i++) {
            arr[i] = sc.nextInt();
        }
        for(int x : T.solution(n, arr)) {
            System.out.print(x + " ");
        }

        sc.close();
    }
}
