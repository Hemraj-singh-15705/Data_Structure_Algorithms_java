#include <stdio.h>
#include <unistd.h> // for sleep function

//int main() {
//    char name[50];
//    int age;
//
//    // Ask for user input
//       printf("Enter the Name :)");
//       scanf("%s",name);
//       printf("Enter the age :)");
//       scanf("%d",age);
//    // ASCII art animation loop
//    for (int i = 0; i < 5; i++) {
//        printf("\n\n");
//        printf("    ~~~~~~~~~~~~~~  ~~~~~~~~~~~~~~\n");
//        printf("   |               ||              |\n");
//        printf("   |  HAPPY        ||  HAPPY       |\n");
//        printf("   |               ||              |\n");
//        printf("   |  BIRTHDAY,    ||  BIRTHDAY,   |\n");
//        printf("   |               ||              |\n");
//        printf("   |  %s!  ||  %s! |\n", name, name);
//        printf("   |               ||              |\n");
//        printf("   |  :D  :D  :D   ||  :D  :D  :D  |\n");
//        printf("   |               ||              |\n");
//        printf("    ~~~~~~~~~~~~~~  ~~~~~~~~~~~~~~\n");
//        sleep(1); // Pause for 1 second
//        system("clear"); // Clear console screen (for Unix/Linux)
//    }
//
//    // Display birthday wish with ASCII art
//    printf("\n\n\n\n");
//    printf("        ___________________________________________\n");
//    printf("       |\\                                         /|\n");
//    printf("       | \\                                       / |\n");
//    printf("       |  \\                                     /  |\n");
//    printf("       |   -------------------------------------   |\n");
//    printf("       |   |                                   |   |\n");
//    printf("       |   |  Happy Birthday, %s!       |   |\n", name);
//    printf("       |   |                                   |   |\n");
//    printf("       |   |    Wishing you a fantastic day   |   |\n");
//    printf("       |   |       on turning %d!            |   |\n", age);
//    printf("       |   |                                   |   |\n");
//    printf("       |   -------------------------------------   |\n");
//    printf("       |  /                                     \\  |\n");
//    printf("       | /                                       \\ |\n");
//    printf("       |/_________________________________________\\|\n");
//    printf("\n");
//
//    return 0;
//}
// with color full wishing wirthday 
#include <stdio.h>
#include <unistd.h> // for sleep function

// ANSI escape codes for text coloring
#define RED     "\033[0;31m"
#define GREEN   "\033[0;32m"
#define YELLOW  "\033[0;33m"
#define BLUE    "\033[0;34m"
#define MAGENTA "\033[0;35m"
#define CYAN    "\033[0;36m"
#define RESET   "\033[0m"

main() {
    char name[50];
    int age;

    // Ask for user input
    printf("Enter your name: ");
    scanf("%s", name);
    printf("Enter your age: ");
    scanf("%d", &age);

    // ASCII art animation loop
    for (int i = 0; i < 5; i++) {
        printf("\033[H\033[2J"); // Clear console screen
        printf("\n\n\n\n\n");
        printf("%s", MAGENTA); // Set text color to magenta
        printf("    ~~~~~~~~~~~~~~  ~~~~~~~~~~~~~~\n");
        printf("   |               ||              |\n");
        printf("   |  %sHAPPY        %s||  %sHAPPY       %s|\n", CYAN, MAGENTA, CYAN, MAGENTA);
        printf("   |               ||              |\n");
        printf("   |  %sBIRTHDAY,    %s||  %sBIRTHDAY,   %s|\n", CYAN, MAGENTA, CYAN, MAGENTA);
        printf("   |               ||              |\n");
        printf("   |  %s%s!  %s||  %s%s! %s|\n", CYAN, name, MAGENTA, CYAN, name, MAGENTA);
        printf("   |               ||              |\n");
        printf("   |  %s:D  :D  :D   %s||  %s:D  :D  :D  %s|\n", CYAN, MAGENTA, CYAN, MAGENTA);
        printf("   |               ||              |\n");
        printf("    ~~~~~~~~~~~~~~  ~~~~~~~~~~~~~~\n");
        fflush(stdout); // Flush output buffer
        sleep(1); // Pause for 1 second
    }

    // Display birthday wish with colorful ASCII art
    printf("\033[H\033[2J"); // Clear console screen
    printf("\n\n\n\n\n");
    printf("%s", RED); // Set text color to red
    printf("        ___________________________________________\n");
    printf("       |\\                                         /|\n");
    printf("       | \\                                       / |\n");
    printf("       |  \\                                     /  |\n");
    printf("       |   -------------------------------------   |\n");
    printf("       |   |                                   |   |\n");
    printf("       |   |  Happy Birthday, %s!       |   |\n", name);
    printf("       |   |                                   |   |\n");
    printf("       |   |    Wishing you a fantastic day   |   |\n");
    printf("       |   |       on turning %d!            |   |\n", age);
    printf("       |   |                                   |   |\n");
    printf("       |   -------------------------------------   |\n");
    printf("       |  /                                     \\  |\n");
    printf("       | /                                       \\ |\n");
    printf("       |/_________________________________________\\|\n");
    printf("\n");
    printf("%s", RESET); // Reset text color

    return 0;
}
