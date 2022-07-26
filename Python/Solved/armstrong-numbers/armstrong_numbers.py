def is_armstrong_number(number):
    # save number as string to be able to access it's numbers by index
    numberString = str(number)

    # put the string digits in a list, converted to integers
    numberDigits = [int(digitString) for digitString in numberString]

    # variable to hold the armstrongSum
    armstrongSum = 0

    # loop through the list making the summation
    for digit in numberDigits:
        armstrongSum += digit ** len(numberDigits)

    # check if the number is equal to it's armstrong sum
    return number == armstrongSum

