package hi.inflearn.basic.section07_DFS_BFS.A02_binary;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    /*
     10진수 N이 입력되면 2진수로 변환하여 출력하는 프로그램을 작성하세요.
     단 재귀함수를 이요해서 출력해야 합니다.
     */

    public void DFS(int n) {

        if(n ==0) {
            return;
        }

        else{
            DFS(n/2);
            System.out.print(n%2);
        }

    }


    public static void main(String[] args) {

        Main T = new Main();

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        T.DFS(n);

        sc.close();
    }

}
