import org.json.JSONObject;
import org.json.XML;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String args[]) throws IOException {

        String root="";
        File f=new File("C:\\Users\\Cyrano\\Documents\\dependency.xml");
        char veriler[]=new char [(int) f.length()];

        FileReader f2=new FileReader(f);
        f2.read(veriler);
        String okunan=new String(veriler);
        System.out.println(okunan);
        f2.close();

        JSONObject xmlJSONObj = XML.toJSONObject(okunan);
        String json = xmlJSONObj.toString(4);
        System.out.println(json);

        File fw=new File("C:\\Users\\Cyrano\\Documents\\Output.json");
        FileWriter yazdir=new FileWriter(fw);
        yazdir.write(json);
        yazdir.close();

    }
}
