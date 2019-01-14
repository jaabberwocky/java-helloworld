import java.awt.*;

public class Car {

    // Data Types:
    // int -> integers
    // double -> decimal values
    // Java has a Color class, but need to import first from java.awt library (abstract window toolkit)
    // boolean -> true or false

    double averageMilesPerGallon;
    String licensePlate;
    Color paintColor;
    boolean areTailightsWorking;

    // create the constructor class
    // this refers to the car we are creating
    public Car(double inputAverageMPG,
               String inputLicensePlate,
               Color inputPaintColor,
               boolean inputAreTailightsWorking) {
        this.averageMilesPerGallon = inputAverageMPG;
        this.licensePlate = inputLicensePlate;
        this.paintColor = inputPaintColor;
        this.areTailightsWorking = inputAreTailightsWorking;
    }

    // method: change paint color
    // void means never return any value
    public void changePaintColor(Color newPaintColor) {
        this.paintColor = newPaintColor;
    }
}
