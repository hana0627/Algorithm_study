package hi.inflearn.basic.section07_DFS_BFS.A14_navigation3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    /*
    다음 그래프에서 1번 정점에서 각 정점으로 가는 최소 이동 간선수를 출력하세요


    입력설명
    첫째 줄에는 정점의 수 (1<=N<=20)와 간선의 수 M이 주어진다. 그 다음부터 M줄에 걸쳐 연결정보가 주어진다.

    출력설명
    1번 정점에서 각 정점으로 가는 최소 간선수를 2번 정점부터 차례대로 출력하세요.

    입력예제
    6 9
    1 3
    1 4
    2 1
    2 5
    3 4
    4 5
    4 6
    6 2
    6 5

    출력예제
    2 : 3
    3 : 1
    4 : 1
    5 : 2
    6 : 2
     */
    static int n, m = 0;
    static ArrayList<ArrayList<Integer>> graph;
    static int[] ch, dis;

    private void BFS(int v) {
        Queue<Integer> Q = new LinkedList<>();
        ch[v] = 1;
        dis[v] = 0;
        Q.offer(v);
        while(!Q.isEmpty()) {
            int current = Q.poll();
            for(int nv: graph.get(current)) {
                if(ch[nv] ==0) {
                    ch[nv]=1;
                    Q.offer(nv);
                    dis[nv]=dis[current] +1;
                }
            }
        }
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        graph = new ArrayList<ArrayList<Integer>>();

        for(int i = 0; i<n; i++) {
            graph.add(new ArrayList<Integer>());
        }
        ch = new int[n+1];
        dis = new int[n+1];

        for(int i = 0; i<m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph.get(a).add(b);
        }

        ch[1] = 1;
        T.BFS(1);
        for(int i = 2; i<= n; i++) {
            System.out.println(i + " : " + dis[i]);
        }
    }

}
