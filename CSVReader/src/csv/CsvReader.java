package csv;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

/**
 * Simple Java program to read CSV file in Java. In this program we will read
 * list of books stored in CSV file as comma separated values.
 * 
 * @author WINDOWS 8
 *
 */
public class CsvReader {
	   public static final String delimiter = ",";
	   public static void read(String csvFile) {
	      try {
//	         File file = new File(csvFile);
//	         FileReader fr = new FileReader(file);
	         BufferedReader br = new BufferedReader(new FileReader(csvFile));

	         String line = "";
	         String[] tempArr;
	         while((line = br.readLine()) != null) {
	            tempArr = line.split(delimiter);
	            for(String tempStr : tempArr) {
	               System.out.print(tempStr + " ");
	            }
	            System.out.println();
	         }
	         br.close();
	         } catch(IOException ioe) {
	            ioe.printStackTrace();
	         }
	   }
	   public static void main(String[] args) {
	   // csv file to read
	      String csvFile = "new.csv";
	      CsvReader.read(csvFile);
	   }
	}
