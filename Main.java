import java.util.Scanner;

import static functions.Classes.Calculator;

public class Main {
    public static void main(String[] args){
        int num, num2, total;
        String operation, result;
        int results[] = {0};
        Scanner keyboard = new Scanner(System.in);
        try {
            System.out.print("Enter a number: ");
            num = keyboard.nextInt();
            System.out.print("Enter an operation: ");
            operation = keyboard.next();
            System.out.print("Enter a number: ");
            num2 = keyboard.nextInt();
            total = Calculator(num,num2, operation);
            System.out.println("The result is: " + total);
            System.out.println("Do you want to store results?(Y/N): ");
            result = keyboard.next();
            if(result.equals("Y") || result.equals("y")){
                System.out.println("Data Saved");
            }else{
                System.out.println("Data has been deleted");
            }

        } catch (Exception e) {
            System.out.println("This is not a number.");
        }
    }
}
