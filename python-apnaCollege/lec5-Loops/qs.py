# i = 100

# while i > 0:
#     print(i)
#     i -= 1

# i = int(input("Enter a number: "))
# ct = 1
# while ct <= 10:
    # # print(i * ct)
    # ct += 1

# i = 1
# while i <= 10:
#     print(i * i)
#     i += 1

# lis = [1,4,9,16,25,36,49,64,81,100]

# i = 0
# while i < len(lis):
#     print(lis[i])
#     i += 1

tup = (1,4,9,16,25,36,49,64,81,100)

x = int(input("Enter a number: "))

i = 0
while i < len(tup):
    if(tup[i] == x):
        print("FOUND at index: ", i)
        break
    elif(i == len(tup) - 1):
        print("Not Found !")
    i += 1