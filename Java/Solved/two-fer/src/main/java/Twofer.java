public class Twofer {
    public String twofer(String name) {
        // if name is null or empty, return a default text
        if (name == null || name.equals("")) {
            return "One for you, one for me.";
        }

        // else if name is not null, return the text with you replaced for name
        return String.format("One for %s, one for me.", name);
    }
}
