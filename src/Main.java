import java.awt.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world from IntelliJ!");
        System.out.println("Tobias!!");

        // note you dont have to import as java imposes class = name of file
        // so it knows where to look
        Car myCar = new Car(25.5, "1BC32E", Color.BLUE, true);
        Car sallyCar = new Car(13.9, "3D20BN", Color.BLACK, false);

        System.out.println("My car's license plate: " + myCar.licensePlate);
        System.out.println("Sally's car's license plate: " + sallyCar.licensePlate);

        // change paint color
        System.out.println(myCar.paintColor);
        myCar.changePaintColor(Color.RED);
        System.out.println("My car's new paint color is now: " + myCar.paintColor);
    }
}