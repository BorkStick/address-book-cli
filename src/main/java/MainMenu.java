import java.util.Scanner;

public class MainMenu {
    public static void main(String args) {



    }

    public static void StartMenu() {
        Scanner userInput = new Scanner(System.in);

        System.out.println("1) Add an entry");
        System.out.println("2) Remove an entry");
        System.out.println("3) Search for a specific entry");
        System.out.println("4) Print Address Book");
        System.out.println("5) Delete Book");
        System.out.println("6) Quit");
        System.out.println("");
        System.out.println("Please choose what you'd like to do:");
        int selection = userInput.nextInt();

        System.out.printf("You have chosen: %s \n", selection);


        switch (selection) {
            case 1:
                System.out.println("1) Add an entry");
                AddEntry.setEntry();
                break;
            case 2:
                System.out.println("2) Remove an entry");
                WriteJSONExample.main();
                break;
            case 3:
                System.out.println("3) Search for a specific entry");
                break;
            case 4:
                System.out.println("4) Print Address Book");
                AddressBook.main();
                AddressBook.ReadFromFile();
                break;
            case 5:
                System.out.println("5) Delete Book");
                break;
            case 6:
                System.out.println("6) Quit");
                System.exit(0);
                break;

        }
    }



}





