// 프로그래머스 < 코딩테스트 입문 - Day2 < 배열 두 배 만들기

class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length]; //입력 배열 길이만큼 결과 배열 생성
         
        for(int i = 0; i < numbers.length; i++) { //i를 0부터 시작해서 배열 끝까지 하나씩 증가시키면서
            answer[i] = numbers[i] * 2; //같은 위치의 값을 2배
        }
        return answer;
    }
}
