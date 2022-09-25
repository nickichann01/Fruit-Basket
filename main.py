def compareNum(n1, n2): #function

  if(n1 > n2): #prints if the n1 is greater than n2 
    print("The first input number is greater than the second input number")

  elif(n1 < n2): #prints if the n1 is less than n2
    print("The first input number is less than the second input number")

  else: #prints if n1 and n2 are equals
    print("The first input number is equals to second input number")


num1 = int(input("Enter a first number: ")) #ask the user to input first number
num2 = int(input("Enter a second number: ")) #ask the user to input second number 

print() #for spacing

compareNum(num1,num2) #calls the function and prints the output
