package relearn1;

public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        //throw new UnsupportedOperationException("Please implement the CarsAssemble.productionRateperHour() method");
        double speed8 = 0.9;
        double speed9 = 0.8;
        double speed10 = 0.77;
        
        if (speed > 0 && speed < 5) {
            return (speed*221);
        } else if (speed > 4  && speed < 9) {
            return (speed*221*speed8);
        } else if (speed == 9) {
            return (9*221*speed9);
        } else if (speed == 0) {
            return 0;
        } else {
            return (2210*speed10);
        }
    }

    public int workingItemsPerMinute(int speed) {
        //throw new UnsupportedOperationException("Please implement the CarsAssemble.workingItemsPerMinute() method");
        double temp = productionRatePerHour(speed)/60;
        int temp1 = (int) temp;
        return temp1;
    }
}