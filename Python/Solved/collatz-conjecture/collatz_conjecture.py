def steps(number):
    # raise exception if the number is negative
    if number <= 0:
        raise ValueError("Only positive integers are allowed")

    # if number is one, return zero:
    if number == 1:
        return 0

    # start loop and save the number of iterations in count
    count = 0

    while (number != 1):

        # if number is multiple of 2, update it's value to it's half
        if number % 2 == 0:
            number /= 2
            count += 1
        # else, update it's value from x to 3x + 1
        else:
            number = number * 3 + 1
            count += 1

    return count
