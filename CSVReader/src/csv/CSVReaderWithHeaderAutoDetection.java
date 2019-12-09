package csv;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class CSVReaderWithHeaderAutoDetection {
    private static final String SAMPLE_CSV_FILE_PATH = "sample.csv";

    public static void main(String[] args) throws IOException {
        try (
            Reader reader = Files.newBufferedReader(Paths.get(SAMPLE_CSV_FILE_PATH));
            CSVParser csvParser = new CSVParser(reader, CSVFormat.DEFAULT
                    .withFirstRecordAsHeader()
                    .withIgnoreHeaderCase()
                    .withTrim());
        ) {
            for (CSVRecord csvRecord : csvParser) {
                // Accessing values by Header names
                String ID = csvRecord.get("ID");
                String Name = csvRecord.get("Name");
                String Designation = csvRecord.get("Designation");
                String Company = csvRecord.get("Company");

                System.out.println("Record No - " + csvRecord.getRecordNumber());
                System.out.println("---------------");
                System.out.println("ID : " + ID);
                System.out.println("Name : " + Name);
                System.out.println("Designation : " + Designation);
                System.out.println("Company : " + Company);
                System.out.println("---------------\n\n");
            }
        }
    }

}
