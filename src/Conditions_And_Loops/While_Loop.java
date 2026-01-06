package Conditions_And_Loops;
import java.util.Scanner;

public class While_Loop
{
            public static void main(String[] args)
            {
                Scanner scanner = new Scanner(System.in);
                System.out.println("=== Day of Week Converter ===");
                System.out.print("Enter day number (1-7): ");
                int daynum1 = scanner.nextInt();

                String dayName;

                switch(daynum1) {
                    case 1:
                        dayName = "Monday";
                        break;
                    case 2:
                        dayName = "Tuesday";
                        break;
                    case 3:
                        dayName = "Wednesday";
                        break;
                    case 4:
                        dayName = "Thursday";
                        break;
                    case 5:
                        dayName = "Friday";
                        break;
                    case 6:
                        dayName = "Saturday";
                        break;
                    case 7:
                        dayName = "Sunday";
                        break;
                    default:
                        dayName = "Invalid day";
                }
                System.out.println("Day: " + dayName);
            }
        }