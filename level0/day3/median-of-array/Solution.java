//프로그래머스 < 코딩 테스트 입문 - day3 < 중앙값 구하기(배열)

class Solution {
    public int solution(int[] array) {

        // 배열 오름차순 정렬
        //앞에 있는 하나의 값(i)을 기준으로 잡고, 그 뒤에 있는 모든 값(j)과 전부 비교한다!
        for (int i = 0; i < array.length - 1; i++) { //기준 위치 하나 잡고
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) { // 그 뒤에 있는 값들이랑 전부 비교
                    int temp = array[i];
                    array[i] = array[j]; // 앞에 있는 값이 더 크면
                    array[j] = temp; // 바꾸기
                }
            }
        }

        return array[array.length / 2];  // 가운데 값 반환
    }
}



