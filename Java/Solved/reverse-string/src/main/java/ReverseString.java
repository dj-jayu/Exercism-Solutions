class ReverseString {

    String reverse(String inputString) {
        // create StringBuilder obj from given string
        StringBuilder stringBuilder = new StringBuilder(inputString);

        // reverse the string inside stringBuilder
        stringBuilder.reverse();

        // convert it back to a string and returns
        return stringBuilder.toString();
    }
  
}
