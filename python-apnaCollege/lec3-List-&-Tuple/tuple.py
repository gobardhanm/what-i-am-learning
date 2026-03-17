"""
Tuple
A built-in data type that lets us create "immutable" sequence of values.

- Round bracket is used.
"""
tup = (1,3,5,7)
print(tup)
print(type(tup))

tupp = (1) # if we write a single el in a tuple then we should put a comma in the end
print(tupp)
print(type(tupp))

tuppp = (1,)
print(tuppp)
print(type(tuppp))

"""
Slicing works the same way as list or string
tuple__name[starting_idx : ending_idx ] # ending idx not included
"""

"""
Tuple Methods

- tup.index(el) # returns index of first occurrence
- tup.count(el) # count total occurrence
"""