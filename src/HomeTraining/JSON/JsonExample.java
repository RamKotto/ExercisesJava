package HomeTraining.JSON;

import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Paths;
//import org.json.simple.JSONArray;
//import org.json.simple.JSONObject;
//import org.json.simple.parser.JSONParser;
//
//public class JsonExample {
//    public JsonExample() {
//    }
//
//    public static void main(String[] args) throws Exception {
//        writeJsonSimpleDemo("example.json");
//        JSONObject jsonObject = (JSONObject)readJsonSimpleDemo("example.json");
//        System.out.println(jsonObject);
//        System.out.println(jsonObject.get("age"));
//    }
//
//    public static void writeJsonSimpleDemo(String filename) throws Exception {
//        JSONObject sampleObject = new JSONObject();
//        sampleObject.put("name", "Stackabuser");
//        sampleObject.put("age", 35);
//        JSONArray messages = new JSONArray();
//        messages.add("Hey!");
//        messages.add("What's up?!");
//        sampleObject.put("messages", messages);
//        Files.write(Paths.get(filename), sampleObject.toJSONString().getBytes(), new OpenOption[0]);
//    }
//
//    public static Object readJsonSimpleDemo(String filename) throws Exception {
//        FileReader reader = new FileReader(filename);
//        JSONParser jsonParser = new JSONParser();
//        return jsonParser.parse(reader);
//    }
//}
