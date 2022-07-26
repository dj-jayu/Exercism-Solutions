class Darts {
    private static final int OUTER_RADIUS = 10;
    private static final int MIDDLE_RADIUS = 5;
    private static final int INNER_RADIUS = 1;
    
    private double x;
    private double y;

    private double distanceOfImpact = 0;

    // we need to set the x and y coordinates of the impact and the distance from the center
    Darts(double x, double y) {
        this.x = x;
        this.y = y;
        calculateDistanceOfImpact();
    }

    // use the pythagorean theorem
    private void calculateDistanceOfImpact() {
        this.distanceOfImpact = Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2));
    }
    
    int score() {
        if (this.distanceOfImpact <= INNER_RADIUS) {
            return 10;
        } else if (this.distanceOfImpact <= MIDDLE_RADIUS) {
            return 5;
        } else if (this.distanceOfImpact <= OUTER_RADIUS) {
            return 1;
        } else {
            return 0;
        }
    }

}
