package hi.inflearn.basic.section06_Sorting.A06_mischief;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
public class Main {
    /*
    설명

    새 학기가 시작되었습니다. 철수는 새 짝꿍을 만나 너무 신이 났습니다.

    철수네 반에는 N명의 학생들이 있습니다.

    선생님은 반 학생들에게 반 번호를 정해 주기 위해 운동장에 반 학생들을 키가 가장 작은 학생부터 일렬로 키순으로 세웠습니다. // sort


    제일 앞에 가장 작은 학생부터 반 번호를 1번부터 N번까지 부여합니다. 철수는 짝꿍보다 키가 큽니다.

    그런데 철수가 앞 번호를 받고 싶어 짝꿍과 자리를 바꿨습니다.



    선생님은 이 사실을 모르고 학생들에게 서있는 순서대로 번호를 부여했습니다.

    철수와 짝꿍이 자리를 바꾼 반 학생들의 일렬로 서있는 키 정보가 주어질 때 철수가 받은 번호와 철수 짝꿍이 받은 번호를

    차례로 출력하는 프로그램을 작성하세요.


    입력
    첫 번째 줄에 자연수 N(5<=N<=100)이 주어진다.

    두 번째 줄에 제일 앞에부터 일렬로 서있는 학생들의 키가 주어진다.

    키(높이) 값 H는 (120<=H<=180)의 자연수 입니다.


    출력
    첫 번째 줄에 철수의 반 번호와 짝꿍의 반 번호를 차례로 출력합니다.


    예시 입력 1

    9
    120 125 152 130 135 135 143 127 160
    예시 출력 1

    3 8
     */


    public void solution(int size, int[] arr) {

        List<Integer> list = new ArrayList<>();
        int[] tmp = new int[size];

        // 이런코드도 있더라
//         int[] clone = arr.clone();
        for(int i=0 ; i<size; i++) {
            tmp[i] = arr[i];
        }
        
        
        
        Arrays.sort(tmp);


        for(int i = 0; i < size ; i++) {
            if(arr[i] != tmp[i]) {
                list.add(i+1);
            }
        }


        list.forEach(i -> {
            System.out.print(i + " ");
        });




    }


    public static void main(String[] args) {

        Main T = new Main();

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        T.solution(n, arr);

        sc.close();
    }

}


/*

//값은 나오는거 같은데 자꾸 틀렷다고 나옴
// 코드가 더러움 좀 풀이 살짝 보니까 더 이쁘게 풀이할 수 있음
    StringBuilder sb = new StringBuilder();

        boolean flag = true;
        for(int i = 0; i<size-2; i++) {
            if(arr[i] > arr[i+1]) {
                if(flag) {
                    sb.append(i+1 + " "); // 철수
                    flag = false;
                }
                else {
                    sb.append(i+2);
                }
            }
        }

        return sb.toString();

 */