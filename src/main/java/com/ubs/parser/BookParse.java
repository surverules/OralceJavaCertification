package com.ubs.parser;

import java.io.*;


public class BookParse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String filename = "/books.xml";

		File file =  new File(BookParse.class.getResource(filename).getFile());

		try {

			BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
			String line;
			while( (line = bufferedReader.readLine()) != null)
			{
				System.out.println(line);
			}

		} catch (FileNotFoundException e){

		} catch (IOException e){

		}


	}

}
