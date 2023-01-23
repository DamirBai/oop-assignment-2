public class Car extends Train{ //вроде, так пишется вагон по translate.google.com

    private String type; //Lux, Coupe, Restaurant, Disability
    private int numOfLower; //нижние вагоны
    private int numOfUpper; //верхние вагоны
    private int maxNumberOfPassengers;

    Car(String type, int numOfLower, int numOfUpper, int speed, int numOfCars, String direction){
        super(speed, numOfCars, direction);
        this.type = type;
        this.numOfUpper = numOfUpper;
        this.numOfLower = numOfLower;
    }

    public void setNumOfLower(int numOfLower) {
        this.numOfLower = numOfLower;
    }

    public void setNumOfUpper(int numOfUpper) {
        this.numOfUpper = numOfUpper;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getNumOfLower() {
        return numOfLower;
    }

    public int getNumOfUpper() {
        return numOfUpper;
    }

    public String getType() {
        return type;
    }

    public int getMaxNumberOfPassengers() {
        maxNumberOfPassengers = numOfLower + numOfUpper;
        return maxNumberOfPassengers;
    }

}
