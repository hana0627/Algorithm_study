package hi.inflearn.basic.section03_two_pointers.A03_max_sales;

import java.util.Scanner;

public class Main {
    /*
    설명

    현수의 아빠는 제과점을 운영합니다. 현수 아빠는 현수에게 N일 동안의 매출기록을 주고 연속된 K일 동안의 최대 매출액이 얼마인지 구하라고 했습니다.

    만약 N=10이고 10일 간의 매출기록이 아래와 같습니다. 이때 K=3이면

    12 15 11 20 2510 20 19 13 15

    연속된 3일간의 최대 매출액은 11+20+25=56만원입니다.

    여러분이 현수를 도와주세요.


    입력
    첫 줄에 N(5<=N<=100,000)과 K(2<=K<=N)가 주어집니다.

    두 번째 줄에 N개의 숫자열이 주어집니다. 각 숫자는 500이하의 음이 아닌 정수입니다.


    출력
    첫 줄에 최대 매출액을 출력합니다.


    예시 입력
    10 3
    12 15 11 20 25 10 20 19 13 15

    예시 출력
    56

     */



    public int solution (int n, int m, int[] arr) {

        int max = 0;
        int tmp = 0;

        for(int i =0; i<m; i++) {
            tmp += arr[i];
        }

        for(int i=m; i<n; i++) {

            tmp += arr[i] - arr[i - m];
//            System.out.println("i = " + i + " tmp = " + tmp);
//            System.out.println("arr[i] = " + arr[i]);

            max = Math.max(tmp,max);
        }
        return max;

    }



    public static void main(String[] args) {

        Main T = new Main();

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int arr[] = new int[n];
        for(int i = 0; i<n ; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(T.solution(n,m,arr));

        sc.close();
    }
}

/*

        // for 문기마다 if - else? 맘에안듬

        for(int i=0; i<n; i++) {

            if(i < m) {
                tmp+=arr[i];
            }else {
                tmp += arr[i];
                tmp -= arr[i-m];

                if(tmp > max) {
                    max = tmp;
                }
            }
            System.out.println("i = " + i + " tmp = " + tmp);
            System.out.println("arr[i] = " + arr[i]);

        }


 */

/*

        시간제한 : 1000MS
        시간소요 : 1427ms

        int max = 0;
        int tmp = 0;

        for(int i=0; i<n-m+1; i++) {
            for(int k = i; k<m+i ; k++) {
                tmp += arr[k];
            }
            if(tmp > max) {
                max = tmp;
            }
            tmp = 0;
        }


        return max;

 */