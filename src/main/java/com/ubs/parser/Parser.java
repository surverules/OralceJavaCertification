package com.ubs.parser;

import java.io.*;

public class Parser {

    public static void main(String[] args) {

        String fileName = "books.json";
        File file = new File(Parser.class.getClassLoader().getResource(fileName).getFile());
        int i = 0;
        try {

            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));

            while (bufferedReader.read() != -1){
                System.out.println(bufferedReader.readLine());
                i++;
            }

            System.out.println("Total Records Read : " + i);
        } catch ( FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();


        }

    }

}
