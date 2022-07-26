class AnnalynsInfiltration {
    public static boolean canFastAttack(boolean knightIsAwake) {
        // returns the negation of the isAwake state
        return !knightIsAwake;
    }

    public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
        // returns true if one of the conditions passed is true using the 'or' operator
        return knightIsAwake || archerIsAwake || prisonerIsAwake;
    }

    public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
        // returns true if archer is sleeping and prisoner is awake
        return !archerIsAwake && prisonerIsAwake;
    }

    public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean petDogIsPresent) {
        return !archerIsAwake && petDogIsPresent || !petDogIsPresent && !knightIsAwake && !archerIsAwake && prisonerIsAwake;
    }
}
