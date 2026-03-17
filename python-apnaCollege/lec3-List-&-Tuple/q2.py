# # lis = [1,2,3,2,1]
# lis = [1, "abc", "abc",1]
# revLis = lis[::-1]
# if(lis == revLis):
#     print("True")
# else:
#     print("False")

lis = [1,2,3,2,1]
revLis = lis.copy()
revLis.reverse()

if(lis == revLis):
    print("True")
else:
    print("False")