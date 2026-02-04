//다른 사람 풀이
// 중앙값 구하기 

import java.util.Arrays;

class Solution {
    public int solution(int[] array) {
        Arrays.sort(array);
        return array[array.length >> 1];
    }
}
