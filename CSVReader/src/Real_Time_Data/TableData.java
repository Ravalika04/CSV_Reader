package Real_Time_Data;

public class TableData {
		
	void setup() {
	  
	  // Creates a new table from a csv file that uses ";" as separator and where the second line should be ignored.
	  Table table = new Table("Camera.csv", ";", new int[]{2});
	  // Reads two cell values from the table
	  final int cameraNamesColumn = table.getColumnIndex("Model");
	  final int releaseDatesColumn = table.getColumnIndex("Release date");
	  System.out.println("The first camera in the dataset is " + table.get(cameraNamesColumn, 0));
	  System.out.println(" and has been released in " + table.getInt(releaseDatesColumn, 0));

	  // Extracts a whole column as an array of integers. Use this method or getColumnAsFloats() if
	  // you need to read numerical cell values multiple times, because it is much faster than getInt() or getFloat().
	  int[] releaseDates = table.getColumnAsInts(releaseDatesColumn);
	  System.out.println("Camera release dates are between " + (releaseDates) + " and " + (releaseDates));
	  
	}
	public static void main(String[] args) {

	}

}
