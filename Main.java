import java.util.Scanner;

import static functions.Classes.Calculator;

public class Main {
    public static void main(String[] args) {
        int num;
        int Numlab[] = new int[10];
        for (int c = 0; c < 10; c++) {
            Numlab[c] = c;
        }
        while (true) {
            try {
                Scanner keyboard = new Scanner(System.in);
                System.out.print("Please choose a number: ");
                num = keyboard.nextInt();
                if (BiSearch(Numlab, num)) {
                    System.out.println("Correct!");
                } else {
                    System.out.println("You have choosen a number outside the bounds");
                }
                System.out.println("Do you want to play again? (Y/N)");
                String res = keyboard.next();
                if(res.equals("Y") || res.equals("y")){
                    continue;
                }else{
                    break;
                }
            } catch (Exception e) {
                System.out.println("This is not a valid Integer.");
            }
        }
    }
}
