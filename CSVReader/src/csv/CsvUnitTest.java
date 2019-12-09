package csv;


import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.util.List;


import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;
import com.fasterxml.jackson.dataformat.csv.CsvSchema.Builder;


public class CsvUnitTest {
public static void main(String[] args) throws JsonProcessingException, IOException {
	JsonNode jsonTree = new ObjectMapper().readTree(new File("C:\\Users\\user\\Parkingdetails (1).json"));
	Builder csvSchemaBuilder = CsvSchema.builder();
	JsonNode firstObject = jsonTree.elements().next();
	firstObject.fieldNames().forEachRemaining(fieldName -> {csvSchemaBuilder.addColumn(fieldName);} );
	CsvSchema csvSchema = csvSchemaBuilder.build().withHeader();
	CsvMapper csvMapper = new CsvMapper();
	csvMapper.writerFor(JsonNode.class)
	  .with(csvSchema)
	  .writeValue(new File("Parkingdetails1.csv"), jsonTree);

}
}

