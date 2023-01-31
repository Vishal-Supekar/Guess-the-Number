
import java.util.*;
public class Nguess
{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Random ran=new Random();
        System.out.println();
        System.out.println("                 Welcome to Number Guessing Game                ");
        System.out.println();
        System.out.println("RULES: ");
        System.out.println("      You have maximum 15 chances to guess the number.");
        System.out.println("      You will have 3 rounds to guess the number. ");
        System.out.println("      Each round consists of 5 attempts respectively");
        System.out.println("  1.] If Number guessed in 1st round you will Score 100 points.");
        System.out.println("  2.] If Number guessed in 2nd round you will Score 70 points.");
        System.out.println("  3.] If Number guessed in 3rd round you will Score 40 points.");
        System.out.println();
        System.out.println("                     All the Best!!!                   ");
        System.out.println();
        System.out.println("My number is less than 100");
        System.out.println();

        int number=ran.nextInt(100);
        int usernumber=-1;
        int count=0,i=1;
        int rounds=3;
        while(usernumber !=number)
        {
            count++;
            System.out.print("My number is : ");
            usernumber =sc.nextInt();
            if(count<=5)
            {
            if(usernumber<number)
            {
                System.out.println("My number is bigger! ");
                System.out.println();
            }
            else if(usernumber>number)
            {
                System.out.println("My number is smaller!");
                System.out.println();
            }
            else 
            {
                System.out.println("  ____                            _       _\n" +
                        " / ___|___  _ __   __ _ _ __ __ _| |_ ___| |\n" +
                        "| |   / _ \\| '_ \\ / _` | '__/ _` | __/ __| |\n" +
                        "| |__| (_) | | | | (_| | | | (_| | |_\\__ \\_|\n" +
                        " \\____\\___/|_| |_|\\__, |_|  \\__,_|\\__|___(_)\n" +
                        "                  |___/");
                System.out.println();

                if(i==1)
                {
                   System.out.println("Congratulations You have Sucessfully guessed the Number in the " +i+ "st round");
                   System.out.println();
                   System.out.println("             You have scored 100 Points");
                   System.out.println();
                }
                else if(i==2)
                {
                   System.out.println("Congratulations You have Sucessfully guessed the Number in the " +i+ "nd round");
                  System.out.println();
                   System.out.println("             You have scored 70 Points");
                   System.out.println();
                }
                else if(i==3)
                {
                   System.out.println("Congratulations You have Sucessfully guessed the Number in the " +i+ "rd round");
                   System.out.println();
                   System.out.println("             You have scored 40 Points");
                   System.out.println();                    
                }
            }
        }
        else if(count>5 && i!=rounds)
        {
            System.out.println();
            System.out.println("Sorry!!! You Failed to Guess the Number in Round " + i );
            int rem=rounds-i;
            System.out.println();
            System.out.println("You have " + rem + " more rounds to go." );
            System.out.println();
            i++;
            count=0;
        }
        else
        {
                System.out.println();
                System.out.println("        Sorry!!! You Failed to Guess the Number in given attempts ");
                System.out.println();
                System.out.println("              The correct number is "+ number);
                System.out.println();
                System.out.println("              Your Score is 0");
                System.out.println();
                System.out.println("               Please Try Again ");
                break;
        }
        }
    }
}