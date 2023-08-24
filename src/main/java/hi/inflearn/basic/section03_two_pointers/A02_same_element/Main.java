package hi.inflearn.basic.section03_two_pointers.A02_same_element;

import java.util.*;

public class Main {
    /*
    설명

    A, B 두 개의 집합이 주어지면 두 집합의 공통 원소를 추출하여 오름차순으로 출력하는 프로그램을 작성하세요.


    입력
    첫 번째 줄에 집합 A의 크기 N(1<=N<=30,000)이 주어집니다.

    두 번째 줄에 N개의 원소가 주어집니다. 원소가 중복되어 주어지지 않습니다.

    세 번째 줄에 집합 B의 크기 M(1<=M<=30,000)이 주어집니다.

    네 번째 줄에 M개의 원소가 주어집니다. 원소가 중복되어 주어지지 않습니다.

    각 집합의 원소는 1,000,000,000이하의 자연수입니다.


    출력
    두 집합의 공통원소를 오름차순 정렬하여 출력합니다.
    
    예시입력
    5
    1 3 9 5 2
    5
    3 2 5 7 8

    예시출력
    2 3 5

     */



    public void solution (int n, int m, int[] arr1, int[] arr2) {

        // arr1 정렬, arr2정렬 -> 공통원소 추출
        int temp = 0 ;
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int len = n+m;
        int p1 = 0;
        int p2 = 0;

        List<Integer> answer = new ArrayList<>();

        while(p1 < n && p2<m) {
            if(arr1[p1]==arr2[p2]) {
                answer.add(arr1[p1]);
                p1++;p2++;
            }
            else if(arr1[p1] < arr2[p2]) {
                p1++;
            }
            else if(arr1[p1] > arr2[p2]) {
                p2++;
            }
        }

        for(int i: answer) {
            System.out.print(i + " ");
        }

    }



    public static void main(String[] args) {

        Main T = new Main();

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr1[] = new int[n];
        for(int i = 0; i<n ; i++) {
            arr1[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int arr2[] = new int[m];
        for(int i = 0; i<m ; i++) {
            arr2[i] = sc.nextInt();
        }

        T.solution(n, m, arr1, arr2);

        sc.close();
    }
}


/*

        시간 제한 : 1000MS
        실행시간 : 1800MS
        더 나은 방법이 있나? 이게 최선아니야....?

        // arr1 정렬, arr2정렬 -> 공통원소 추출

        int temp = 0 ;
        for(int i = 0; i<n ; i++) {
            for(int k = i ; k<n; k++) {
                if(arr1[i] > arr1[k]) {
                    temp = arr1[i];
                    arr1[i] = arr1[k];
                    arr1[k] = temp;
                }
            }
        }


        for(int i = 0; i<m ; i++) {
            for(int k = i ; k<m; k++) {
                if(arr2[i] > arr2[k]) {
                    temp = arr2[i];
                    arr2[i] = arr2[k];
                    arr2[k] = temp;
                }
            }
        }


        int len = n+m;
        int p1 = 0;
        int p2 = 0;

        List<Integer> answer = new ArrayList<>();

        while(p1 < n && p2<m) {
            if(arr1[p1]==arr2[p2]) {
                answer.add(arr1[p1]);
                p1++;p2++;
            }
            else if(arr1[p1] < arr2[p2]) {
                p1++;
            }
            else if(arr1[p1] > arr2[p2]) {
                p2++;
            }
        }

        answer.forEach(i -> {
            System.out.print(i + " ");
        });



 */