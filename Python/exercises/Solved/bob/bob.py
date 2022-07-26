import string

# check if the received phrase is a yell
def isYell(phrase):
    # any non uppercase letter means it's not a yell
    if any(map(lambda character: character in string.ascii_lowercase, phrase)):
        return False

    # no letters also means not a yell
    if all(map(lambda character: character not in string.ascii_letters, phrase)):
        return False

    # what remains is a yell
    return True

# check if a phrase is a question
def isQuestion(phrase):
    # if the string without spaces at the end is not empty
    # check if last character is "?"
    if phrase.strip() != "":
        return phrase.strip()[-1] == "?"

    # if the string without spaces is empty, return false
    return False

# check if a phrase is empty
def isEmpty(phrase):
    # check if all characters are whitespaces
    return all(map(lambda character: character in string.whitespace, phrase))


# return the answers according to what bob would say
def response(hey_bob):
    # Normal question
    if isQuestion(hey_bob) and not isYell(hey_bob):
        return "Sure."

    # YELL not a question
    elif not isQuestion(hey_bob) and isYell(hey_bob):
        return "Whoa, chill out!"

    # YELLS a question
    elif isYell(hey_bob) and isQuestion(hey_bob):
        return "Calm down, I know what I'm doing!"

    # Says nothing
    elif isEmpty(hey_bob) or hey_bob == "":
        return "Fine. Be that way!"

    # Everything else
    else:
        return "Whatever."
