import java.util.Scanner;

public class CarDirector {
    public Car construct(Builder builder) {
        builder.setBrand("Tesla");
        builder.setModel("Model 3");
        builder.setColor("White");
        return builder.build();
    }

    public Car constructFromUser(Builder builder, Scanner sc) {
        System.out.print("What is the brand? ");
        builder.setBrand(sc.nextLine());

        System.out.print("What is the model? ");
        builder.setModel(sc.nextLine());

        System.out.print("What is the color? ");
        builder.setColor(sc.nextLine());

        return builder.build();
    }
}
