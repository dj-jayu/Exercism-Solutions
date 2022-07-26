def equilateral(sides):
    a, b, c = sides
    # check if is a valid triangle
    if (a + b < c or b + c < a or a + c < b or (a == 0 and b == 0 and c == 0)):
        return False

    # check if it's equilateral
    return a == b == c



def isosceles(sides):
    a, b, c = sides
    # check if is a valid triangle
    if not (a + b >= c and b + c >= a and a + c >= b):
        return False
    # check if it's isosceles
    return (a == b) or (a == c ) or (b == c)


def scalene(sides):
    a, b, c = sides
    # check if is a valid triangle
    if not (a + b >= c and b + c >= a and a + c >= b):
        return False

    # check if it's a scalene
    return not equilateral(sides) and not isosceles(sides)
