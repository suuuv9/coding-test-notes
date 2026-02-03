// 프로그래머스 < 코딩테스트 입문 < 분수의 덧셈

class Solution {
    public int[] solution(int denum1, int num1, int denum2, int num2) {
        
        int mother = num1 * num2; // 분모 통일
        
        // 분자 변환
        int son1 = num1 * denum2; 
        int son2 = num2 * denum1;
        
        int totalSon = son1 + son2; // 분자 더하기
        
        // 분모와 분자를 공약수로 나누어 기약분수로 만들기
        for(int i = mother; i >= 1; i--){
            if(totalSon % i == 0 && mother % i == 0){
                totalSon /= i;
                mother /= i;
            }
        }
        
        int[] answer = {totalSon, mother};
        return answer;
    }
}
