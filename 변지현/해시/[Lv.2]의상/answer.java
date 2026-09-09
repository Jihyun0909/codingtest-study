package 문제.해시.의상;
import java.util.HashMap;

public class answer {
    public int solution(String[][] clothes) {

        HashMap<String, Integer> map = new HashMap<>();

        //1. 의상 종류별 개수 세기
        for(String[] cloth:clothes){
            String type = cloth[1];
            map.put(type, map.getOrDefault(type, 0) + 1);
        }

        //2. 경우의 수 곱하기
        int answer = 1;
        for(int count : map.values()){
            answer *= (count + 1); // 안 입는 경우(+1) 포함해서 곱하기
        }

        //3. 아무것도 안 입은 상태 빼고 리턴

        return answer - 1;
    }
}
