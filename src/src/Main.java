import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CarDirector director = new CarDirector();
        Builder builder = new CarBuilder();
        Car directorCar = director.construct(builder);
        Scanner sc = new Scanner(System.in);

        System.out.println("The car i built is: " + directorCar);

        System.out.println("Let's add your car");

        Car userCar = director.constructFromUser(new CarBuilder(), sc);
        System.out.println("The car you built: " + userCar);
    }
}
