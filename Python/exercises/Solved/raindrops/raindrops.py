def convert(number):
    pass
# returns a phrase according to the number received and rules stated in the problem
def convert(number):
    # factor the number and add strings to the final string to return
    final_string = ""

    if number % 3 == 0:
        final_string += "Pling"

    if number % 5 == 0:
        final_string += "Plang"

    if number % 7 == 0:
        final_string += "Plong"

    # empty string means no factor above is present
    if final_string == "":
        final_string = str(number)

    return final_string


