def solution(A, B):
    answer = 0
    for i in range(len(A)):
        a = A[-i:] + A[:-i]
        if a == B:
            return i
        else:
            answer = -1
    return answer