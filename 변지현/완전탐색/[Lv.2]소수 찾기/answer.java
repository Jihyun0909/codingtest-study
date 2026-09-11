import java.util.*;

class Solution {
    // 중복 숫자 제거를 위해 해시셋 사용
    HashSet<Integer> numberSet = new HashSet<>();
    boolean[] visited; // 해당 인덱스 문자를 사용했는지 체크
    public int solution(String numbers) {
        visited = new boolean[numbers.length()];
        
        // 1. DFS로 모든 숫자 조합 생성
        dfs("", numbers);
        
        // 2. 만들어진 숫자들 중 소수 개수 세기
        int answer = 0;
        for(int num : numberSet){
            if(isPrime(num)){
                answer++;
            }
        }
        return answer;
    }
    // 완전탐색 (재귀/DFS)
    public void dfs(String current, String numbers){
        // 종료 조건, 현재 조합된 문자열이 비어있지 않으면 숫자로 변환해서 Set에 추가
        if(!current.equals("")){
            // Integer.parseInt로 "011"같은 수를 11로 변환
            numberSet.add(Integer.parseInt(current));
        }
        
        // 남은 숫자들을 하나씩 붙여보는 과정
        for(int i = 0; i < numbers.length(); i++){
            if(!visited[i]){
                visited[i] = true; // 방문 처리(사용함)
                // 문자열에 현재 문자를 붙여서 다음 단계로 재귀 호출
                dfs(current + numbers.charAt(i), numbers);
                visited[i] = false; // 백트래킹, 다른 조합을 위해 원상태로 돌려놓음
            }
        }
    }
    
    // 소수 판별 로직
    public boolean isPrime(int n){
        if(n < 2) return false;
        for(int i = 2; i * i <= n; i++){
            if (n % i == 0) return false;
        }
        return true;
    }
    
}