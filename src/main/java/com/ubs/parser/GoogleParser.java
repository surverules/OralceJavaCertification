package com.ubs.parser;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.*;

public class GoogleParser {


    public static void main(String[] args) {

        String fileName = "sample.json";
        //String json = "{'name': 'sachin', 'address':'pune'}";
        String json = new String();
        File file = new File(Parser.class.getClassLoader().getResource(fileName).getFile());
        Gson gson = new GsonBuilder().create();
        InputStream inputStream = null;
        BufferedReader bufferedReader = null;
        Reader reader = null;
        String line = new String();

        try {
             //inputStream = new FileInputStream(json);
            bufferedReader = new BufferedReader(new FileReader(file));
            //json.concat("{");
            while ((line = bufferedReader.readLine()) != null){
                json += line;
            }
            //json.concat("}");

        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(json);

        Sample owner =  gson.fromJson(json, Sample.class);
        System.out.println(owner);
    }
}
