import java.util.*;

class Solution {
    public int solution(int[] citations) {
        Arrays.sort(citations);
        int n = citations.length;
        
        for(int i = 0; i < n; i++){
            // h = n - i (현재 논문을 포함하여 그 이상 인용된 논문의 개수)
            int h = n - i;
            
            // 현재 논문의 인용 횟수가 h번 이상이면,
            // 그 뒤의 논문들도 전부 h번 이상 인용된 것이므로 h가 H-Index
            if(citations[i] >= h){
                return h;
            }
        }
        return 0;
    }
}