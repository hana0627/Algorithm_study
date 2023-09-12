package hi.inflearn.basic.section07_DFS_BFS.A05_binaryTreeSearch_DFS;


class Node2 {
    int data;
    Node2 lt,rt = null;

    public Node2(int val) {
        data = val;
        lt = rt = null;
    }
}
public class Main2 {

    /*
     * 아래와 같은 이진트리를 전위순회와 후위순회를 연습해보세요
     *            1
     *      2           3
     *  4       5    6     7
     *
     * 전위순회 출력 : 1 2 4 5 3 6 7
     * 중위순회 출력 : 4 2 5 1 6 3 7
     * 후위순회 출력 : 4 5 2 6 7 3 1
     *
     */



    //중위순회
    private void DFS3(Node node) {
        if(node.lt != null) {
            DFS3(node.lt);
        }
        if(node.rt != null) {
            DFS3(node.rt);
        }
        System.out.print(node.data + " ");
    }

    //중위순회
    private void DFS2(Node node) {
        if(node.lt != null) {
            DFS2(node.lt);
            System.out.print(node.data + " ");
        }
        if(node.rt != null) {
            DFS2(node.rt);
        }
    }


    //중위순회
    private void DFS1(Node node) {
        System.out.print(node.data + " ");
        if(node.lt != null) {
            DFS1(node.lt);
        }
        if(node.rt != null) {
            DFS1(node.rt);
        }
    }


    Node root;
    public static void main(String[] args) {

        Main T = new Main();
        T.root = new Node(1);
        T.root.lt = new Node(2);
        T.root.rt = new Node(3);
        T.root.lt.lt = new Node(4);
        T.root.lt.rt = new Node(5);
        T.root.rt.lt = new Node(6);
        T.root.rt.rt = new Node(7);

        // T.DFS1(T.root);
        // T.DFS2(T.root);
        T.DFS3(T.root);

    }


}
