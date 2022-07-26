
class SqueakyClean {
    static String clean(String identifier) {
        // save the string to a local variable
        String s = identifier;

        // copy string letters to array of chars
        char[] c = new char[s.length()];
        s.getChars(0, s.length(), c, 0);
        
        // create StringBuilder obj to put the chars if conditions are true
        StringBuilder sb = new StringBuilder();

        // loop the array of characters and make the substitutions for space and control characters
        for (char character: c) {
            if (!Character.isISOControl(character) && !Character.isWhitespace(character)) {
                sb.append(character);
            } else if (Character.isISOControl(character)) {
                sb.append("CTRL");
            } else if (Character.isWhitespace(character)) {
                sb.append("_");
            }
        }

        // convert the array of characters to a new string
        s = sb.toString();

        // make the string s camelCase
        if (s.contains("-")) {
            s = s.substring(0, s.indexOf('-')) + s.substring(s.indexOf('-') + 1, s.indexOf('-') + 2).toUpperCase() + s.substring(s.indexOf('-') + 2);
        }

        // remove non alphabetic characters and greek lowercase letters using regex
        s = s.replaceAll("[^\\p{IsAlphabetic}_]", "");
        s = s.replaceAll("[\u03b1-\u03c9]", "");

        // return the clean string
        return s;
    }
}
	
