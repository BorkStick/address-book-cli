
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.JSONException;
import org.json.JSONObject;

public class CrunchifyParseJSONObject {
    public static void main(String[] args) throws FileNotFoundException, JSONException {
        String jsonData = "";
        BufferedReader br = null;
        try {
            String line;
            br = new BufferedReader(new FileReader("crunchify.json"));
            while ((line = br.readLine()) != null) {
                jsonData += line + "\n";
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null)
                    br.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        // System.out.println("File Content: \n" + jsonData);
        JSONObject obj = new JSONObject(jsonData);
        System.out.println("Author: " + obj.getString("Author"));
//        System.out.println("twitter: " + obj.getString("twitter"));
//        System.out.println("social: " + obj.getJSONObject("social"));
    }
}
