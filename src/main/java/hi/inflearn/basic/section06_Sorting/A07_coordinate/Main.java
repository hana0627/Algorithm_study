package hi.inflearn.basic.section06_Sorting.A07_coordinate;

import java.util.Collections;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {
    /*
    설명

    N개의 평면상의 좌표(x, y)가 주어지면 모든 좌표를 오름차순으로 정렬하는 프로그램을 작성하세요.

    정렬기준은 먼저 x값의 의해서 정렬하고, x값이 같을 경우 y값에 의해 정렬합니다.


    입력
    첫째 줄에 좌표의 개수인 N(3<=N<=100,000)이 주어집니다.

    두 번째 줄부터 N개의 좌표가 x, y 순으로 주어집니다. x, y값은 양수만 입력됩니다.


    출력
    N개의 좌표를 정렬하여 출력하세요.


    예시 입력 1

    5
    2 7
    1 3
    1 2
    2 5
    3 6
    예시 출력 1

    1 2
    1 3
    2 5
    2 7
    3 6
     */


    public static void main(String[] args) {

        Main T = new Main();

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Point> arr = new ArrayList<>();
        for(int i = 0; i<n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            arr.add(new Point(x,y));
        }
        
        
        Collections.sort(arr); // compareTo의 메소드를 이용해서 정렬해줌

        for(Point p : arr) {
            System.out.println(p.x + " "+p.y);
        }


        sc.close();
    }

}

class Point implements Comparable<Point>{
    int x; int y;
    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Point o) {
        //뺄셈의 값이 음수면 오름차순
        //양수면 내림차순
        if(this.x == o.x) {
            return this.y - o.y;
        }
        else {
            return this.x - o.x;
        }
    }
}