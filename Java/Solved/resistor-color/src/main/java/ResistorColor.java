class ResistorColor {
    private static final String[] colorArray = new String[]{"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};

    // user can get a number for the respective color
    int colorCode(String color) {
        for (int i = 0; i < ResistorColor.colorArray.length; i++) {
            if (ResistorColor.colorArray[i].equalsIgnoreCase(color)) {
                return i;
            }
        }
        return -1;
    }

    // user can get a list with all the colors available
    String[] colors() {
        return ResistorColor.colorArray;
    }
}
