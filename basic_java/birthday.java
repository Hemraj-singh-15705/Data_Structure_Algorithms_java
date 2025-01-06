/*import java.util.Scanner;

public class birthday {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask for user input
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // Display birthday wish with effects
        System.out.println("\n---------------------------------------------");
        System.out.println("|                                           |");
        System.out.println("|             Happy Birthday!               |");
        System.out.println("|                                           |");
        System.out.println("---------------------------------------------");
        System.out.println("    ,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,");
        System.out.println("   /                                     \\");
        System.out.println("  |    -----------------------------      |");
        System.out.println("  |   |                           |      |");
        System.out.println("  |   |  " + name + ",                    |      |");
        System.out.println("  |   |       Wishing you a      |      |");
        System.out.println("  |   |     Happy Birthday!      |      |");
        System.out.println("  |   |                           |      |");
        System.out.println("  |   |      Congratulations    |      |");
        System.out.println("  |   |          on turning " + age + "!    |      |");
        System.out.println("  |   |                           |      |");
        System.out.println("  |    -----------------------------      |");
        System.out.println("   \\                                     /");
        System.out.println("    '-----------------------------------'");

        scanner.close();
    }
}
*/  

//METHOD 2ND FOR WISHING BIRTHDAY WITH COLOR FULL 
import java.util.Scanner;

public class birthday {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask for user input
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // ASCII art animation loop
        for (int i = 0; i < 5; i++) {
            System.out.println("\033[H\033[2J"); // Clear console screen
            System.out.flush();
            System.out.println("\n\n\n\n\n");
            System.out.println("\u001B[35m"); // Magenta color
            System.out.println("    ~~~~~~~~~~~~~~  ~~~~~~~~~~~~~~");
            System.out.println("   |               ||              |");
            System.out.println("   |  \u001B[36mHAPPY        \u001B[35m||  \u001B[36mHAPPY       \u001B[35m|");
            System.out.println("   |               ||              |");
            System.out.println("   |  \u001B[36mBIRTHDAY,    \u001B[35m||  \u001B[36mBIRTHDAY,   \u001B[35m|");
            System.out.println("   |               ||              |");
            System.out.println("   |  \u001B[36m" + name.toUpperCase() + "!  \u001B[35m||  \u001B[36m" + name.toUpperCase() + "! \u001B[35m|");
            System.out.println("   |               ||              |");
            System.out.println("   |  \u001B[36m:D  :D  :D   \u001B[35m||  \u001B[36m:D  :D  :D  \u001B[35m|");
            System.out.println("   |               ||              |");
            System.out.println("    ~~~~~~~~~~~~~~  ~~~~~~~~~~~~~~");
            try {
                Thread.sleep(1000); // Pause for 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // Display birthday wish with colorful ASCII art
        System.out.println("\033[H\033[2J"); // Clear console screen
        System.out.flush();
        System.out.println("\n\n\n\n\n");
        System.out.println("\u001B[31m"); // Red color
        System.out.println("        ___________________________________________");
        System.out.println("       |\\                                         /|");
        System.out.println("       | \\                                       / |");
        System.out.println("       |  \\                                     /  |");
        System.out.println("       |   -------------------------------------   |");
        System.out.println("       |   |                                   |   |");
        System.out.println("       |   |  Happy Birthday, " + name + "!       |   |");
        System.out.println("       |   |                                   |   |");
        System.out.println("       |   |    Wishing you a fantastic day   |   |");
        System.out.println("       |   |       on turning " + age + "!            |   |");
        System.out.println("       |   |                                   |   |");
        System.out.println("       |   -------------------------------------   |");
        System.out.println("       |  /                                     \\  |");
        System.out.println("       | /                                       \\ |");
        System.out.println("       |/_________________________________________\\|");
        System.out.println("\n");
        System.out.println("\u001B[0m"); // Reset color

        scanner.close();
    }
}
