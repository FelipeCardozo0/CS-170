import java.util.Scanner;
public class ATM {
    public static void main(String[] args) {
        double balance = 1000.00;
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        while (!exit) {
            System.out.println("ATM Menu:");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            if(choice == 1){
                System.out.println("Your current balance is: $" + balance);
            }
            else if(choice == 2){
                System.out.print("Enter deposit amount: ");
                double amount = scanner.nextDouble();
                balance += amount;
                System.out.println("You've successfully deposited $" + amount + " Your new balance is $" + balance);
            }
            else if(choice == 3){
                System.out.print("Enter withdrawal amount: ");
                double amount = scanner.nextDouble();
                if (amount > balance) {
                    System.out.println("Insufficient funds. Please enter a smaller amount.");
                } else {
                    balance -= amount;
                    System.out.println("You've successfully withdrawn $" + amount +
                            ". Your new balance is $" + balance);
                }
            }
            else if(choice == 4){
                exit = true;
            }
            else{
                System.out.println("Invalid choice. Please try again.");
            }
        }
        System.out.println("Thank you for using the ATM. Goodbye!");
    }
}
