class ResistorColorDuo {
    private static final String[] colorList = new String[]{"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};

    // returns a number with the code according to the colors received
    int value(String[] colors) {
        
        // 1- loop through the colorList array comparing the strings with the first and second received colors
        // 2- append the code of the first and second colors and return the value
        String firstColor = colors[0];
        String secondColor = colors[1];
        int colorCode = 0;
        
        for (int i = 0; i < colorList.length; i++) {
            // multiply the index by 10 so it goes as the first number of the code
            if (firstColor.equals(colorList[i])) colorCode += i * 10;
            
            if (secondColor.equals(colorList[i])) colorCode += i;
        }
        return colorCode;
    }
}
