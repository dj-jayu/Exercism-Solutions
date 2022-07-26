def square_of_sum(number):
    # create list of numbers from 1 to number
    numberList = list(range(1, number + 1))

    # sum all numbers in the list and return the result squared
    return sum(numberList) ** 2


def sum_of_squares(number):
    #  use a known formula to return the result
    return (number * (number + 1) * (2*number + 1)) / 6


def difference_of_squares(number):
    return square_of_sum(number) - sum_of_squares(number)
