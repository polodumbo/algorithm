S = input()
alpha_array = [-1] * 26
for i in range(len(S)):
    idx = ord(S[i]) - ord('a')
    if alpha_array[idx] == -1:
        alpha_array[idx] = i

for i in alpha_array:
    print(i, end=' ')