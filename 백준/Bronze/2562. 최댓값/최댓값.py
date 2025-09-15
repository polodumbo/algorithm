nums = []

for i in range(9):
    nums.append(int(input()))

print(max(nums))  # 최댓값
print(nums.index(max(nums)) + 1)  # 최댓값의 인덱스 + 1