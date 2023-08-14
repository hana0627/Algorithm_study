package hi.algorithmtest;

import java.io.*;
import java.util.*;

public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void testCase(int caseNum) throws IOException {
        //하나의 테스트케이스를 처리하는 함수
        //각 테스트케이스에 대하여 데이터를 입력받고 정답을 출력하세요
        List<String> stringList = new ArrayList<>();
        int repeat = Integer.parseInt(br.readLine());
        for(int i = 0; i < repeat; i++) {
            String s = br.readLine();
            stringList.add(s);
        }
        // stringList = "127-122-0", "255-128-3","254-128-19"
        int tmp = stringList.get(0).length();

        for(int i = 0; i< tmp; i++) {

        }

        bw.write("a");



    }
    public static void main(String[] args) throws IOException {

        int tn = Integer.parseInt(br.readLine());

        for(int caseNum = 1 ; caseNum <= tn ; caseNum++)
        {   //테스트케이스의 수 만큼 반복 수행한다
            testCase(caseNum);
        }

        bw.flush();
        bw.close();
        br.close();
    }


}
