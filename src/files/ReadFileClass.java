package files;

import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.time.LocalTime;
import java.util.Arrays;
import java.util.Scanner; // Import the Scanner class to read text files
public class ReadFileClass {
    public static void main(String[] args) {
        String[] fileLines =
                getFileLines("parking_chernivtsi.csv");
boolean isFirstLine = true;
        for (String line : fileLines) {
            if (isFirstLine) {
                isFirstLine = false;
                continue;
            }
           printWorkHourStart(line);
        }
    }

    private static void printWorkHourStart(String line) {
        int position = line.indexOf(":");
        System.out.println(line);
        int startPosition = position - 2;
        int endPosition = position + 6;
        System.out.println(startPosition);
        System.out.println(endPosition);
        String workHourStart = line.substring(startPosition, endPosition);
        System.out.println(workHourStart);
        LocalTime startTime = LocalTime.parse(workHourStart);
        System.out.println(startTime.getHour());
    }
    private static String[] getFileLines(String fileName) {
      File myObj = new File(fileName);
        Scanner myReader = null;
        try {
           myReader = new Scanner(myObj);
            int lineCount = 0;
            while (myReader.hasNextLine()) {
                myReader.nextLine();
                lineCount++;
            }
            myReader.close();
// -------------------------------------------------
            myReader = new Scanner(myObj);
            String[] fileLines = new String[lineCount];
            for (int i = 0; i < fileLines.length; i++) {
                String line = myReader.nextLine();
                fileLines[i] = line;
            }
            return fileLines;
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
            return null;
        } finally {
            myReader.close();
        }
    }
}