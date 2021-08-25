import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class AddressBook {
    public static void main() {
        HashMap<String, String> address = new HashMap<>();
        address.put("First Name", "Tylor");
        address.put("Subaru", "WRX STI Type R");

        ArrayList<String> firstName = new ArrayList<String>();
        firstName.add("tylor");
//        firstName.add("terry");

        ArrayList<String> lastName = new ArrayList<String>();
        lastName.add("wurz");
        lastName.add("fromit");
//        String[] firstName = {"tylor", "terry", "steve"};
//        String[] lastName = {"wurz", "fromit", "sellit"};
//        String[] phoneNumber = {"wurz", "fromit", "sellit"};
//        String[] email = {"wurz", "fromit", "sellit"};

        System.out.println("");
        System.out.println("");
        System.out.println("List Address");

        // array list
        for (String i : firstName) {
            System.out.println("================================");
            System.out.println("First Name: "+ i);
            System.out.println("================================");
        }




        System.out.println("");
    }

    public static void ReadFromFile(){
        try {
            File myObj = new File("addressbook.json");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
                System.out.println("");
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }


    public static void AddToBook(String x) {

    }

}
