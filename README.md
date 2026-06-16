# Sandwich Shop

A Java console application that simulates a sandwich shop ordering system — letting customers choose a sandwich size, add-ons, and applies discounts based on customer type.

## About This Project

Built at **Year Up United — Learn to Code Academy (LTCA)** as a Java exercise in business logic and method design. This project combined user input, conditional logic, and pricing calculations to simulate a real-world point-of-sale scenario.

## What I Learned

- Writing static helper methods to encapsulate reusable logic (`calculatedFinalPrice`)
- Applying percentage-based discounts (senior discount, child discount)
- Using `Scanner` to build an interactive ordering menu
- Working with `String` comparisons and boolean flags
- Formatting output for a clean receipt-style display using `printf`

## How to Run

```bash
mvn compile exec:java -Dexec.mainClass="SandwichShop"
```

## Features

- Choose between **Regular** ($5.45) or **Large** ($8.95) sandwich
- Option to add loaded toppings (extra cost)
- Automatic discount applied for **senior** (20% off) or **child** (10% off) customers
- Displays final price after discount

## Tech Stack

- **Java**
- **Maven**
- **IntelliJ IDEA**
