import java.util.HashSet;

class Solution {
    public boolean solution(String[] phone_book){
        HashSet<String> set = new HashSet<>();

        // 1. 모든 번호를 해시에 저장
        for(String phone:phone_book){
            set.add(phone);
        }

        // 2. 각 번호의 부분 문자열이 해시에 있는지 확인
        for(String phone:phone_book){
            for(int i = 1; i < phone.length(); i++){
                if(set.contains(phone.substring(0, i))){
                    return false;
                }
            }
        }
        return true;
    }
}
