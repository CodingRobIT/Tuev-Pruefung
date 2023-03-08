public class Car {
    //__________________________________Felder__________________________________________
    private int numberOfTires;
    private int numberOfDoors;

    private boolean seatBelt;

    private boolean airbag;
    //____________________________________________________________________________
    //--------------------------constructor---------------------------------------
    public Car() {    //default Construktor

    }         //----XXX---- unten
    public Car(int numberOfTires,int numberOfDoors,boolean seatBelt,boolean airbag) { //Construktor mit allen werten
        this.numberOfTires = numberOfTires; //Car carWithThreeTires = new Car(3, 5, true, true);
        this.numberOfDoors = numberOfDoors; // erster wert ist Tires zweiter Doors dritter seatBelt und vierter airbag
        this.seatBelt = seatBelt;
        this.airbag = airbag;
    }


    // __________________________Getter und Setter__________________________________________
    public int getNumberOfTires() {
        return  this.numberOfTires;
    }

    public void setNumberOfTires(int numberOfTires) {
        this.numberOfTires = numberOfTires;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public boolean isSeatBelt() {
        return seatBelt;
    }

    public void setSeatBelt(boolean seatBelt) {
        this.seatBelt = seatBelt;
    }

    public boolean isAirbag() {
        return airbag;
    }

    public void setAirbag(boolean airbag) {
        this.airbag = airbag;
    }
    //____________________________________________________________________________
    //__________________________________equals und hashcode___________________________________
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car car)) return false;

        if (getNumberOfTires() != car.getNumberOfTires()) return false;
        if (getNumberOfDoors() != car.getNumberOfDoors()) return false;
        if (isSeatBelt() != car.isSeatBelt()) return false;
        return isAirbag() == car.isAirbag();
    }

    @Override
    public int hashCode() {
        int result = getNumberOfTires();
        result = 31 * result + getNumberOfDoors();
        result = 31 * result + (isSeatBelt() ? 1 : 0);
        result = 31 * result + (isAirbag() ? 1 : 0);
        return result;
    }
    //____________________________________________________________________________
    //_____________________________toString_______________________________________

    @Override
    public String toString() {
        return "Car{" +
                "numberOfTires=" + numberOfTires +
                ", numberOfDoors=" + numberOfDoors +
                ", seatBelt=" + seatBelt +
                ", airbag=" + airbag +
                '}';
    }
    //____________________________________________________________________________
}
