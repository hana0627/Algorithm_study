package hi.inflearn.basic.section07_DFS_BFS.A07_binaryTreeSearch_BFS;


class Node2 {
    int data;
    Node2 lt,rt = null;
    public Node2(int val) {
        data = val;
        lt=rt=null;
    }
}

public class Main2 {

    Node2 root;

    /*
     * 아래와 같은 이진트리를 너비 우선탐색으로 전위순회와 후위순회를 연습해보세요
     *            1
     *      2           3
     *  4       5    6     7
     *
     *  레벨 탐색 순회 출력 : 1 2 3 4 5 6 7
     */

    private int BFS(int L) {

    }

    public static void main(String[] args) {
        Main2 tree = new Main2();

        tree.root = new Node2(1);
        tree.root.lt = new Node2(2);
        tree.root.rt = new Node2(3);
        tree.root.lt.lt = new Node2(4);
        tree.root.lt.rt = new Node2(5);
        tree.root.rt.lt = new Node2(6);
        tree.root.rt.rt = new Node2(7);

        tree.BFS(1);

    }
}
