/ 프로그래머스 < 코딩테스트 입문 - Day3 < 최빈값 구하기

  class Solution {
    public int solution(int[] array) {

        int[] count = new int[1000]; //숫자 등장 횟수 

        //빈도 계산
        for (int i = 0; i < array.length; i++) {
            count[array[i]]++;
        }

        int maxCount = 0; //최대 등장 횟수 
        int answer = -1; //최대 횟수를 가진 숫자

        //최빈값 찾기
        for (int i = 0; i < count.length; i++) {
            if (count[i] > maxCount) {
                maxCount = count[i];
                answer = i;
            } else if (count[i] == maxCount && maxCount != 0) {
                answer = -1; // 최빈값이 여러 개
            }
        }

        return answer;
    }
}
