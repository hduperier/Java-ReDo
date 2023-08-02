package relearn1;

public class ElonsToyCar {

    private int distanceDriven;
    private int batteryPercentage = 100;
    
    public static ElonsToyCar buy() {
        //throw new UnsupportedOperationException("Please implement the (static) RemoteControlCar.buy()  method");
        return new ElonsToyCar();
    }

    public String distanceDisplay() {
        //throw new UnsupportedOperationException("Please implement the (static) RemoteControlCar.distanceDisplay()  method");
        return String.format("Driven %d meters", distanceDriven);
    }

    public String batteryDisplay() {
        //throw new UnsupportedOperationException("Please implement the (static) RemoteControlCar.batteryDisplay()  method");
        if (batteryPercentage == 0) {
            return "Battery empty";
        }
        return String.format("Battery at %d%%", batteryPercentage);
    }

    public void drive() {
        //throw new UnsupportedOperationException("Please implement the (static) RemoteControlCar.drive()  method");
        if (batteryPercentage > 0) {
            distanceDriven = distanceDriven + 20;
            batteryPercentage = batteryPercentage - 1;
        } else {
            distanceDriven = distanceDriven;
            batteryPercentage = batteryPercentage;
        }
    }
}
