//
a, b = 0, 1
//starting the sum at 0
sum_even = 0
//while loop
while b < 4000000:
    if b % 2 == 0:
        sum_even += b
    a, b = b, a+b

print(sum_even)
#predicted answer
# answer should be 4613732
