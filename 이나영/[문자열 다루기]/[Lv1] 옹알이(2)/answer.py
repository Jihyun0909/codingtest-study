import re
def solution(babbling):
    answer = 0
    canspeak = ["aya", "ye", "woo", "ma"]
    for bab in babbling:
        remain = bab
        last_word = None
        flag = True
        
        while remain:
            found = None
            for word in canspeak:
                if remain.startswith(word):
                    found = word
                    break
            if found is None or found ==last_word:
                flag = False
                break
            remain = remain[len(found):]
            last_word = found
            
        if flag:
            answer += 1
            
    return answer