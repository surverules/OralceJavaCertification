package com.ubs.parser;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class JsonParser {

    public static void main(String[] args) {

        String fileName = "books.json";
        File file = new File(JsonParser.class.getClassLoader().getResource(fileName).getFile());
        StringBuffer stringBuffer = new StringBuffer();
        String record = new String();


        try {

            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));

            while ((record = bufferedReader.readLine()) != null){

                stringBuffer.append(record).append("\n");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        try {

            Gson gson = new GsonBuilder().create();
            OwnerOfLibrary owner =  gson.fromJson(stringBuffer.toString(), OwnerOfLibrary.class);

            System.out.println(" Mr. Owner Name: " + owner.Library);
            System.out.println("-------------------------------------");
            for (Books book: owner.getBooks()                 ) {

                System.out.println(book);
            }
            System.out.println("-------------------------------------");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }


}
