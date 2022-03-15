B = 500000009

N = int(input())
F, S =1, 0
for i in range(N):
	S = S + F
	S = S % B
	F = (F *4) % B
print(S)
