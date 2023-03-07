import java.util.ArrayList;
import java.util.List;

public class CarInspectionService {

    public boolean checkTires(Car car) {
        return car.getNumberOfTires() == 4;
    }

    public boolean checkSeatBelt(Car car) {
        return car.isSeatBelt();
    }

    public boolean checkAirBag(Car car) {
        return car.isAirbag();
    }

    public boolean checkDoors(Car car) {
        if (car.getNumberOfDoors() == 3) {
            return true;
        }
        if (car.getNumberOfDoors() == 5) {
            return true;
        } else {
            return false;
        }
    }

    public boolean checkCar(Car car) {
        return checkTires(car) &&
                checkAirBag(car) &&
                checkDoors(car) &&
                checkSeatBelt(car);
    }

    // FUNKTIONIERT DAS AUCH SO ?
//    public boolean checkCar(Car car) {
//        boolean Tires = numberOfTiresShouldBe4(car);
//        boolean seatBelt = seatBeltYesNo(car);
//        boolean airBag = airBagYesNo(car);
//        boolean doors = doors3Or5(car);
//        if (Tires && seatBelt && airBag && doors == true) {
//            return true;
//        } else {
//            return false;
//        }
//    }


}
