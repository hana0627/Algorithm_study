package hi.inflearn.basic.section07_DFS_BFS.A03_factorial;

import java.util.Scanner;

public class Main {
    /*
        자연수 N이 입력되면 N!을 구하는 프로그램을 작성하세요
        예를들어 5! = 5*4*3*2*1 = 120입니다.
     */
//    private static int num = 1;

    public int DFS(int n) {

        if(n ==1) {
            return 1;
        }

        else{
            // 이렇게 풀이해서 num 반환했었음.
//            num *= num *DFS(n-1);
           return n * DFS(n-1);
        }

    }



    public static void main(String[] args) {

        Main T = new Main();

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(T.DFS(n));

        sc.close();
    }
}
