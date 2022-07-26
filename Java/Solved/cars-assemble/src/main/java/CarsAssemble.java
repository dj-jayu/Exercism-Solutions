public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        int producedCars = 221 * speed;
        double successRate = 0;
        if (speed >= 1 && speed <= 4) {
            successRate = 1;
        } else if (speed >= 5 && speed <= 8) {
            successRate = 0.9;
        } else if (speed == 9) {
            successRate = 0.8;
        } else {
            successRate = 0.77;
        }
        return producedCars * successRate;
    }

    public int workingItemsPerMinute(int speed) {
        return (int)(productionRatePerHour(speed) / 60);
    }
}
