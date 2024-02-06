/*This code uses the "Thread class to delay the timer of the countdown to 1 second before
the number prints. Also uses the throws method to catch exceptions
The "long" primative was also used during this program to count the current milliseconds and the milliseconds
that the user inputs their response.
It then subtracts the current and final milliseconds to give the use their reaction time.

*/
import java.util.Scanner;
import java.util.Random;

public class ReactFast {
    public static void main(String[] args) throws InterruptedException{
        System.out.println("3");
        Thread.sleep(1000);
        System.out.println("2");
        Thread.sleep(1000);
        System.out.println("1");
        Thread.sleep(1000);
        System.out.println("GO!!!!!!!");
        Thread.sleep(1000);

        Random rand = new Random();
         int r = rand.nextInt(6);

         switch(r){
             case 0:
                 System.out.println("What is todays date?");
                 break;
             case 1:
                 System.out.println("How old are you today?");
                 break;
             case 2:
                 System.out.println("How many siblings do you have?");
                 break;
             case 3:
                 System.out.println("What did you eat today?");
                 break;
             case 4:
                 System.out.println("Do you have a car?");
                 break;
             case 5:
                 System.out.println("Do you have a girlfriend/boyfriend?");
                 break;


         }


        long startTime = System.currentTimeMillis();

        Scanner s = new Scanner(System.in);
        String a = s.next();
        long stopTime = System.currentTimeMillis();

        long reactionTime = stopTime - startTime;

        System.out.println(reactionTime + "ms");

    }
}
