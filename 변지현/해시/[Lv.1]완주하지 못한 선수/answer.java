import java.util.HashMap;

class Solution {
    public String solution(String[] participant, String[] completion) {
        HashMap<String, Integer> map = new HashMap<>();

        // 1. 참가자 이름별 인원수 카운트 (+1)
        for (String p: participant){
            //map.getOrDefault(key, defaultValue): Map에 해당 key가 존재하면
            //그 Value를 가져오고, 없으면 설정한 defaultValue를 반환함
            map.put(p, map.getOrDefault(p, 0)+1);
        }

        // 2. 완주자 이름별 인원수 차감 (-1)
        for (String c: completion){
            map.put(c, map.get(c) -1);
        }

        // 3. 최종 인원수가 0이 아닌 선수 찾기
        // map.keySet(): Map에 존재하는 모든 Key를 Set으로 반환
        for(String key: map.keySet()){
            if(map.get(key)!= 0){
                return key;
            }
        }

        return "";
    }
}