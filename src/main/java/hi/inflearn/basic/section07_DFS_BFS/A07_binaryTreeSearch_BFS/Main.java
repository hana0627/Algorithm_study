package hi.inflearn.basic.section07_DFS_BFS.A07_binaryTreeSearch_BFS;

import java.util.Queue;
import java.util.LinkedList;

class Node {
    int data;
    Node lt, rt;
    public Node(int val) {
        data = val;
        lt=rt=null;
    }
}
class Main {

    /*
     * 아래와 같은 이진트리를 전위순회와 후위순회를 연습해보세요
     *            1
     *      2           3
     *  4       5    6     7
     *
     *  레벨 탐색 순회 출력 : 1 2 3 4 5 6 7
     */


    Node root;


    public void DFS(Node root) {
        Queue<Node> Q = new LinkedList<>();
        Q.offer(root);
        int L = 0;
        while(!Q.isEmpty()) {
            int len = Q.size();
//            System.out.println("L = " + L);
            for(int i = 0; i<len; i++ ) {
                Node cur = Q.poll();
                System.out.print(cur.data + " ");
                if(cur.lt != null) {
                    Q.offer(cur.lt);
                }
                if(cur.rt != null) {
                    Q.offer(cur.rt);
                }
            }
            L++;
            System.out.println();
        }

    }

    public static void main(String[] args){
        Main tree = new Main();

        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        tree.root.rt.lt = new Node(6);
        tree.root.rt.rt = new Node(7);
        tree.DFS(tree.root);

    }
}
