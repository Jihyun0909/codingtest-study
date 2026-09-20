# [Lv.0] 치킨 쿠폰

### 🔗 문제 링크
- [문제 출처 링크](https://school.programmers.co.kr/learn/courses/30/lessons/120884)

### 💡 문제 접근 방식
- 그냥 나눳습니다..

### 🛠 풀이 과정

### 📚 배운 점 & 회고

### 이렇게도 풀 수 있습니다. 
def solution(chicken):
    total = 0
    coupon = chicken
    while coupon >= 10:
        bonus = coupon // 10
        total += bonus
        coupon = coupon % 10 + bonus
    return total

이게 가장 이상적인 풀이라네요.