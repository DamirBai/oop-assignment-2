public class Train {

    private int speed;
    private int numOfCars;
    private String direction;

    Train(int speed, int numOfCars, String direction){
        this.speed = speed;
        this.numOfCars = numOfCars;
        this.direction = direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public void setNumOfCars(int numOfCars) {
        this.numOfCars = numOfCars;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getNumOfCars() {
        return numOfCars;
    }

    public int getSpeed() {
        return speed;
    }

    public String getDirection() {
        return direction;
    }

}
