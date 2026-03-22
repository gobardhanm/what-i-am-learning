marks = {}

phyMarks = int(input("Enter the marks of Physics: "))
# marks["physics"] = phyMarks
marks.update({"physics": phyMarks})

chemMarks = int(input("Enter the marks of Chemistry: "))
marks["chemistry"] = chemMarks

mathsMarks = int(input("Enter the marks of Maths: "))
marks["maths"] = mathsMarks

print("Physics: ",marks["physics"])
print("Chemistry: ", marks["chemistry"])
print("Maths: ", marks["maths"])
