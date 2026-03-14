# Strings and Conditional Statements

## Strings: 'Sequence of Characters'

- Strings variables can be enclosed in various different ways:

```
str1 = 'jdlfjsldjfs'
str2 = "lsjfljs"
str3 = """sljdfljsljfls"""
```

## Escape Seq Char:

- \n : for next line
- \t : for tab space

## Operations in Strings:

- Concatenation:(`str1 + str2`)
- Length of str (`len(str)`)

## Indexing:

- Index in string.

## Slicing:

- Accessing parts of a sting.
- Ex:
  str[start_idx : end_idx] # end_idx is not included.

### Negative Index:

- Last idx is -1 and decreases as we move backwards Ex: [-3,-2,-1]

## String Functions:

- str.endswith("value") # returns true if ends with value
- str.capitalize() # Make the first char capital
- str.replace(old,new)
- str.find(word) # return the first index of the word, -1 otherwise
- str.count("sub-string") # count the occurence

## Conditional Statements:

- if-elif-else (Syntax)
- Ex:

```
if(condition):
  Statement1
elif(condition):
  Statement2
else:
  StatementN
```

-
