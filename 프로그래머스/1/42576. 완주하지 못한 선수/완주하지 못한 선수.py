def solution(participant, completion):
    participant.sort()  
    completion.sort()   #우선 모두 이름수능로 다 정렬시킨다
    for i in range(len(completion)):        
        if participant[i] != completion[i]:     #만약 참가자 리스트랑 완주자 리스트 하나씩 검사하면서
            return participant[i]               #일치하지 않는 거 있으면 리턴
    return participant[-1]  #다 일치하면 맨 뒤에거 리턴