package hi.baekjoon.greedy;

import java.io.*;
import java.util.*;
//https://www.acmicpc.net/problem/1026
public class q01026 {

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int repeat = Integer.parseInt(br.readLine());
        String[] a = br.readLine().split(" ");
        String[] b= br.readLine().split(" ");
        List<Integer> intArr1 = new ArrayList<>();
        List<Integer> intArr2 = new ArrayList<>();



        for (String s : a) {
            intArr1.add(Integer.parseInt(s));
        }
        for (String s : b) {
            intArr2.add(Integer.parseInt(s));
        }
        Collections.sort(intArr1);
        Collections.sort(intArr2);

        int sum = 0;
        for(int i = 0; i<repeat; i++) {
            sum += intArr1.get(i) * intArr2.get(repeat-i-1);
        }

        bw.write(String.valueOf(sum));



        bw.flush();
        bw.close();
        br.close();

    }
}
