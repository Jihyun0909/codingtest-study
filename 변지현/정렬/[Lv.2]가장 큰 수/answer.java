import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        // 1. int 배열을 String 배열로 변환
        String[] strNumbers = new String[numbers.length];
        for(int i = 0; i < numbers.length; i++){
            strNumbers[i] = String.valueOf(numbers[i]);
        }
        
        // 2. 두 문자열을 이어 붙였을 때 더 큰 조합이 오도록 정렬
        Arrays.sort(strNumbers, (o1, o2) -> (o2+o1).compareTo(o1+o2));
        
        // 3. 가장 큰 수가 0인 경우 0 반환
        if(strNumbers[0].equals("0")){
            return "0";
        }
        
        // 4. 정렬된 문자열 이어 붙이기
        StringBuilder answer = new StringBuilder();
        for (String str : strNumbers){
            answer.append(str);
        }
        return answer.toString();
    }
}