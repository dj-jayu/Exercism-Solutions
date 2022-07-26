public class Hamming {
    // declaring the private variables to save the arguments received on object construction
    private String leftStrand = null;
    private String rightStrand = null;

    // public constructor
    public Hamming(String leftStrand, String rightStrand) {
        
        // check if the strings lengths are equal, or if they are empty, and raise exceptions if not
         if (leftStrand.length() != rightStrand.length()) {
            if (rightStrand.equals("")) {
                throw new IllegalArgumentException("right strand must not be empty.");
            }
            if (leftStrand.equals("")) {
                throw new IllegalArgumentException("left strand must not be empty.");
            }
            throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
        }

        // passing the received values to the object private variables
        this.leftStrand = leftStrand;
        this.rightStrand = rightStrand;
    }

    // return the hamming distance between left and rightStrand
    public int getHammingDistance() {
 
        // create 2 arrays to hold the strings letters
        char[] leftStrandLetters = new char[leftStrand.length()];
        char[] rightStrandLetters = new char[rightStrand.length()];

        // put the strings letters in the arrays
        leftStrand.getChars(0, leftStrand.length(), leftStrandLetters, 0);
        rightStrand.getChars(0, rightStrand.length(), rightStrandLetters, 0);

        // a variable to save the Hamming distance value
        int hammingDistance = 0;
        
        // loop the arrays to find the Hamming distance
        for (int i = 0; i < leftStrand.length(); i++) {
            if (leftStrandLetters[i] != rightStrandLetters[i]) {
                hammingDistance++;
            }
        }
        
        // return the hamming distance
        return hammingDistance;
        
    }
}
