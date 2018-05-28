package com.ubs.parser;

//import com.fasterxml.jackson.databind.ObjectMapper;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.DeserializationConfig;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.SerializationConfig;


import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class SampleJsonParser {

    public static void main(String[] args) {

        String filename = "sample.json";
        File file = new File(SampleJsonParser.class.getClassLoader().getResource(filename).getFile());
        try {
            InputStream inputStream = new FileInputStream(file);
            ObjectMapper objectMapper = new ObjectMapper();
            objectMapper.configure(
                    DeserializationConfig.Feature.FAIL_ON_UNKNOWN_PROPERTIES, false);
            Sample own = objectMapper.readValue(file, Sample.class);


           // System.out.println(own.getName());

        } catch (Exception e){
            e.printStackTrace();
        }


    }
}
