package hi.inflearn.basic.section07_DFS_BFS.A05_binaryTreeSearch_DFS;


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
     * 전위순회 출력 : 1 2 4 5 3 6 7
     * 중위순회 출력 : 4 2 5 1 6 3 7
     * 후위순회 출력 : 4 5 2 6 7 3 1
     *
     */


    Node root;

    //후위순회
    public void DFS3(Node root) {
        //말단노드
        if(root == null) {
            return;
        }
        else {
            DFS3(root.lt);
            DFS3(root.rt);
            System.out.print(root.data + " ");
        }
    }


    //중위순회
    public void DFS2(Node root) {
        //말단노드
        if(root == null) {
            return;
        }
        else {
            DFS2(root.lt);
            System.out.print(root.data + " ");
            DFS2(root.rt);
        }
    }


    // 전위순회
    public void DFS1(Node root) {
        //말단노드
        if(root == null) {
            return;
        }
        else {
            System.out.print(root.data + " ");
            DFS1(root.lt);
            DFS1(root.rt);
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
        System.out.println("전위순회");
        tree.DFS1(tree.root);
        System.out.println("\n중위순회");
        tree.DFS2(tree.root);
        System.out.println("\n후위순회");
        tree.DFS3(tree.root);

    }
}
