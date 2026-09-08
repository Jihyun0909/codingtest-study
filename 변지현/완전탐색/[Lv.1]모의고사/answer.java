import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] answer1 = {1,2,3,4,5};
        int[] answer2 = {2,1,2,3,2,4,2,5};
        int[] answer3 = {3,3,1,1,2,2,4,4,5,5};
        
        int right1 = 0;
        int right2 = 0;
        int right3 = 0;
        
        for(int i = 0; i < answers.length; i++){
            
            if(answer1[i%answer1.length] == answers[i])
                right1++;
            if(answer2[i%answer2.length] == answers[i])
                right2++;
            if(answer3[i%answer3.length] == answers[i])
                right3++;
        }
        
        int maxScore = Math.max(right1, Math.max(right2, right3));
        
        List<Integer> list = new ArrayList<>();
        
        if(maxScore == right1) list.add(1);
        if(maxScore == right2) list.add(2);
        if(maxScore == right3) list.add(3);
        
        int[] answer = new int[list.size()];
        
        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}