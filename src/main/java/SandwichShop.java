import java.util.Scanner;

public class SandwichShop {
    public static double calculatedFinalPrice(double sandwichPrice,double discountRate){
        double FinalPrice = sandwichPrice - (sandwichPrice * discountRate);
        return FinalPrice;

    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String regularSandwich = "Regular Sandwich";
        String largeSandwich = "Large Sandwich";
        double regularPrice = 5.45;
        double largePrice = 8.95;
        double discountedPrice = 0;
        String selectedSandwich;
        double selectedSandwichPrice;


        System.out.println("Welcome to the Sandwich Shop!");
        System.out.println("=======[MENU]=======");
        System.out.printf("(1) %s %.2f", regularSandwich, regularPrice);
        System.out.printf("(2) %s %.2f \n", largeSandwich, largePrice);


        int sandwichChoice = input.nextInt();

        if (sandwichChoice == 1) {
            selectedSandwich = regularSandwich;
            selectedSandwichPrice = regularPrice;
        } else if (sandwichChoice == 2){
            selectedSandwich = largeSandwich;
            selectedSandwichPrice = largePrice;
        } else {
            System.out.println("Sorry, that sandwich is not a valid choice.");
            selectedSandwich = "Invalid choice";
            selectedSandwichPrice = 0;
        }

        System.out.printf("Sandwich choice is: %d which is a %s and cost $%.2f \n", sandwichChoice, selectedSandwich, selectedSandwichPrice);
        System.out.println("What is your age?");
        int age = input.nextInt();


        if (age <= 17) {
            System.out.println("You are eligibile for a 10% discount");
            double finalPrice = calculatedFinalPrice(selectedSandwichPrice, 0.1);
            System.out.printf("Your final price after discount is $%.2f", finalPrice);



        } else if (age >= 65 ){

            System.out.println("You are eligibile for a senior 20% discount");
            double finalPrice = calculatedFinalPrice(selectedSandwichPrice, 0.2);
            System.out.printf("Your final price after discount is $%.2f", finalPrice);
        } else {
            System.out.printf("Your final price for a %s is $%.2f", selectedSandwich, selectedSandwichPrice);
        }

    }

}
