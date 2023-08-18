package hi.inflearn.basic.section03_two_pointers.A01_sumtwoArray;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {
    /*
    설명

    오름차순으로 정렬이 된 두 배열이 주어지면 두 배열을 오름차순으로 합쳐 출력하는 프로그램을 작성하세요.


    입력
    첫 번째 줄에 첫 번째 배열의 크기 N(1<=N<=100)이 주어집니다.

    두 번째 줄에 N개의 배열 원소가 **오름차순으로** 주어집니다.

    세 번째 줄에 두 번째 배열의 크기 M(1<=M<=100)이 주어집니다.

    네 번째 줄에 M개의 배열 원소가 **오름차순으로** 주어집니다.

    각 리스트의 원소는 int형 변수의 크기를 넘지 않습니다.


    출력
    오름차순으로 정렬된 배열을 출력합니다.

    예시입력 :
    3
    1 3 5
    5
    2 3 6 7 9



    예시출력 : 1 2 3 3 5 6 7 9
     */



    public void solution (int n, int m, int[] arr1, int[] arr2) {
        int p1 = 0;
        int p2 = 0;
        int len = n+m;

        List<Integer> answer = new ArrayList<>();


        for(int i =0; i<len; i++) {
            // if문 두개 대신에 while조건의 풀이도 있음
            if(p1 == n) {
                answer.add(arr2[p2++]);
            }

            else if(p2 == m) {
                answer.add(arr1[p1++]);
            }


            else if(arr1[p1] >= arr2[p2]) {
                answer.add(arr2[p2++]);
            }
            else if(arr2[p2] > arr1[p1]) {
                answer.add(arr1[p1++]);
            }
        }


        answer.forEach(i -> {
            System.out.print(i + " ");
        });

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

        // 시간복잡도 생각 O(NlogN) -> O(N)
         int len = n+m;

        int[] answer = new int[len];

        for(int i = 0; i<n ; i++) {
            answer[i] = arr1[i];
        }
        for(int i = 0; i<m ; i++) {
            answer[i+n] = arr2[i];
        }

        int tmp;
        for(int i =0; i<len; i++) {
            for(int k = i ; k<len; k++) {
                if(answer[i] > answer[k]) {
                    tmp = answer[i];
                    answer[i] = answer[k];
                    answer[k] = tmp;

                }
            }
        }

        for(int i : answer) {
            System.out.print(i + " ");
        }

 */




/*

        강의에서 이렇게 풀지말라함...

        int[] answer = new int[n+m];

        for(int i = 0; i<n ; i++) {
            answer[i] = arr1[i];
        }
        for(int i = 0; i<m ; i++) {
            answer[i+n] = arr2[i];
        }

        Arrays.sort(answer);
        for(int x : answer) {
            System.out.print(x + " ");
        }

 */

/*
   //너무 양아치처럼 풀었나... 맞잖아 이거.. 
   
    // 문제를 잘못읽었음. 중복제거 안해도 됨, 훨씬쉬움

        int answer = 0;

        Set<Integer> set = new HashSet<>();

        for(int i : arr1) {
            set.add(i);
        }
        for(int i : arr2) {
            set.add(i);
        }

        set.stream().sorted().forEach(i -> {
            System.out.print(i + " ");
        });

 */
