#1
다 비교해보기?
N번째 요소의 길이만큼 잘라내서 비교하기
N번째 요소의 길이보다 같거나 작으면 비교 ㄴㄴ
=> 문제점: 시간 복잡도가 O(N^2), N번째 요소가 접두어일 수도 있고 다른 요소가 N번째 요소의 접두어일 수도 있음

##해결방법
###1. 해시 사용
해시는 조회 속도가 O(1)이므로 조회가 필요할 때 HashSet을 사용하면 효율적이다.
일반 배열이나 리스트에서 특정 번호가 있는지 찾으려면 O(N)의 시간이 걸림.
HashSet: 중복을 허용하지 않는 집합(Set) 형태 - 리스트처럼 단일 값들의 모임이지만, 순서가 없고 중복을 알아서 제거해 줌
HashMap: Key-Value쌍 형태 - 키는 중복이 안 되고, 키를 통해 밸류를 찾아냄


1. 모든 전화번호를 해시(HashSet)에 저장해 둔다. set.add()로 키 하나만 넣으면 됨
2. 번호를 앞에서 부터 잘라서 해시에 있는 지 확인한다. - contains() 사용

###2. 정렬 사용(O(NlogN))
문자열 배열을 정렬하면 비슷한 문자열끼리 바로 옆에 붙게 된다.
예시: ["119", "97674223", "1195524421"]
정렬 후: ["119", "1195524421", "97674223"]
정렬 후에는 바로 인접한 뒷 요소만 확인하면 된다.

import java.util.Arrays;

class Solution {
    public boolean solution(String[] phone_book) {
        // 1. 전화번호부 정렬 (사전순)
        Arrays.sort(phone_book);

        // 2. 바로 다음 번호와 접두어 관계인지 확인
        for (int i = 0; i < phone_book.length - 1; i++) {
            if (phone_book[i + 1].startsWith(phone_book[i])) {
                return false;
            }
        }

        return true;
    }
}