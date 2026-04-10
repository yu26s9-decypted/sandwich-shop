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
        double appliedDiscountPercentage;
        boolean appliedDiscount;
        String finalOutput;


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
            finalPrice = calculatedFinalPrice(selectedSandwichPrice, discountChildPercentage);
            appliedDiscount = true;
            appliedDiscountPercentage = discountChildPercentage;
            finalOutput = "Customers who are 17 and below gets a 10% discount! This discount has been automatically applied for you";



        } else if (age >= 65 ){
            finalPrice = calculatedFinalPrice(selectedSandwichPrice, discountSeniorPercentage);
            appliedDiscount = true;
            appliedDiscountPercentage = discountSeniorPercentage;
            finalOutput = "Customers who are 65 and above gets a 20% discount! This discount has been automatically applied for you";
        } else {
            finalPrice = calculatedFinalPrice(selectedSandwichPrice, 0);
            appliedDiscount = false;
            appliedDiscountPercentage = 0;
            finalOutput = "Thank you for being a customer at Sandwich Shop Inc. We look forward to seeing you back";
        }


        //output
//        System.out.printf("Sandwich choice is: %d which is a %s and cost $%.2f \n", sandwichChoice, selectedSandwich, selectedSandwichPrice);
//        System.out.printf("Your total for %s: $%.2f \n", selectedSandwich, finalPrice);

        System.out.println("|======RECIEPT======|");
        System.out.printf("Customer: Demo \n");
        System.out.printf("%s: $%.2f \n", selectedSandwich, selectedSandwichPrice);
       if (appliedDiscount == true) {
           System.out.printf("Applied Discount: %.0f%%  \n", appliedDiscountPercentage * 100);
       }
        System.out.printf("Total: $%.2f \n", finalPrice);
        System.out.printf("|======| %s |======|", finalOutput);


    }

}
