class RaindropConverter {

    String convert(int number) {
        // create StringBuilder obj to add the texts
        StringBuilder stringBuilder = new StringBuilder();

        // check Pling
        if (number % 3 == 0) {
            stringBuilder.append("Pling");
        }

        // check Plang
        if (number % 5 == 0) {
            stringBuilder.append("Plang");
        }

        // check Plong
        if (number % 7 == 0) {
            stringBuilder.append("Plong");
        }

        // check all 3
        if (number % 3 != 0 && number % 5 != 0 && number % 7 != 0) {
            stringBuilder.append(String.valueOf(number));
        }

        // return String obj
        return stringBuilder.toString();
    }

}
