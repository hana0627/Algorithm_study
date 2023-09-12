package hi.inflearn.basic.section07_DFS_BFS.A04_Fibonacci;

import java.util.Scanner;

public class Main {
    /*
       피보나치 수열을 출력한다.
       피보나치 수열 : 앞의 2개의 수를 합하여 다음 숫자가 되는 수열
       ex) 1 1 2 3 5 8 13 21 34 55 ....
     */

    /**
     * TODO
     * for문은 어떤 프레임 없이 stackFrame 하나로 수행
     * 
     * 재귀함수의 경우에는
     * statckFrame이 엄청 많이 생겨서 성능적으로 안좋음
     */






    static int[] fibo;


    private int DFS(int n) {
        if(n ==1) {
            fibo[1] = 1;
        }
        if(n == 2) {
            fibo[2] = 1;
        }
        else {
            if(fibo[n] == 0) {
                fibo[n] = fibo[n-1] + fibo[n-2];
            }
        }
        return fibo[n];

    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        fibo = new int[n+1];

        for(int i = 1; i<=n; i++) {
            System.out.print(T.DFS(i) + " ");
        }


    }




//    static int[] fibo;
//
//    public int  DFS(int n) {
//        if(fibo[n]>0) {
//            return fibo[n];
//        }
//        if(n == 1) {
//            return fibo[1] = 1;
//        }
//        if(n == 2) {
//            return fibo[2] = 1;
//        }
//        else {
//            return fibo[n] = DFS(n-2) + DFS(n-1);
//        }
//    }



//    public static void main(String[] args) {
//
//        Main T = new Main();
//
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        long start = System.currentTimeMillis();
//
//        fibo = new int[n+1];
//        T.DFS(n);
//        for(int i =1 ; i<=n; i++) {
//            System.out.print(fibo[i] + " ");
//        }
//
//        long end = System.currentTimeMillis();
//        System.out.println("\n소요시간 = " + (end-start));
//
//
//
//
//        sc.close();
//    }




//    static int[] fibo;
//
//    public int  DFS(int n) {
//        if(n == 1) {
//            return fibo[1] = 1;
//        }
//        if(n == 2) {
//            return fibo[2] = 1;
//        }
//        else {
//            return fibo[n] = DFS(n-2) + DFS(n-1);
//        }
//    }
//
//
//
//    public static void main(String[] args) {
//
//        Main T = new Main();
//
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        long start = System.currentTimeMillis();
//
//        fibo = new int[n+1];
//        T.DFS(n);
//        for(int i =1 ; i<=n; i++) {
//            System.out.print(fibo[i] + " ");
//        }
//
//        long end = System.currentTimeMillis();
//        System.out.println("\n소요시간 = " + (end-start));
//
//
//
//
//        sc.close();
//    }


//    public int  DFS(int n) {
//        if(n == 1) {
//            return 1;
//        }
//        if(n == 2) {
//            return 1;
//        }
//        else {
//            return DFS(n-2) + DFS(n-1);
//        }
//    }
//
//
//
//    public static void main(String[] args) {
//
//        Main T = new Main();
//
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        long start = System.currentTimeMillis();
//
//        for(int i=1; i<=n ;i++) {
//            System.out.print(T.DFS(i) + " ");
//        }
//        long end = System.currentTimeMillis();
//
//        System.out.println("\n소요시간 = " + (end-start));
//
//        sc.close();
//    }
}
