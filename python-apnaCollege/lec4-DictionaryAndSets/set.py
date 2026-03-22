"""
Set in Python:
- Set is the collection of the "unordered" items.
- Each element in the set must be unique & immutable.
"""

nums = {1,2,3,4}
print(nums)
print(type(nums))

numSet2 = {1,2,2,2} # repeated el stored only once, so it resolved to {1,2}
print(numSet2)
print(type(numSet2))

null_set = set() #empty set syntax

"""
we can store :
boolean, int, float, string, tuple etc in a set.

BUT

we can't store:
list & dict in a set. Reason is that "They are mutable".
"""

"""
- set.add(el) # adds the element.
* We can add or delete from set, set is mutable BUT the "elements" in sets are immutable.

- set.remove(el) # removes the element

- set.clear() # empties the set

- set.pop() # removes a random value

- set.union(set2)

- set.intersection(set2)
"""