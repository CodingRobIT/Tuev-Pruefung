import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarInspectionServiceTest {

    @Test
    void checkTiresWith4TiresShouldReturnTrue() { //genau erklährung ein Test weiter unten
        //GIVEN
        Car carWithFourTires = new Car(4, 5, true, true);
        //WHEN
        boolean actual = CarInspectionService.checkTires(carWithFourTires);

        //THEN
        assertTrue(actual);
    }

    @Test
    void checkTiresWith3TiresShouldReturnFalse() {
        //GIVEN
        // Car greift auf die Klasse Car zu
        // carWith... ist meine bezeichung für die Methode
        // daraus erstellen wir ein new Car mit den werten in der ()
        // die werte muss man aus der Klasse Car auslesen sie XXX im Construktor
        Car carWithThreeTires = new Car(3, 5, true, true);
        //WHEN   // erster wert ist Tires zweiter Doors dritter seatBelt und vierter airbag
        boolean actual = CarInspectionService.checkTires(carWithThreeTires);

        //THEN
        assertFalse(actual);
    }

    @Test
    void checkDoorsWith5DoorsShouldBeTrue() {
        //GIVEN
        Car carWith5Doors = new Car(4, 5, true, true);
        //WHEN
        boolean actual = CarInspectionService.checkDoors(carWith5Doors);
        //THEN
        assertTrue(actual);
    }

    @Test
    void checkDoorsWith3DoorsShouldBeTrue() {
        //GIVEN
        Car carWith3Doors = new Car(4, 3, true, true);
        //WHEN
        boolean actual = CarInspectionService.checkDoors(carWith3Doors);
        //THEN
        assertTrue(actual);
    }

    @Test
    void checkDoorsWith2DoorsShouldBeFalse() {
        //GIVEN
        Car carWith2Doors = new Car(4, 2, true, true);
        //WHEN
        boolean actual = CarInspectionService.checkDoors(carWith2Doors);
        //THEN
        assertFalse(actual);
    }

    @Test
    void checkDoorsWithSeatBeltBeTrue() {
        //GIVEN
        Car carWithSeatBelt = new Car(4, 5, true, true);
        //WHEN
        boolean actual = CarInspectionService.checkDoors(carWithSeatBelt);
        //THEN
        assertTrue(actual);
    }

    @Test
    void checkDoorsWithNoSeatBeltBeFalse() {
        //GIVEN
        Car carWithNoSeatBelt = new Car(4, 5, false, true);
        //WHEN
        boolean actual = CarInspectionService.checkSeatBelt(carWithNoSeatBelt);
        //THEN
        assertFalse(actual);
    }



}