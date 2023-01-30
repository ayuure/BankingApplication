import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

            System.out.println("Welcome to Joyous Banking, What will you like to do");
            System.out.println("Press 1 to check balance, 2 to make a deposit, 3 to withdraw money and 0 to exist the application");
            Scanner input = new Scanner(System.in);
            int selection = input.nextInt();
            double balance = 200.34;



        if(selection==1) {
            do {
                System.out.println(balance);
                System.out.println("Do you wish to perform another action, press Y/N");
                String anotherSelection = input.next();
                if (anotherSelection.equalsIgnoreCase("Y")) {

                    try {
                        anotherSelection = input.nextLine();
                    } catch (Exception e) {
                        System.out.println("Invalid input, please enter Y/N.");
                        input.nextLine(); // discard the invalid input

                    }

                    System.out.println("Press 1 to check balance, 2 to make a deposit, 3 to withdraw money and 0 to exist the application");
                    try {
                        selection = input.nextInt();
                    } catch (Exception e) {
                        System.out.println("Invalid input, please enter a valid number.");
                        input.nextLine(); // discard the invalid input

                    }

                }
                else {
                    System.out.println("Thank you for banking with us");
                }
            }while (selection==1);


        }


        if (selection==2){
            do{
            System.out.println("How much would you like to deposit");

            float deposit = input.nextFloat();
            balance+=deposit;
            System.out.println("You have successfully deposit an amount of "+deposit+". "+ "Your available balance is "+(double) Math.round(balance*100)/100);

                System.out.println("Do you wish to perform another action, press Y/N");
                String anotherSelection = input.next();
                if (anotherSelection.equalsIgnoreCase("Y")) {

                    try {
                        anotherSelection= input.nextLine();
                    } catch (Exception e) {
                        System.out.println("Invalid input, please enter a valid number.");
                        input.nextLine(); // discard the invalid input

                    }

                    System.out.println("Press 1 to check balance, 2 to make a deposit, 3 to withdraw money and 0 to exist the application");
                    try {
                        selection = input.nextInt();
                    } catch (Exception e) {
                        System.out.println("Invalid input, please enter a valid number.");
                        input.nextLine(); // discard the invalid input

                    }
                }
                else {
                    System.out.println("Thank you for banking with us");
                }
            }while (selection==2);
        }
        if(selection==3) {
            do {
                System.out.println("How much would you like to withdraw");
                float withdrawal = input.nextFloat();
                balance -= withdrawal;
                System.out.println("You have successfully withdrawn " + withdrawal + ". " + "You available balance is " + (double) Math.round(balance * 100) / 100);

                System.out.println("Do you wish to perform another action, press Y/N");
                String anotherSelection = input.next();
                if (anotherSelection.equalsIgnoreCase("Y")) {

                    try {
                        anotherSelection= input.nextLine();
                    } catch (Exception e) {
                        System.out.println("Invalid input, please enter a valid number.");
                        input.nextLine(); // discard the invalid input

                    }

                    try {
                        anotherSelection = input.next();
                    } catch (Exception e) {
                        System.out.println("Invalid input, please enter Y/N.");
                        input.next(); // discard the invalid input

                    }

                    System.out.println("Press 1 to check balance, 2 to make a deposit, 3 to withdraw money and 0 to exist the application");
                    try {
                        selection = input.nextInt();
                    } catch (Exception e) {
                        System.out.println("Invalid input, please enter a valid number.");
                        input.nextLine(); // discard the invalid input

                    }

                }
                else {
                    System.out.println("Thank you for banking with us");
                }
            }while (selection==3);
        }
        if(selection==0){
            System.out.println("Thank you for banking with us");
        }



    }
}