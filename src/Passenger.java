public class Passenger extends Car{

    private int ID;
    private int age;
    private String name;
    private String surname;
    private boolean disability;

    public Passenger(int ID, int age, String name, String surname, boolean disability, String type, int numOfLower,
                     int numOfUpper, int speed, int numOfCars, String direction){
        super(type, numOfLower, numOfUpper, speed, numOfCars, direction);
        this.age = age;
        this.ID = ID;
        this.name = name;
        this.surname = surname;
        this.disability = disability;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setDisability(boolean disability) {
        this.disability = disability;
    }

    public int getID() {
        return ID;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
    public boolean getDisability() {
        return disability;
    }

}
