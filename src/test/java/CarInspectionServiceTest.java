import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarInspectionServiceTest {

    @Test
    void checkTiresWith4TiresShouldReturnTrue() {
        //GIVEN
        int numberOfTires = 4;
        //WHEN
        int actual = CarInspectionService.checkTires(numberOfTires);

        //THEN
        assertEquals(actual);
    }




}