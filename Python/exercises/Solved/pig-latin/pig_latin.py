from string import ascii_lowercase

VOWELS: list[str] = ["a", "e", "i", "o", "u"]

# filter a list of all the letters of the alphabet only for consonants
CONSONANTS: list[str] = list(filter(lambda letter: letter not in VOWELS,ascii_lowercase))

# functions that apply the rules for the pig latin language
def do_rule_one(text, consonant=""):
    return text + "ay"

def do_rule_two(text, consonants):
    return text[len(consonants):] + consonants + "ay"

def do_rule_three(text, consonant_and_qu):
    return text[len(consonant_and_qu):] + consonant_and_qu + "ay"

def do_rule_four(text, consonants):
    return text[len(consonants):] + consonants + "ay"

# detect which rules to apply, returns the rule number and a string with the consonants detected
def rule(text):
    # Rule 1
    if text[0] in VOWELS or text.startswith("xr") or text.startswith("yt"):
        return 1, ""

    # Rule 2
    # 1- scan letters saving consonants if present
    # 2- if a vowel is found, break
    # 3- if a "y" is found after a consonant sound, break

    consonants = ""
    last_letter = ""
    for letter in text:
        last_letter = letter
        if letter in CONSONANTS  and not (len(consonants) > 0 and letter == "y"):
            consonants += letter
        else:
            break

    # Rule 3
    if consonants and consonants[-1] == "q" and letter == "u":
        return 3, consonants + "u"

    # Rule 4
    elif consonants and letter == "y":
        return 4, consonants

    else:
        return 2, consonants



# translate to pig language
def translate(text: str) -> str:
    # 1- break the words into a list
    # 2- translate each one
    # 3- merge them together with spaces between
    # 4- return

    final_text_list = []
    # for each word, translate
    for word in text.split(" "):

        # detect rule and apply corresponding action
        action_to_apply, consonants = rule(word)

        possible_actions = {1: do_rule_one, 2: do_rule_two, 3: do_rule_three, 4: do_rule_four}

        final_text_list.append(possible_actions[action_to_apply](word, consonants))

    return " ".join(final_text_list)
    
