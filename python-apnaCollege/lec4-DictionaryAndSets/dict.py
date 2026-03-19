"""
Dictionary in Python:
- Dictionary are used to store data values in key:value pairs.
- They are unordered, mutable & don't allow duplicate keys
"""

dict = {
    'name' : 'Gobardhan',
    'age' : 26,
    'cgpa' : 7.8,
}

"""
dict["name"], dict["cgpa"], dict["marks"]
dict["key"] = "value" # to assign or add new
"""

"""
Nested Dictionaries:
Keys value will be dict.
Accessing: student["score"]["maths"]
"""

"""
Dictionary Methods:
- myDict.keys() #return all keys
- myDict.values() #return all values
- myDict.items() #return all (key, val) pairs as tuple
- myDict.get("key") #returns the key accoriding to value
- myDict.update(newDict) #inserts the specified items to the dictionary
"""