import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Passenger passenger1 = new Passenger(6664, 17, "Damir", "Baigenzhin", false,
                "Lux", 12, 12, 70, 30, "Astana-Almaty");

        boolean menu = true;

        while(menu) {

            System.out.println("Select option(Type from 1 to 4. For exit type 0)");
            System.out.println("Main Menu:");
            System.out.println("1. Add passenger"); //1
            System.out.println("2. Delete passenger"); //2
            System.out.println("3. Change information"); //object
            System.out.println("4. Get information"); //object
            System.out.println("0. Exit");

            int num = sc.nextInt();

            if (num == 0) {

                menu = false;

            } else if (num == 1) {

                System.out.println("Type ID:");

            } else if (num == 2) {


            } else if (num == 3) {

                boolean changeGeneral = true;

                while (changeGeneral) {

                    System.out.println("Select option(From 1 to 3. If you want get back to the main menu type 0)");
                    System.out.println("Which information needs to be changed?");
                    System.out.println("1. Train");
                    System.out.println("2. Car");
                    System.out.println("3. Passenger");
                    System.out.println("0. Exit");

                    int num1 = sc.nextInt();

                    if (num1 == 1) {

                        boolean changeTrain = true;
                        while (changeTrain) {

                            System.out.println("Select option(From 1 to 3. If you want get back to the Change Information type 0)");
                            System.out.println("Which information needs to be changed?");
                            System.out.println("1. Speed");
                            System.out.println("2. Number of Cars");
                            System.out.println("3. Direction");
                            System.out.println("0. Exit");

                            int num2 = sc.nextInt();

                            if (num2 == 0) {
                                changeTrain = false;
                            }
                            else if(num2 == 1) {
                                System.out.println("Old value is " + passenger1.getSpeed() + "km/h");
                                System.out.println("Type value(km/h): ");
                                int num3 = sc.nextInt();
                                passenger1.setSpeed(num3);
                                System.out.println("You've changed value on " + passenger1.getSpeed() + "km/h");
                            }
                            else if(num2 == 2) {
                                System.out.println("Old value is " + passenger1.getNumOfCars());
                                System.out.println("Type value: ");
                                int num3 = sc.nextInt();
                                passenger1.setNumOfCars(num3);
                                System.out.println("You've changed value on " + passenger1.getNumOfCars());
                            }
                            else if(num2 == 3) {
                                System.out.println("Old direction is " + passenger1.getDirection());
                                System.out.println("Type direction: ");
                                String direct = sc.next();
                                passenger1.setDirection(direct);
                                System.out.println("You've changed direction on " + passenger1.getDirection());
                            }
                            else {
                                System.out.println("Choose correct number!");
                            }

                        }
                    } else if (num1 == 0) {
                        changeGeneral = false;
                    }
                    else if (num1 == 2) {

                        boolean changeCar = true;
                        while (changeCar) {

                            System.out.println("Select option(From 1 to 3. If you want get back to the Change Information type 0)");
                            System.out.println("Which information needs to be changed?");
                            System.out.println("1. Type");
                            System.out.println("2. Number of Lower places");
                            System.out.println("3. Number of Upper places");
                            System.out.println("0. Exit");

                            int num2 = sc.nextInt();

                            if (num2 == 0) {
                                changeCar = false;
                            }
                            else if (num2 == 1) {
                                System.out.println("Old type is " + passenger1.getType());
                                System.out.println("Choose new type: ");
                                System.out.println("1. Lux");
                                System.out.println("2. Coupe");
                                System.out.println("3. Restaurant");
                                System.out.println("4. Disability");
                                int num3 = sc.nextInt();
                                if (num3 == 1) {
                                    passenger1.setType("Lux");
                                }
                                else if (num3 == 2) {
                                    passenger1.setType("Coupe");
                                }
                                else if (num3 == 3) {
                                    passenger1.setType("Restaurant");
                                }
                                else if (num3 == 4) {
                                    passenger1.setType("Disability");
                                }
                                System.out.println("You've changed value on " + passenger1.getType());
                            }
                            else {
                                System.out.println("Choose correct number!");
                            }

                        }
                    } else if (num1 == 3) {

                        boolean changePassenger = true;
                        while (changePassenger) {

                            System.out.println("Select option(From 1 to 3. If you want get back to the Change Information type 0)");
                            System.out.println("Which information needs to be changed?");
                            System.out.println("1. ID");
                            System.out.println("2. Age");
                            System.out.println("3. Name");
                            System.out.println("4. Surname");
                            System.out.println("5. Disability");
                            System.out.println("0. Exit");

                            int num2 = sc.nextInt();

                            if (num2 == 0) {
                                changePassenger = false;
                            }
                            else if (num2 == 1) {
                                System.out.println("Old ID is " + passenger1.getID());
                                System.out.println("Type new ID: ");
                                int num3 = sc.nextInt();
                                passenger1.setID(num3);
                                System.out.println("New ID is " + passenger1.getID());
                            }
                            else if (num2 == 2) {
                                System.out.println("Old age is " + passenger1.getAge());
                                System.out.println("Type new age: ");
                                int num3 = sc.nextInt();
                                passenger1.setAge(num3);
                                System.out.println("New age is " + passenger1.getAge());
                            }
                            else if (num2 == 3) {
                                System.out.println("Old name is " + passenger1.getName());
                                System.out.println("Type new name: ");
                                String name = sc.next();
                                passenger1.setName(name);
                                System.out.println("New name is " + passenger1.getName());
                            }
                            else if (num2 == 4) {
                                System.out.println("Old surname is " + passenger1.getSurname());
                                System.out.println("Type new surname: ");
                                String surname = sc.next();
                                passenger1.setSurname(surname);
                                System.out.println("New surname is " + passenger1.getSurname());
                            }
                            else if (num2 == 5) {
                                if (passenger1.getDisability()) {
                                    System.out.println("Passenger has a disability");
                                }
                                else {
                                    System.out.println("Passenger does not have a disability");
                                }
                                System.out.println("Does Passenger have a disability?");
                                System.out.println("Type: Y or N");
                                String choice = sc.next();
                                if (choice == "Y" || choice == "y") {
                                    passenger1.setDisability(true);
                                }
                                else {
                                    passenger1.setDisability(false);
                                }
                            }
                            else {
                                System.out.println("Choose correct number!");
                            }

                        }
                    }
                    else {
                        System.out.println("Choose correct number!");
                    }
                }
            } else if (num == 4) {

                boolean getGeneral = true;

                while (getGeneral) {

                    System.out.println("Select option(From 1 to 3. If you want get back to the main menu type 0)");
                    System.out.println("Which information do you need?");
                    System.out.println("1. Train");
                    System.out.println("2. Car");
                    System.out.println("3. Passenger");
                    System.out.println("0. Exit");

                    int num1 = sc.nextInt();

                    if (num1 == 1) {

                        boolean getTrain = true;
                        while (getTrain) {

                            System.out.println("Select option(From 1 to 3. If you want get back to the Get Information type 0)");
                            System.out.println("Which information do you need?");
                            System.out.println("1. Speed");
                            System.out.println("2. Number of Cars");
                            System.out.println("3. Direction");
                            System.out.println("0. Exit");

                            int num2 = sc.nextInt();

                            if (num2 == 0) {
                                getTrain = false;
                            }
                            else if (num2 == 1) {
                                System.out.println("Current speed is " + passenger1.getSpeed());
                            }
                            else if (num2 == 2) {
                                System.out.println("Number of cars: " + passenger1.getNumOfCars());
                            }
                            else if (num2 == 3) {
                                System.out.println("Current direction is " + passenger1.getDirection());
                            }
                            else {
                                System.out.println("Choose correct number!");
                            }

                        }
                    } else if (num1 == 0) {
                        getGeneral = false;
                    } else if (num1 == 2) {

                        boolean getCar = true;
                        while (getCar) {

                            System.out.println("Select option(From 1 to 4. If you want get back to the Get Information type 0)");
                            System.out.println("Which information do you need?");
                            System.out.println("1. Type");
                            System.out.println("2. Number of Lower places");
                            System.out.println("3. Number of Upper places");
                            System.out.println("4. Number of All places");
                            System.out.println("0. Exit");

                            int num2 = sc.nextInt();

                            if (num2 == 0) {
                                getCar = false;
                            }
                            else if (num2 == 1) {
                                System.out.println("Current type is " + passenger1.getType());
                            }
                            else if (num2 == 2) {
                                System.out.println("Number of lower places: " + passenger1.getNumOfLower());
                            }
                            else if (num2 == 3) {
                                System.out.println("Number of upper places: " + passenger1.getNumOfUpper());
                            }
                            else if(num2 == 4) {
                                System.out.println("Number of all places: " + passenger1.getMaxNumberOfPassengers());
                            }
                            else {
                                System.out.println("Choose correct number!");
                            }

                        }
                    } else if (num1 == 3) {

                        boolean getPassenger = true;
                        while (getPassenger) {

                            System.out.println("Select option(From 1 to 3. If you want get back to the Get Information type 0)");
                            System.out.println("Which information do you need?");
                            System.out.println("1. ID");
                            System.out.println("2. Age");
                            System.out.println("3. Name");
                            System.out.println("4. Surname");
                            System.out.println("5. Disability");
                            System.out.println("0. Exit");

                            int num2 = sc.nextInt();

                            if (num2 == 0) {
                                getPassenger = false;
                            }
                            else if (num2 == 1) {
                                System.out.println("Current ID is " + passenger1.getID());
                            }
                            else if (num2 == 2) {
                                System.out.println("Current age is " + passenger1.getAge());
                            }
                            else if (num2 == 3) {
                                System.out.println("Current name is " + passenger1.getName());
                            }
                            else if (num2 == 4) {
                                System.out.println("Current surname is " + passenger1.getSurname());
                            }
                            else if (num2 == 5) {
                                if(passenger1.getDisability()) {
                                    System.out.println("Passenger have a disability");
                                }
                                else {
                                    System.out.println("Passenger don't have a disability");
                                }
                            }
                            else {
                                System.out.println("Choose correct number!");

                            }
                        }
                    }
                    else {
                        System.out.println("Choose correct number!");

                    }
                }
            }
            else {
                System.out.println("Choose correct number!");

            }
        }
    }
}