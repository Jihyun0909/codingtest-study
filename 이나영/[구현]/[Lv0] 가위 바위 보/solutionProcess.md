# [Lv.0] 가위 바위 보 

### 🔗 문제 링크
- [문제 출처 링크](https://school.programmers.co.kr/learn/courses/30/lessons/120839)

### 💡 문제 접근 방식
- 스위치 문을 사용해 풀었습니다. 

### 🛠 풀이 과정
1. for 반복문
2. 스위치문을 통해 answer에 값 추가

### 📚 배운 점 & 회고
예시)

status = 404
match status:
    case 200:
        print("성공")
    case 404:
        print("찾을 수 없음")
    case _:
        print("알 수 없는 상태")