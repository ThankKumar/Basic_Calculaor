#this program is related to simple calculator
#create functions
#1 this functions add two numbers
def add(x,y):
    return x+y
#2this functions subtracts two numbers
def subtract(x,y):
    return x-y
#3this functions multiplies two number
def multiply(x,y):
    return x*y
#4 this functions devided two numbers
def devided(x,y):
    return x/y

#Selection of operator
print("Selects operator")
print("1.Add")
print("2.Subtract")
print("3.Multiply")
print("4.Devided")

while True:
    #take input from user
    choice = input("Enter Your Choice(1/2/3/4): \n")
    # check if choice is one of the four options
    if choice in('1','2','3','4'):
        num1 = float(input("Enter Your first Number: \n"))
        num2 = float(input("Enter Your Second Number: \n"))

        if choice =='1':
            print(num1, "+" , num2, "=", add(num1 , num2))

        elif choice == '2':
            print(num1, "-", num2, "=", subtract(num1 , num2))

        elif choice == '3':
            print(num1, "*", num2, "=", multiply(num1 , num2))

        elif choice == '4':
            print(num1, "/", num2, "=", devided(num1 , num2))
        #if user wants another operations
        #break while loop

        next_calculation = input("Let's do next calculation? (Yes/No): \n")
        if next_calculation == "No":
            break

    else:
        print("Invalid Input")


