print("Catch and eat any of fruits: ('apple', 'orange', 'mango', 'guava'")
num_fruits = int(input("How many fruits would you like to catch? "))
print("Choose a fruit to catch. Press A, O, M, or G. ")

#Stack
basket = []

for x in range(num_fruits):
  fruits = input("Fruit " + str(x + 1) + " of " + str(num_fruits) + ": ")

  if(fruits.upper() == "A"):
    basket.append("apple")
  elif(fruits.upper() == "O"):
    basket.append("orange")
  elif(fruits.upper() == "M"):
    basket.append("mango")
  elif(fruits.upper() == "G"):
    basket.append("guava")
  else:
    print("Error Input")


print("Your basket now has: " + str(basket))

while True:

  eat = input("Press E to eat a fruit: ") # Ask the user 

  if eat.upper() == "E": # if the user type the letter E
    basket.pop() # Remove the last element of basket

    if len(basket) !=0:
      print("Your basket now has: " + str(basket))

  if not basket:
    print("No more fruits")
    break
  
