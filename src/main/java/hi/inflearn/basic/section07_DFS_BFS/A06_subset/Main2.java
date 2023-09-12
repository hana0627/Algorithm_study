package hi.inflearn.basic.section07_DFS_BFS.A06_subset;

import java.util.Scanner;

public class Main2 {
     /*
       자연수 N이 주어지면 1부터 N까지의 원소를 갖는 집합의 부분집합을 모두 출력하는
       프로그램을 작성하세요


      첫번째 줄부터 각 줄에 하나씩 부분집합을 아래의 출력예제와 같은 술서로 출력한다.
      단 공집합은 출력하지 않습니다.

      입력예제 3

      출력에제
      1 2 3
      1 2
      1 3
      1
      2 3
      2
      3
     */


    private void DFS(int L) {
        StringBuilder sb = new StringBuilder();
        if(L == n+1) {
            for(int i = 0; i<n; i++) {
                if(ch[i] == 1) {
                    sb.append(i).append(" ");
                }
            }
            if(sb.length() > 0) {
                System.out.println(sb);
            }
        }
        else {
            ch[L] = 1;
            DFS(L+1);
            ch[L] = 0;
            DFS(L+1);
        }


    }

    private static int n;
    private static int[] ch;

    public static void main(String[] args) {

        Main T = new Main();

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        ch = new int[n+1];
        T.DFS(1);


        sc.close();
    }
}
