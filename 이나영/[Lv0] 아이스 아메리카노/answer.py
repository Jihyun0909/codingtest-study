def solution(money):
    coffee = int(money / 5500)
    change = money % 5500
    
    answer = [coffee, change]
    return answer