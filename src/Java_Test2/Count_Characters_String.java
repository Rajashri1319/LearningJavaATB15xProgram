package Java_Test2;
import java.util.Scanner;


public class Count_Characters_String
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("====Count Character in String===");
        System.out.println("Enter the String");
        String name = scanner.nextLine();

        int charCount = countCharactersWithoutSpaces(name);
        System.out.println("\nThe Input String is:\"" + name + "\"");
        System.out.println("Total characters (Excluding Spaces) is : " + charCount);

        scanner.close();
    }
     public static int countCharactersWithoutSpaces(String str){
        int count = 0;
        for(int i=0; i<str.length() ; i++)
        {
            if (str.charAt(i) != ' ') {
                count++;
            }
        }

         return count;
     }
        }
