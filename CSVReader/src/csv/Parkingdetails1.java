package csv;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.databind.MappingIterator;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;

public class Parkingdetails1 {
	public static void main(String[] args) throws IOException {
		
	
	CsvSchema orderLineSchema = CsvSchema.emptySchema().withHeader();
	CsvMapper csvMapper = new CsvMapper();
	
	MappingIterator<Parkingdetails> orderLines = csvMapper.readerFor(Parkingdetails.class)
	  .with(orderLineSchema)
	  .readValues(new File("Parkingdetails.csv"	));
	
	new ObjectMapper()
	  .configure(SerializationFeature.INDENT_OUTPUT, true)
	  .writeValue(new File("C:\\Users\\user\\Downloads\\Parkingdetails.json"), orderLines.readAll());
}

}



