def solution(nums):
    nums.sort() #우선 모두 정렬
    cnt=1       #서로 다른 포켓몬이 몇 마리 있는지 카운트
    
    for i in range(len(nums)-1):
        if nums[i] != nums[i+1]:
            cnt=cnt+1               #정렬된 리스트에서 포켓몬이 앞과 뒤가 다른 포켓몬이 있으면 카운트+1
            
    if cnt <= len(nums)/2:          #주어진 포켓몬/2보다 포켓몬 종류가 적으면 포켓몬 종류를 리턴(중복된 포켓몬이 있다는 소리)
        return cnt
    else:
        return len(nums)/2          #출력해야할 포켓몬 갯수보다 포켓몬 종류가 충분히 많으면 출력해야할 포켓몬 길이 리턴