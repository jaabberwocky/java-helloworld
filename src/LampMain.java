public class LampMain {

    public static void main(String[] args) {
        Lamp foo = new Lamp("myLamp", false, 5.0);

        foo.turnOn();
        foo.checkBattery();
    }
}
