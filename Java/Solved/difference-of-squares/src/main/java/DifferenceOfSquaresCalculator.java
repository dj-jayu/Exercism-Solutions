class DifferenceOfSquaresCalculator {

    int computeSquareOfSumTo(int input) {
        // 1- use a known formula to calculate the sum of n numbers
        // 2- return the sum squared
        int sumOfFirstNNumbers = (input * (input + 1)) / 2;
        return (int) Math.pow(sumOfFirstNNumbers, 2);
        
    }

    int computeSumOfSquaresTo(int input) {
        // 1- use a known formula to calculate the sum of the first n numbers squared and returns it
        int sumOfFirstNNumbersSquared = (input * (input + 1) * (2*input + 1)) / 6;
        return sumOfFirstNNumbersSquared;
    }

    int computeDifferenceOfSquares(int input) {
        return computeSquareOfSumTo(input) - computeSumOfSquaresTo(input);
    }

}
