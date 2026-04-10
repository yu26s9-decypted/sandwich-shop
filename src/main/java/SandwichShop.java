import java.util.Scanner;

public class SandwichShop {
    public static double calculatedFinalPrice(double sandwichPrice,double discountRate){
        double calculateFinalPrice = sandwichPrice - (sandwichPrice * discountRate);
        return calculateFinalPrice;

    }

    public static void main(String[] args){


        //input

        Scanner input = new Scanner(System.in);
        String regularSandwich = "Regular Sandwich";
        String largeSandwich = "Large Sandwich";
        double regularPrice = 5.45;
        double largePrice = 8.95;
        double discountSeniorPercentage = 0.2;
        double discountChildPercentage = 0.1;
        double discountedPrice = 0;
        String selectedSandwich;
        double selectedSandwichPrice;
        double finalPrice;


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


        System.out.println("What is your age?");
        int age = input.nextInt();

//        Calculate

        if (age <= 17) {
            System.out.println("You are eligibile for a 10% discount");
            finalPrice = calculatedFinalPrice(selectedSandwichPrice, discountChildPercentage);




        } else if (age >= 65 ){
            System.out.println("You are eligibile for a senior 20% discount");
            finalPrice = calculatedFinalPrice(selectedSandwichPrice, discountSeniorPercentage);
        } else {
            finalPrice = calculatedFinalPrice(selectedSandwichPrice, 0);
        }

        //all of your display goes here... aka output
        System.out.printf("Sandwich choice is: %d which is a %s and cost $%.2f \n", sandwichChoice, selectedSandwich, selectedSandwichPrice);
        System.out.printf("Your total for %s: $%.2f", selectedSandwich, finalPrice);

    }

}
