package hi.inflearn.basic.section07_DFS_BFS.A01_stack_frame;

import java.util.*;
class Main {

    /*
     * 자연수 N이 입력되면 재귀함수를 이용하여 1부터 N까지 출력하는 프로그램을 작성하세요.
     */
    public void DFS(int n){
        if(n==0) {
            return;
        }
        else{
            DFS(n-1);
            System.out.print(n+" ");
        }
    }

    public void solution(int n){
        DFS(n);
    }
    public static void main(String[] args){
        Main T = new Main();

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        T.solution(n);
        //System.out.println(T.solution(3));
    }
}