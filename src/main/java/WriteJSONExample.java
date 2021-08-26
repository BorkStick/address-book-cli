import java.io.FileWriter;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class WriteJSONExample
{
    @SuppressWarnings("unchecked")
    public static void main()
    {
        //First address
        JSONObject addressDetails = new JSONObject();
        addressDetails.put("firstName", "tylor");
        addressDetails.put("lastName", "wurz");
        addressDetails.put("phone", "123");
        addressDetails.put("email", "tylor@email.com");

        JSONObject addressObject = new JSONObject();
        addressObject.put("address", addressDetails);

        //Second address
        JSONObject addressDetails2 = new JSONObject();
        addressDetails2.put("firstName", "terry");
        addressDetails2.put("lastName", "fromit");
        addressDetails2.put("phone", "234");
        addressDetails2.put("email", "terry@email.com");

        JSONObject addressObject2 = new JSONObject();
        addressObject2.put("address", addressDetails2);

        //Add address to list
        JSONArray addressList = new JSONArray();
        addressList.add(addressObject);
        addressList.add(addressObject2);

        //Write JSON file
        try (FileWriter file = new FileWriter("addressbook.json")) {
            //We can write any JSONArray or JSONObject instance to the file
            file.write(addressList.toJSONString());
            file.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}