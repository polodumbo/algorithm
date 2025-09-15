def solution(array):
    answer = 0
    num_array = [0] * 1001

    for num in array:
        num_array[num] += 1

    max_num = max(num_array)
    same_count = 0

    for num in num_array:
        if num == max_num:  # 같은 수가 있다면 증가
            same_count += 1

    if same_count > 1:  # 같은 수가 있다면 -1
        answer = -1
    else:  # 없다면 제일 큰 수
        answer = num_array.index(max_num)

    return answer