package hi.baekjoon.greedy;

import java.io.*;

public class Main {
    //https://www.acmicpc.net/problem/2212
    public static void main(String[] args) throws IOException {

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String param = br.readLine(); // 센서
        String param2 = br.readLine(); // 집중국
        int repeat = Integer.parseInt(param);

        int[] list = new int[repeat];

        for(int i =0 ; i<repeat; i++) {
            list[i] = Integer.parseInt(br.readLine());
        }

        solution(repeat, list);


        bw.flush();
        bw.close();
        br.close();
    }
    private static void solution(int repeat, int[] list) {

    }
}
