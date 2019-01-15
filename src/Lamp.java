public class Lamp {

    String lampName;
    boolean turnedOn;
    double batteryPercentage;

    // constructor class
    public Lamp(String lampName, boolean turnedOn, double batteryPercentage) {
        this.lampName = lampName;
        this.turnedOn = turnedOn;
        this.batteryPercentage = batteryPercentage;
    }

    public void turnOn() {
        if (this.turnedOn == false) {
            this.turnedOn = true;
            System.out.println(this.lampName + " named lamp turned on!");
        }
    }

    public void checkBattery() {
        if (this.batteryPercentage <= 10.0) {
            beep();
        }
    }

    private void beep() {
        // only beep when lamp is low battery
        // note that it is private!
        System.out.println("Beep!");
    }
}
