package csv;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class CsvWriter {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		List<List<String>> rows = Arrays.asList(
			    Arrays.asList("Ravalika", "JavaDeveloper", "Java"),
			    Arrays.asList("Divya", "AndroidDeveloper", "Android"),
			    Arrays.asList("Sarupya", "FullStackDeveloper", "Node.js")
			);

			FileWriter csvWriter = new FileWriter("new.csv");
			csvWriter.append("Name");
			csvWriter.append(",");
			csvWriter.append("Role");
			csvWriter.append(",");
			csvWriter.append("Topic");
			csvWriter.append("\n");

			for (List<String> rowData : rows) {
			    csvWriter.append(String.join(",", rowData));
			    csvWriter.append("\n");
			}

			csvWriter.flush();
			csvWriter.close();

	}

}
