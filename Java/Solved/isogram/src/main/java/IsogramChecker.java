import java.util.Set;
import java.util.HashSet;

class IsogramChecker {

    // checks if a received word is a isogram
    boolean isIsogram(String phrase) {
        // 1- get lowered case for phrase
        // 2- create new Set to store letters
        // 3- for each letter (except spaces and hyphens), check if it is in the Set
        // 4- if it is (meaning we already saw it), return false
        // 5- if it is not, add it to the Set
        // 6- if we reach the last letter and no letter has been seen before, return true
        
        String phraseLowerCase = phrase.toLowerCase();
        Set<Character> charSet = new HashSet<Character>();
        for (int i = 0; i < phrase.length(); i++) {
            Character c = phraseLowerCase.charAt(i);
            if (c.equals(' ') || c.equals('-')) {
                continue;
            }
            else if (charSet.contains(c)) {
                return false;
            }
            else {
                charSet.add(c);
            }
        }
        return true;
    }

}
