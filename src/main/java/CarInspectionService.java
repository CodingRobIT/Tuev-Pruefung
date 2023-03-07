public class CarInspectionService {

    public boolean numberOfTiresShouldBe4(Car car) {
        return car.getNumberOfTires() == 4;
    }

    public boolean seatBeltYesNo(Car car) {
        return car.isSeatBelt();
    }

    public boolean airBagYesNo(Car car) {
        return car.isAirbag();
    }

    public boolean doors3Or5(Car car) {
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
        boolean Tires = numberOfTiresShouldBe4(car);
        boolean seatBelt = seatBeltYesNo(car);
        boolean airBag = airBagYesNo(car);
        boolean doors = doors3Or5(car);
        if (Tires && seatBelt && airBag && doors == true) {
            return true;
        } else {
            return false;
        }
    }
}
