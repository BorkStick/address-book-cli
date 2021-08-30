import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class AddressBook {
    public static void main() {
        System.out.println("");
        System.out.println("");
        System.out.println("List Address");

    }

    public static void ReadFromFile(){
        //JSON parser object to parse read file
        JSONParser jsonParser = new JSONParser();

        try (FileReader reader = new FileReader("addressbook.json"))
        {
            //Read JSON file
            Object obj = jsonParser.parse(reader);

            JSONArray addressList = (JSONArray) obj;
            System.out.println(addressList);

            //Iterate over employee array
            addressList.forEach( add -> parseAddressObject( (JSONObject) add ) );

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    private static void parseAddressObject(JSONObject address)
    {
        //Get address object within list
        JSONObject addressObject = (JSONObject) address.get("address");

        System.out.println("====================================");
      //Get address id
        String id = (String) addressObject.get("id");
        System.out.println("ID: " + id);

        //Get address first name
        String firstName = (String) addressObject.get("firstName");
        System.out.println("First Name: " + firstName);

        //Get address last name
        String lastName = (String) addressObject.get("lastName");
        System.out.println("Last Name: " + lastName);

        //Get employee website name
        String phone = (String) addressObject.get("phone");
        System.out.println("Phone: " + phone);

        //Get employee website name
        String email = (String) addressObject.get("email");
        System.out.println("Email: " + email);

        System.out.println("====================================");
    }


    public static void AddToBook(String x) {

    }

    public static void searchBook() throws Exception{

        // get user input
        Scanner search = new Scanner (System.in);
        System.out.println("Search for address");
        search.next();
        System.out.printf("Displaying all entrys that match: %s", search);


        String jsonString = "{\"Id\":101, \"firstName\":\"tylor\", \"lastName\":\"wurz\"}, {\"Id\":102, \"firstName\":\"steve\", \"lastName\":\"fromit\"}";
        ObjectMapper mapper = new ObjectMapper();
        ObjectNode node = mapper.readValue(jsonString, ObjectNode.class);
        if(node.has("firstName")) {
            System.out.println("NAME: " + node.get("firstName"));

        }
    }

    public static void DeleteById(){
        Scanner name = new Scanner (System.in);
        System.out.println("Select Address by ID to Delete");
        String id = name.next();

        // delete entry from json file by the id


        System.out.println("Deleting:" + id);
        System.out.println("");
    }



    public static void DeleteAll() {
        JSONArray blankList = new JSONArray();
        try (FileWriter file = new FileWriter("addressbook.json")) {
            //We can write any JSONArray or JSONObject instance to the file
            file.write(blankList.toJSONString());
            file.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
