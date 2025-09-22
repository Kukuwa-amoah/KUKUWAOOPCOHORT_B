
import java.util.Scanner;
public class FootballPlayer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your Name: \n");
        String name = input.nextLine();

        System.out.print("Enter Your Age: \n ");
        int age = input.nextInt();

        System.out.println("Enter Your height (meters) \n");
        double height = input.nextDouble();

        System.out.print("Enter Your weight (in pounds): \n ");
        double weight = input.nextDouble();

        System.out.print("Enter your jersey number \n");
        int jerseyNumber = input.nextInt();


        //Task 2

        double pound = 0.45359237;
        int meter = 100;

        //converting weight to kg

        double weight2 = weight * pound;


        double height2 = height * meter;


        int casted_weight = (int) weight2;

        System.out.println("Player name - " + name);
        System.out.println("Age - " + age);
        System.out.println("Height (centimeters) - " + height2);
        System.out.println("Weight (kilograms)  - " + weight2);
        System.out.println("JerseyNumber - " + jerseyNumber);

        //Task 3

        System.out.println("Current players age is " + age);
        int newage = --age;
        int new_jersey = jerseyNumber--;

        System.out.println("New Age - " + newage);
        System.out.println("New Jersey - " + new_jersey);

        //Task 4

        //checking age and weight
        if (age >= 18 && age <= 35 || weight2 < 90) {
            System.out.println("ELIGIBLE");
        } else {
            System.out.println("NOT ELIGIBLE");
        }

        //Task 5
        if (age < 20) {
            System.out.println("Rising Star");
        } else if (age >= 20 && age < 30) {
            System.out.println("Prime Player");
        } else {
            System.out.println("Veteran");
        }
//Task 8
        if (age >= 20 && age <= 35) {
            if (weight2 < 80) {
                System.out.println("Start lineup");
            } else {
                System.out.println("Bench");
            }
            ///Task 9
            String eligibility = (age >= 18 && age <= 35 && weight2 < 90) ? "Play" : "Rest";
            System.out.println(eligibility);


            //Task 6

            switch (jerseyNumber) {
                case 1:
                    System.out.println("Goalkeeper");
                    System.out.println("Attacker Jersey - No");
                    break;
                case 2:
                case 5:
                    System.out.println("Defender");
                    System.out.println("Attacker Jersey - No");
                    break;
                case 6:
                case 8:
                    System.out.println("Midfielder");
                    System.out.println("Attacker Jersey - No");
                    break;
                case 7:
                case 11:
                    System.out.println("Winger");
                    System.out.println("Attacker Jersey - Yes");
                    break;
                case 9:
                    System.out.println("Striker");
                    System.out.println("Attacker Jersey - Yes");
                    break;
                case 10:
                    System.out.println("Playmaker");
                    System.out.println("Attacker Jersey - No");
                    break;
                default:
                    System.out.println("Player position not known");
                    System.out.println("Attacker Jersey - No");
                    break;
            }
        }
    }
}