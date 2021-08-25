import java.util.Scanner;

public class AddEntry {

    public static void setEntry() {
        Scanner name = new Scanner (System.in);

        String firstName;
        String lastName;
        String phoneNumber;
        String emailAddress;
        System.out.println("Enter your first name:");
        firstName = name.next();
        AddressBook.AddToBook(firstName);
        System.out.println("Enter your last name:");
        lastName = name.next();
        System.out.println("Enter your phone number:");
        phoneNumber = name.next();
        System.out.println("Enter your email:");
        emailAddress = name.next();

        System.out.println("");
        System.out.println("");
        System.out.println("Added New Entry");
        System.out.println("================================");
        System.out.printf("First Name: %s \n", firstName);
        System.out.printf("Last Name: %s \n", lastName);
        System.out.printf("Phone Number: %s \n", phoneNumber);
        System.out.printf("Email: %s \n", emailAddress);
        System.out.println("================================");



    }


}
