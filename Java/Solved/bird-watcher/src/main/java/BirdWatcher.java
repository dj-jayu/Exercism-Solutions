
class BirdWatcher {
    // we need to keep track of all the birds seen last week
    private final int[] birdsPerDay;

    // Assigns the received array to the birdsPerDay array of our object 
    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    // returns the array we have received
    public int[] getLastWeek() {
        return this.birdsPerDay;
    }

    // returns the number of birds seen today
    public int getToday() {

        // a empty array means we haven't seen any birds
        if (this.birdsPerDay.length == 0) return 0;
        
        return this.birdsPerDay[this.birdsPerDay.length - 1];
    }

    // add 1 to the number of birds seen today
    public void incrementTodaysCount() {
        this.birdsPerDay[this.birdsPerDay.length - 1]++;
    }

    // returns true if we haven't seen any birds in one day of last week
    public boolean hasDayWithoutBirds() {
        // 1- loop through the array and return true if a value of zero is found
        for (int numberOfBirdsSeen: this.birdsPerDay) {
            if (numberOfBirdsSeen == 0) 
                return true;
        }
        return false;
    }

    // returns how many birds we have seen on the first given days of last week
    public int getCountForFirstDays(int numberOfDays) {
        // 1- loop through the first "numberOfDays" elements
        // of the birdsPerDay array summing all the birds seen and return the value
        // *** If the number of days provided is bigger than 7
        // *** returns all the days we have data for

        // the max possible number we can answer for is 7
        int numberOfDaysCorrected = numberOfDays > 7 ? 7 : numberOfDays;
        int countForFirstDays = 0;
        for (int i = 0; i < numberOfDaysCorrected; i++) {
            countForFirstDays += this.birdsPerDay[i];
        }
        return countForFirstDays;
    }

    // returns all the total number of days from last week that we have seen 5 or more birds
    public int getBusyDays() {
        // 1- loop through all elements in the birdsPerDay array
        // counting the number of elements with value 5 or more
        int busyDays = 0;
        for (int birdsSeen: this.birdsPerDay) {
            if (birdsSeen >= 5) {
                busyDays++;
            }
        }
        return busyDays;
    }
}
