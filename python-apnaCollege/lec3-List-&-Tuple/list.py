marks = [32,34,53, 35,23]

student = ["Karan", 95.34, 21, "Mumbai"] # different data types can be stored

student[0] = "Varun" # list is mutable in python

print(len(marks))

print(student[0:3])

"""
List Methods:

- list.append(element)
- list.sort()
- list.sort(reverse = True) # Sort in descending order
- list.reverse()
- list.insert(idx, element)
"""

nums = [1,2,3]
nums.append(4)
nums.append(0)
nums.sort()
nums.sort(reverse=True)
nums.insert(5, 5) # It doesn't remove the el from that idx it just insert, shift
nums.sort()
nums.reverse()
nums.remove(5) # removes the first occurance of el
nums.pop(2)

print(nums)