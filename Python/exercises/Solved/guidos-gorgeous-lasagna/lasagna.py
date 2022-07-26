"""Functions used in preparing Guido's gorgeous lasagna.

Learn about Guido, the creator of the Python language: https://en.wikipedia.org/wiki/Guido_van_Rossum
"""

# TODO: define the 'EXPECTED_BAKE_TIME' constant
# TODO: consider defining the 'PREPARATION_TIME' constant
#       equal to the time it takes to prepare a single layer

EXPECTED_BAKE_TIME = 40

PREPARATION_TIME = 2

# TODO: define the 'bake_time_remaining()' function

def bake_time_remaining(time_passed):
    """Calculate the bake time remaining.

    :param elapsed_bake_time: int - baking time already elapsed.
    :return: int - remaining bake time (in minutes) derived from 'EXPECTED_BAKE_TIME'.

    Function that takes the actual minutes the lasagna has been in the oven as
    an argument and returns how many minutes the lasagna still needs to bake
    based on the `EXPECTED_BAKE_TIME`.
        """
    return EXPECTED_BAKE_TIME - time_passed



# TODO: define the 'preparation_time_in_minutes()' function
#       and consider using 'PREPARATION_TIME' here
def preparation_time_in_minutes(number_of_layers):
    """return the time needed according to the number of layers"""
    return PREPARATION_TIME * number_of_layers

# TODO: define the 'elapsed_time_in_minutes()' function

def elapsed_time_in_minutes(number_of_layers, time_passed):
    """Returns the time already spent cooking"""
    return time_passed + preparation_time_in_minutes(number_of_layers)
