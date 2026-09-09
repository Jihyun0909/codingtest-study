#1
key: 참가자 명단
value: T/F completion에 있으면 T 아니면 F
F인 참가자 return

#2
T/F 표시 시 동명이인 처리 문제 발생->인원수로 관리
participant돌면서 키 입력, value는 0으로 세팅
completion 돌면서 일치하는 키 value +1

#3
participant 돌면서 키에 이름, value에 인원수 카운팅
completion 돌면서 해당하는 키 value -1
(완주못한 사람 명단이니까 이게 맞음)