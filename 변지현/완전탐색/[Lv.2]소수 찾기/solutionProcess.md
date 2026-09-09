# [Lv.2] 소수 찾기

### 🔗 문제 링크
- [문제 출처 링크](https://school.programmers.co.kr/learn/courses/30/lessons/42839)

### 💡 문제 접근 방식
- 문제 설명
한자리 숫자가 적힌 종이 조각이 흩어져있습니다. 흩어진 종이 조각을 붙여 소수를 몇 개 만들 수 있는지 알아내려 합니다.

각 종이 조각에 적힌 숫자가 적힌 문자열 numbers가 주어졌을 때, 종이 조각으로 만들 수 있는 소수가 몇 개인지 return 하도록 solution 함수를 완성해주세요.

- 입력값 numbers의 최대 길이가 7이므로 모든 숫자 조합을 다 만드는 완전탐색 가능
- 몇 자리가 될 지 몰라서 for문으로 만들기 어려움 -> DFS(재귀/백트래킹) 사용
- 중복 처리를 위해 Integer.parseInt()로 "011"과 "11"같은 중복 제거 및 HashSet을 사용한 중복 제거
- 소수 판별 알고리즘 사용
### 🛠 풀이 과정
1. 입력값 범위를 보고 완전탐색 선택
2. dfs 함수 구현
- 인자: 지금까지 만든 문자열(current), 전체 재료(numbers)
- 방문 체크 배열이 필요한가?(visited): 종이 조각은 한 번 쓰면 다시 못 쓰니까 boolean[] visited가 꼭 필요
- 저장/종료 조건: current가 빈 문자열만 아니면 매 단계 숫자로 바꿔 Set에 저장한다, numbers의 모든 카드를 다 쓰면 for문을 종료하고 리턴한다.
3. 소수 판별 함수 구현
N<=7 확인(완전탐색) -> 가변 길이 조합 필요(DFS 선택) -> 중복 제거(Set + ParseInt) -> 백트래킹 틀 작성(visited true/false) -> 소수 판별 

### 📚 배운 점 & 회고
- 소수 판별 코드
1. 단일 숫자의 소수 판별
public boolean isPrime(int n){
    // 0과 1은 소수가 아님
    if (n < 2) return false;
    //2부터 sqrt(n)까지만 확인
    for(int i = 2; i * i <= n; i++){
        if(n % i == 0) return false;// 나누어떨어지면 합성수
    }
    return true;// 끝까지 안 나누어떨어지면 소수
}

2. 범위 내의 모든 소수 찾기: 에라토스테네스의 체
public int countPrimes(int n){
    boolean[] isPrime = new boolean[n + 1];
    Arrays.fill(isPrime, true); // 일단 전부 소수(true)로 초기화

    isPrime[0] = isPrime[1] = false; // 0과 1은 제외

    for(int i = 2; i * i <= n; i++){
        if(isPrime[i]){
            // i의 배수들을 전부 false로 지움
            for (int j = i * i; j <= n; j += i){
                isPrime[j] = false;
            }
        }
    }

    //true로 남아있는 개수 세기
    int count = 0;
    for (int i = 2; i <= n; i++){
        if(isPrime[i]) count++;
    }
    return count;
}

- DFS 구현
void dfs(파라미터...){
    // 1. [탈출 조건] 언제 멈출 것인가?
    if(종료조건){
        // 정답을 저장하거나 처리
        return;
    }

    // 2. [가지치기 / 탐색] 다음 상태로 넘어가기
    for (int i = 0; i < N; i++){
        if (!visited[i]){ // 아직 안 쓴 재료라면
            visited[i] = true; // 사용 표시

            dfs(...); // 다음 단계로 깊게 들어가기 (재귀)

            visited[i] = false; // 되돌아왔으니 사용 표시 해제 (백트래킹)
        }
    }
}
