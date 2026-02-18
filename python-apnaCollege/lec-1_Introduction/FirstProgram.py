print('Hello World!')

# Type conversion
a = 2
b = 4.25

sum = a + b # 2.0 + 4.25 = 6.25
print(sum)

c = 3
d = "5"
# sum = c + d
# print(sum) # TypeError: unsupported operand type(s) for +: 'int' and 'str' | We can do this only by "Type Casting"

# Type casting : That data must be convertable.
sum = c + int(d)