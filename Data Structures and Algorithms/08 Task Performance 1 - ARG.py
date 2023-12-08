import sys

stuMap = {}

for i in range(1, 4):
   stuNum = input("Enter student number " + str(i) + ": ")
   stuName = input("Enter first name " + str(i) + ": ")
   stuMap[stuNum] = stuName

for key, value in stuMap.items():
   print(key, value)

thirdKey = list(stuMap.keys())[2]
del stuMap[thirdKey]

stuNum2 = input("Enter your student number: ")
stuName2 = input("Enter your first name: ")
stuMap[stuNum2] = stuName2

for key, value in stuMap.items():
   print(key, value)