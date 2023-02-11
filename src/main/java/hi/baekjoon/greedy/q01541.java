package hi.baekjoon.greedy;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class q01541 {
    //https://www.acmicpc.net/problem/1541
    //TODO 반례못찾겠음
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        String param = br.readLine();

        int result = logic(param);
        System.out.println("?? => " + result);

        bw.write(String.valueOf(result));

        bw.flush();
        bw.close();
        br.close();
    }


    private static int logic(String param) {


        // 해결방법 - ~~ - 사이에 + 있으면 거기 괄호

        List<Character> operator = param.chars()
                .filter(c -> c == '-' || c == '+')
                .mapToObj(c -> (char) c)
                .collect(Collectors.toList());

//        List<String> operator = Arrays.stream(param.);

        // 한 스트림에서 합칠 수 있을것 같은데..
        List<String> collect = Arrays.stream(param.split("[+,-]"))
                .collect(Collectors.toList());

        List<Integer> number = new ArrayList<>();
        for (String s : collect) {
            number.add(Integer.parseInt(s));
        }
        // 한 스트림에서 합칠 수 있을것 같은데..

        //number stream이 operator stream보다 1개 더 많음
        int result = number.get(0);
        System.out.println("기본값 => " + result);
        int flag = 0;
        for(int i = 0; i<operator.size(); i++){
            if(operator.get(i)=='-'&& flag==0){
                System.out.println("1번if");
                // -를 처음만나면 무조건 빼
                flag++;
                result -= number.get(i+1);
            }
            else if(operator.get(i)=='-' && flag ==1){
                System.out.println("2번if");
                flag--;
                result -= number.get(i+1);

            }
            else if(operator.get(i)=='+' && flag ==1){
                System.out.println("3번if");
                result -= number.get(i+1);
            }
            else if(operator.get(i)=='+' && flag ==0){
                System.out.println("4번if");
                result += number.get(i+1);
            }
            System.out.println("결과확인 => " + result);

        }
        return result;

    }


}