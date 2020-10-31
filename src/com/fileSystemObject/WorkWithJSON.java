package com.fileSystemObject;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class WorkWithJSON {
    public static void main(String[] args) throws Throwable {
        JSONParser parser = new JSONParser();
        Object obj = parser.parse(new FileReader("./test/Text.json"));
        JSONObject jobj = (JSONObject)obj;
        Object arrayObject = jobj.get("Createcredentials");
        JSONArray jarrayobject = (JSONArray)arrayObject;
        System.out.println(jarrayobject.size());

        for(Object x: jarrayobject){
            JSONObject jo = (JSONObject)x;
            System.out.println(jo.get("cname"));
            System.out.println(jo.get("cpwd"));

        }

    }
}
