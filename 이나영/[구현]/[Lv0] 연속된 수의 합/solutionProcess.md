# [Lv.0] 연속된 수의 합

### 🔗 문제 링크
- [문제 출처 링크](https://school.programmers.co.kr/learn/courses/30/lessons/120923)

### 💡 문제 접근 방식
- 중앙값을 찾아서 앞과 뒤에 숫자를 나열합니다. 

### 🛠 풀이 과정

### 📚 배운 점 & 회고
// << 정수 나눗셈

### 이렇게도 풀 수 있습니다. 
def solution(num, total):
    start = total // num - (num - 1) // 2
    return list(range(start, start + num))

이렇게도 풀 수 있다네요 .. 흑흑 벽느껴져.. 