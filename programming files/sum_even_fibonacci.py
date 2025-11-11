a, b = 0,1
sum_even = 0
stop_value = 4000000
while b < stop_value:
    if b % 2 == 0:
        sum_even += b
        a, b = b, a+b

print(sum_even)
#predicted answer
# answer should be 4613732
