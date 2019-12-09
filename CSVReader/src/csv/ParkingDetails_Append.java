package csv;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class ParkingDetails_Append {
    private static final String SAMPLE_CSV_FILE_PATH = "Parkingdetails.csv";

    public static void main(String[] args) throws IOException  {
        try (
            Reader reader = Files.newBufferedReader(Paths.get(SAMPLE_CSV_FILE_PATH));
            CSVParser csvParser = new CSVParser(reader, CSVFormat.DEFAULT
                    .withFirstRecordAsHeader()
                    .withIgnoreHeaderCase()
                    .withTrim());
        ) {
            for (CSVRecord csvRecord : csvParser) {
                // Accessing values by Header names
                String amount = csvRecord.get("amount");
                String camera_capture = csvRecord.get("camera_capture");
                String check_in_time = csvRecord.get("check_in_time");
                String check_out_time = csvRecord.get("check_out_time");
                String MobileNum = csvRecord.get("MobileNum");
                String VehicleNum = csvRecord.get("VehicleNum");
                String VehicleType = csvRecord.get("VehicleType");
                String operator_checkin_Name = csvRecord.get("operator_checkin_Name");
                String operator_checkout_Name = csvRecord.get("operator_checkout_Name");
                String parked_hours = csvRecord.get("parked_hours");

                System.out.println("Record No - " + csvRecord.getRecordNumber());
                System.out.println("---------------");
                System.out.println("amount : " + amount);
                System.out.println("camera_capture : " + camera_capture);
                System.out.println("check_in_time : " + check_in_time);
                System.out.println("check_out_time : " + check_out_time);
                System.out.println("MobileNum : " + MobileNum);
                System.out.println("VehicleNum : " + VehicleNum);
                System.out.println("VehicleType : " + VehicleType);
                System.out.println("operator_checkin_Name : " + operator_checkin_Name);
                System.out.println("operator_checkout_Name : " + operator_checkout_Name);
                System.out.println("parked_hours : " + parked_hours);

                System.out.println("---------------\n\n");
            }
        }
    }

}
