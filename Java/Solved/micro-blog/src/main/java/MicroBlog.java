// A unicode symbol may hava more than one unicode codepoint, in that case, a pair of unicode codepoints will be
// needed to represent the unicode symbol.
// Both the String 'charAt' method and the String 'length' method work with codepoints.
// They see the String as group of codepoints, both the highs and the lows are counted separately
// The String non-static method 'codePointAt' receives a codepoint index, and returns to us a int corresponding of a
// unicode symbol.
// If the codepoint on the index given to it is a simple one, it simple returns the corresponding integer.
// Else, if given the index of a high surrogate, it is smart enough to recognize the high surrogate and proceeds to read the 
// current codepoint,
// and the next one (the low surrogate of the pair), returning the corresponding integer.
// So if we are looping a string in Java, we are looping through all the unicode codepoints of the string.
// Normally, this would be equal to simple unicode characters.
// But if the string has surrogate pairs (complex unicode characters that need 2 codepoints to be represented),
// then we will loop through all the unicode codepoints, both high, and low.
// That's why, on the loop, we need to skip the low unicode surrogates, as it's pair was already added to StringBuilder
// on the previous iteration of the loop.

class MicroBlog {
    public String truncate(String input) {

        // create new StringBuilder obj
        StringBuilder stringBuilder = new StringBuilder();

        int unicodeCharactersAddedCounter = 0;
        int codePointsCounter = 0;

        // if we got 5 unicode symbols or if we reach the end of the string, stop 
        while (unicodeCharactersAddedCounter < 5 && codePointsCounter <= input.length() - 1) {
            // if the we are in a low surrogate, the pair was already added to the StringBuilder obj
            if (Character.isLowSurrogate(input.charAt(codePointsCounter))) {
                codePointsCounter++;
                continue;
            }
            // else we are in a simple unicode symbol (one that needs only a single codepoint, or in the high surrogate of a
            // surrogate pair)
            // so we append the pair to StringBuilder
            stringBuilder.appendCodePoint(input.codePointAt(codePointsCounter));
            // increase the total characters added
            unicodeCharactersAddedCounter++;
            // increase the index of the next codepoint that we will scan on the next iteration of the loop
            codePointsCounter++;
        }
        return stringBuilder.toString();
    }
}
