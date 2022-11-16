package java.programmers_test.level_0;

public class BacterialGrowth {
    class Solution {
        public int solution(int n, int t) {
            int answer = 0;
            int indices = 1;
            for(int i = 0 ; i<t ; i++){
                indices = indices*2;
            }
            answer = n * indices;
            return answer;
        }
    }
    // 해결은 하였지만 좋지 못한 방법이였던것 같다.


    //더 나은풀이
    class Solution1 {
        public int solution(int n, int t) {
            int answer = 0;

            answer = n << t;

            return answer;
        }
    }
}
