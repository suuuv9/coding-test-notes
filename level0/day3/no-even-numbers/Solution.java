// 프로그래머스 < 코딩테스트 입문 - Day2 < 짝수는 싫어요
//1부터 n까지의 홀수만 모아서 배열로 반환하는 문제

class Solution {
    public int[] solution(int n) {
        int size = (n + 1) / 2; //홀수 개수 = (n + 1) / 2
        int[] answer = new int[size]; //홀수 개수를 구해 배열 크기 만들기

        for (int i = 0; i < size; i++) {
            answer[i] = 2 * i + 1; // 1, 3, 5, ..
        }

        return answer;
    }
}
