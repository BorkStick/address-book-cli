import java.io.BufferedWriter;
import java.io.FileReader;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;



public class AddEntry {

    private static final AtomicInteger count = new AtomicInteger(0);

    public static void setEntry() {
        Scanner name = new Scanner (System.in);

        //String id;
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
        //id = count.incrementAndGet();

        System.out.println("");
        System.out.println("");
        System.out.println("Added New Entry");
        System.out.println("================================");
        //System.out.printf("ID: %o \n", id);
        System.out.printf("First Name: %s \n", firstName);
        System.out.printf("Last Name: %s \n", lastName);
        System.out.printf("Phone Number: %s \n", phoneNumber);
        System.out.printf("Email: %s \n", emailAddress);
        System.out.println("================================");

        JSONObject addressDetails = new JSONObject();
        //addressDetails.put("id", id);
        addressDetails.put("firstName", firstName);
        addressDetails.put("lastName", lastName);
        addressDetails.put("phone", phoneNumber);
        addressDetails.put("email", emailAddress);

        JSONObject addressObject = new JSONObject();
        addressObject.put("address", addressDetails);


        //Add address to list
        JSONArray addressList = new JSONArray();
        addressList.add(addressObject);








        //Write JSON file
        try {
            FileWriter file = new FileWriter("addressbook.json", true);

            //We can write any JSONArray or JSONObject instance to the file
            file.write(addressList.toJSONString());
            System.out.println("adding " + addressList.toJSONString() + "to buffer");
            file.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}
