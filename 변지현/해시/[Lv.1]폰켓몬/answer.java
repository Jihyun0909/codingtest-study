import java.util.HashSet;

class Solution {
    public int solution(int[] nums) {
        // 1. 중복 제거를 위해 HashSet 사용
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }
        
        int maxPick = nums.length / 2; // 가져갈 수 있는 최대 마리 수 
        int totalTypes = set.size(); // 폰켓몬 총 종류 수
        
        return Math.min(totalTypes, maxPick);
    }
}