# [Lv.2] 가장 큰 수 

### 🔗 문제 링크
- [문제 출처 링크](https://school.programmers.co.kr/learn/courses/30/lessons/42746)

### 💡 문제 접근 방식
- 문제 설명
0 또는 양의 정수가 주어졌을 때, 정수를 이어 붙여 만들 수 있는 가장 큰 수를 알아내 주세요.

예를 들어, 주어진 정수가 [6, 10, 2]라면 [6102, 6210, 1062, 1026, 2610, 2106]를 만들 수 있고, 이중 가장 큰 수는 6210입니다.

0 또는 양의 정수가 담긴 배열 numbers가 매개변수로 주어질 때, 순서를 재배치하여 만들 수 있는 가장 큰 수를 문자열로 바꾸어 return 하도록 solution 함수를 작성해주세요.

- 정수를 '이어 붙이는' 문제니까 정수에서 문자열로 변환 필요
- 가장 큰 수를 만들어야 하니까 정렬하고 큰 수 순서로 이어 붙이기

### 🛠 풀이 과정
1. 정수를 문자열로 변환한다.
2. 두 문자열을 이어 붙였을 때 더 큰 조합이 오도록 정렬한다.
 - Arrays.sort(arr, (o1, o2) -> (o2+o1).compareTo(o1+o2)); // 내림차순
3. 정렬된 문자열을 이어 붙인다.

### 📚 배운 점 & 회고
1. Arrays.sort()
 - 배열을 넣으면 기본 오름차순 정렬: Arrays.sort(numbers); 
 - 사용자 정의 정렬(내림차순, 조건 정렬), Comparator를 두 번째 인자로 전달
   *Comparator 사용 시 객체(Wrapper Class) 배열이어야 함
   : Arrays.sort(numbers, Collections.reverseOrder()); // Collections 함수로 내림차순 정렬
     Arrays.sort(numbers, (o1, o2) -> o2.compareTo(o1)); // 람다식 활용
 - 특정 조건 정렬 (예: 문자열 길이가 짧은 순)
   : Arrays.sort(words, (s1, s2) -> s1.length() - s2.length());
 - 배열 일부만 정렬하기:
   Arrays.sort(numbers, 1, 4); // 인덱스 1부터 4 전까지 정렬 (1,2,3번 인덱스만)

2. compareTo() 메서드: 두 객체의 순서(크기)를 비교하여 정렬할 때 기준을 세워주는 메서드
 - 리턴값의 의미:
   a.compareTo(b) 실행 시 정수가 반환됨.
   1. 반환값이 음수: a<b
   2. 반환값이 0: a==b
   3. 반환값이 양수: a>b
 - Arrays.sort()나 Collections.sort()에서 오름차순/내림차순 정렬 원리
   // 기본 오름차순 정렬, o1이 o2보다 작으면 음수가 나와서 순서를 유지함 -> [작은 수, 큰 수]
   Arrays.sort(arr, (o1, o2) -> o1, compareTo(o2));
  // 내림차순 정렬, 순서를 뒤집어 비교하면 큰 수가 앞으로 오게 됨 -> [큰 수, 작은 수]
  Arrays.sort(arr, (o1, o2) -> o2.compareTo(o1));