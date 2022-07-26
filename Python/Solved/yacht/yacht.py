# Score categories.
# Change the values as you see fit.
# make each category be a anonymous function that receive the dice list and returns the correct result
YACHT = lambda dice: 50 if dice.count(dice[0]) == len(dice) else 0
ONES = lambda dice: dice.count(1)
TWOS = lambda dice: dice.count(2) * 2
THREES = lambda dice: dice.count(3) * 3
FOURS = lambda dice: dice.count(4) * 4
FIVES = lambda dice: dice.count(5) * 5
SIXES = lambda dice: dice.count(6) * 6
LITTLE_STRAIGHT = lambda dice: 30 if sorted(dice) == [1,2,3,4,5] else 0
BIG_STRAIGHT = lambda dice: 30 if sorted(dice) == [2,3,4,5,6] else 0
CHOICE = lambda dice: sum(dice)

# this 2 are more complicated, so I created separated functions for them
def full_house(dice):
    has_three = False
    has_two = False

    # check if any number from 1..6 is repeated 3 times
    for number in range(1, 7):
        if dice.count(number) == 3:
            has_three = True
            break

    # check if any number from 1..6 is repeated 2 times
    for number in range(1, 7):
        if dice.count(number) == 2:
            has_two = True
            break

    # if both conditions above are true, return the sum of all elements in dice list, else return zero
    return sum(dice) if has_three and has_two else 0

def four_of_a_kind(dice):
    # check if any number appears 4 or more times, and return 4* this number if yes, and zero if not
    for number in range(1, 7):
        if dice.count(number) >= 4:
            return 4 * number
    return 0

FULL_HOUSE = full_house
FOUR_OF_A_KIND = four_of_a_kind

# evaluate the function according to the category, passing the dice list
def score(dice, category):
    return category(dice)

