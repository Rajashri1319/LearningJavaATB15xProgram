package Conditions_And_Loops;

import java.util.Scanner;

public class Browser_Selection {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("===Launching Browser===");
        System.out.println("Available Browser : Chrome, Edge , Firefox , Safari");
        System.out.println("Enter Browser Name");
        String browser = scanner.nextLine();

        switch (browser.toLowerCase()) {
            case "Chrome":
                System.out.println("✓ Launching Chrome Browser");
                System.out.println("Driver: chromedriver.exe");
                break;
            case "edge":
                System.out.println("✓ Launching Edge Browser");
                System.out.println("Driver: edgedriver.exe");
                break;
            case "Firefox":
                System.out.println("✓ Launching FireFox Browser");
                System.out.println("Driver: FireFoxdriver.exe");
                break;
            case "Safari":
                System.out.println("✓ Launching Safari Browser");
                System.out.println("Driver: Safaridriver.exe");
                break;
            default:
                System.out.println("✗ Browser not supported");
                System.out.println("Please choose from: Chrome, Firefox, Edge, Safari");
        }
        scanner.close();

    }
}


