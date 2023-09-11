package hi.inflearn.basic.section07_DFS_BFS.A12_navigationBFS;

import java.util.Scanner;

public class Main {
    /*
    방향그래프가 주어지면 1번 정점에서 n번 정점으로 가는 모든 경로의 가지 수를 출력하는
    프로그램을 작성하세요.
    아래 1그래프에서 1번 정점에서 5번 정점으로 가는 가지수는 6가지 입니다.

    입력설명
    첫째 줄에는 정점의 수 (1<=N<=20)와 간선의 수 M이 주어진다.
    그 다음부터 M줄에 걸쳐 연결정보가 주어진다.

    입력예제 1
    5 9
    1 2
    1 3
    1 4
    2 1
    2 3
    2 5
    3 4
    4 2
    4 5

    출력예제 6
     */


    static int[][ ] graph;
    static int[] ch; // 한번 방문한 노드는 재방문할 수 없음
    static int n,m,answer = 0;

    private void DFS(int v) {
        if(v == n) {
            answer++;
        }else {
            for(int i = 1; i<n ; i++) {
                if(graph[v][i]==1 && ch[i]==0){
                    ch[i] = 1;
                    DFS(i);
                    ch[i] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        graph = new int[n+1][n+1];
        ch = new int[n+1];
        

        for(int i = 0 ; i<m ; i++) {
            int a=sc.nextInt();
            int b=sc.nextInt();
            graph[a][b]=1;
        }

        ch[1] = 1;
        T.DFS(1);
        System.out.println(answer);
    }
}
