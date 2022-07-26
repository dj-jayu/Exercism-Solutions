def square(number):
    # if square is outside of permited range, raise a error
    if number < 1 or number > 64:
        raise ValueError("square must be between 1 and 64")

    # else, return the number of grains on the given square
    return 2**(number - 1)


def total():
    # loop through all squares, summing the number of grains of each square to total
    total = 0
    for i in range(1, 65):
        total += square(i)

    return total
