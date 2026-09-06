# [Lv.0] 아이스 아메리카노

### 🔗 문제 링크
- [문제 출처 링크](https://school.programmers.co.kr/learn/courses/30/lessons/120864)

### 💡 문제 접근 방식
- 아스키코드로 숫자인지 아닌지 판별 후, 숫자면 -> 변수에 값 추가 , 문자면 -> 변수 값 숫자로 변환해 answer에 넣고 변수 값 초기화하기

### 📚 배운 점 & 회고
- 문제 풀고 내가 모르는 개념이 더 없나 확인해 봤는데, 
- c.isdigit() << 이렇게 손쉽게 숫자인지, 아닌지 확인할 수 있는 함수가 있다는 걸 깨달았다.
- 또한, 정규표현식 re 를 사용하면 

import re

def solution(my_string):
    return sum(int(n) for n in re.findall(r'\d+', my_string))

이렇게 쉽게 작성할 수 있다는 것도 알게 되었다. 