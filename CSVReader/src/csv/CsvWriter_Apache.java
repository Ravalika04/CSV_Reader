package csv;

import org.apache.commons.csv.CSVFormat;

import org.apache.commons.csv.CSVPrinter;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class CsvWriter_Apache {
    private static final String SAMPLE_CSV_FILE = "./sample.csv";

    public static void main(String[] args) throws IOException {
        try (
            BufferedWriter writer = Files.newBufferedWriter(Paths.get(SAMPLE_CSV_FILE));

            CSVPrinter csvPrinter = new CSVPrinter(writer, CSVFormat.DEFAULT
                    .withHeader("ID", "Name", "Designation", "Company"));
        ) {
            //Writing records in the generated CSV file

            csvPrinter.printRecord("1", "Ravalika N♥", "java Developer", "cmsedge");
            csvPrinter.printRecord("2", "Divya P", "java Developer", "cmsedge");
            csvPrinter.printRecord("3", "Sarupya", "java Developer", "cmsedge");
            
            //Writing records in the form of a list
            csvPrinter.printRecord(Arrays.asList("4", "Prasad", "java Developer", "cmsedge"));

            csvPrinter.flush();            
        }
    }
}
