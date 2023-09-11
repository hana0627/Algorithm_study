package hi.inflearn.basic.section07_DFS_BFS.A09_terminalNode;

import java.util.Scanner;

class Node {
    int data;
    Node rt, lt;

    public Node(int val) {
        data = val;
        lt=rt=null;
    }
}
public class Main {
    /*
    설명

    아래 그림과 같은 이진트리에서 루트 노드 1에서 말단 노드까지의 길이 중 가장 짧은 길이를 구하는
    프로그램을 작성하세요
    각 경로의 길이는 루트노드에서 말단노느까지 가는데 이동하는 횟수(간선)의 갯수를 길이로 합니다
     */

    Node root;

    private int DFS(int L, Node root) {
        if(root.lt == null && root.rt == null) {
            return L;
        }
        else {
            return Math.min(DFS(L+1,root.lt), DFS(L+1, root.rt));
        }
    }


    public static void main(String[] args) {

        Main tree = new Main();

        Scanner sc = new Scanner(System.in);

        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);

        System.out.print(tree.DFS(0, tree.root));

        sc.close();
    }


}
